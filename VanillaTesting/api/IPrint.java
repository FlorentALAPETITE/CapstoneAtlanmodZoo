public interface IPrint {
    IPrint printerInstance = PrintImpl.init();

    public int getValue();
}
