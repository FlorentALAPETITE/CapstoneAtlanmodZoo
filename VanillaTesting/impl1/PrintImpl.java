public class PrintImpl implements IPrint{
    public int value;

    public static IPrint init(){
        PrintImpl res = new PrintImpl();
        res.value = 1;
        return res;
    }

    @Override
    public int getValue(){
        return this.value;
    }
}
