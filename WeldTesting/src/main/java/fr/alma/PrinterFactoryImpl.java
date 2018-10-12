package fr.alma;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;

public class PrinterFactoryImpl implements PrinterFactory {

    //@Produces
    public IPrint createPrinter() {
        return new Printer();
    }
}
