
public class Computer implements ComputerElement {
    ComputerElement[] computerElements;

    public Computer() {
        this.computerElements = new ComputerElement[]{
                new Keyboard(),
                new Monitor(),
                new Motherboard(),
                new Processor(),
                new Memory(),
                new ComputerCase()
        };
    }

    @Override
    public void accept(ComputerElementVisitor visitor) {
        for (ComputerElement computerElement : computerElements) {
            computerElement.accept(visitor);
        }
        visitor.visit(this);
    }
}
