
public class Motherboard implements ComputerElement {
    @Override
    public void accept(ComputerElementVisitor visitor) {
        visitor.visit(this);
    }
}
