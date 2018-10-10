public class Print1 implements IPrint{
    private final int VALUE = 1;

    public static IPrint init(){
        Print1 res = new Print1();
        return res;
    }

    @Override
    public IPrint getInstance(){
        return this.printerInstance;
    }

}
