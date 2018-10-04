public class AppLauncher {
    public static void main(String[] args) {
        IPrint myInstance = IPrint.printerInstance;
        System.out.println(myInstance.getValue());
    }
}
