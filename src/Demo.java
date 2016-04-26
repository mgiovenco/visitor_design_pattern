
public class Demo {
    public static void main(String[] args) {
        ComputerElement computer = new Computer();
        computer.accept(new ComputerElementPrintVisitor());
    }
}
