package Part2;

import Part2.Computer;
import Part2.Keyboard;
import Part2.Monitor;
import Part2.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
