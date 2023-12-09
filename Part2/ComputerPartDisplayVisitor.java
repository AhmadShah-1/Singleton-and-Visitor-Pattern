package Part2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Part2.Computer.");
    }
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Part2.Mouse.");
    }
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Part2.Keyboard.");
    }
    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Part2.Monitor.");
    }
}