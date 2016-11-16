package encapsulation;

public class PrinterTest {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setModel("Epson");
        printer.setColor(PrinterColor.COLORFUL);
        printer.switchOn();

        printer.info();
        printer.printText("Hello World");
    }
}
