package fr.alma;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.jboss.weld.exceptions.IllegalStateException;

import javax.enterprise.inject.se.SeContainerInitializer;

import javax.inject.Inject;

public class PrintService {

    @Inject
    IPrint printer;

    public IPrint getPrinter() {
        return printer;
    }


    private void initialize() {
        WeldContainer weld = new Weld().initialize();
        try {
            printer = weld.select(IPrint.class).get();
        } catch (IllegalStateException e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        PrintService service = new PrintService();
        service.initialize();

        IPrint print = service.getPrinter();

        print.print();
    }
}
