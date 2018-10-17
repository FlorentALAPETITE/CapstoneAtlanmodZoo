package fr.alma;


import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Printer implements IPrint {


    public Printer() {

    }


    public void print() {
        System.out.printf("c'est moi");
    }

}
