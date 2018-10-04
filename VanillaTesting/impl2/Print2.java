public class Print2 implements IPrint{
    private final int VALUE = 2;

    public static IPrint init(){
        Print2 res = new Print2();
        return res;
    }

    @Override
    public IPrint getInstance(){
        return this.printerInstance;
    }
}
