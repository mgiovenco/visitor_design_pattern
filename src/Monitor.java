
public class Monitor implements ComputerElement {
    @Override
    public void accept(ComputerElementVisitor visitor) {
        visitor.visit(this);
    }
}
