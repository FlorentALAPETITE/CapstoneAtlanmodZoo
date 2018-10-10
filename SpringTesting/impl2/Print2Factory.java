public class Print2Factory implements PrinterFactory {

    @Override
    public IPrint initPrinter() {
        return Print2.init();
    }
}
