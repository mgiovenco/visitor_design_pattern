
public class Processor implements ComputerElement {
    @Override
    public void accept(ComputerElementVisitor visitor) {
        visitor.visit(this);
    }
}
