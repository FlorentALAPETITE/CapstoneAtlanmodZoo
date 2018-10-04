import api.IPrint;

public class Exec {
    public static void main(String[] args){
        IPrint printer;
        Factory factory = new Factory();
        int[] impls = {1, 2};

        for (int i : impls){
            printer = factory.getDependency(i);
            printer.print();
        }
    }
}
