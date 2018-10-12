package fr.alma;


import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;

public class Printer implements IPrint {


    public Printer() {

    }


    public void print() {
        System.out.printf("c'est moi");
    }
}
