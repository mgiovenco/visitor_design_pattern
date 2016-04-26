
public class ComputerElementPrintVisitor implements ComputerElementVisitor {

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visiting Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visiting Monitor");
    }

    @Override
    public void visit(Motherboard motherboard) {
        System.out.println("Visiting Motherboard");
    }

    @Override
    public void visit(Processor processor) {
        System.out.println("Visiting Processor");
    }

    @Override
    public void visit(Memory memory) {
        System.out.println("Visiting Memory");
    }

    @Override
    public void visit(ComputerCase computerCase) {
        System.out.println("Visiting ComputerCase");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Visiting Computer");
    }
}
