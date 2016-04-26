
public interface ComputerElementVisitor {
    void visit(ComputerCase computerCase);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Motherboard motherboard);

    void visit(Processor processor);

    void visit(Memory memory);

    void visit(Computer computer);
}
