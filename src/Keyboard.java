
public class Keyboard implements ComputerElement {
    @Override
    public void accept(ComputerElementVisitor visitor) {
        visitor.visit(this);
    }
}
