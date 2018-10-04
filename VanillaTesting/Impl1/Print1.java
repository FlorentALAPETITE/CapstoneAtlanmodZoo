package Impl1;

import api.IPrint;

public class Print1 implements IPrint{
    @Override
    public void print() {
        System.out.println("Coucou, je suis impl 1 !");
    }
}
