package fr.insalyon.citi.golo.compiler.parser;

import java.util.List;

public class ASTFunction extends GoloASTNode {

  private List<String> arguments;
  private boolean varargs = false;

  public ASTFunction(int i) {
    super(i);
  }

  public ASTFunction(GoloParser p, int i) {
    super(p, i);
  }

  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }

  public boolean isVarargs() {
    return varargs;
  }

  public void setVarargs(boolean varargs) {
    this.varargs = varargs;
  }

  @Override
  public String toString() {
    return "ASTFunction{" +
        "arguments=" + arguments +
        ", varargs=" + varargs +
        '}';
  }

  @Override
  public Object jjtAccept(GoloParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
