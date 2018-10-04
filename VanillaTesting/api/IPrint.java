public interface IPrint {
    IPrint printerInstance = Print1.init();

    public IPrint getInstance();
}
