
public class Memory implements ComputerElement {
    @Override
    public void accept(ComputerElementVisitor visitor) {
        visitor.visit(this);
    }
}
