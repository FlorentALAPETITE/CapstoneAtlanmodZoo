public class AppLauncher {
    public static void main(String[] args) {
        IPrint myPrint = new Print1();
        System.out.println(myPrint.getClass());

        System.out.println(myPrint.getInstance().getClass());
    }
}
