package impl2;

import api.IPrint;

public class Print2 implements IPrint{
    @Override
    public void print() {
        System.out.println("Bonjour, je suis impl 2 !");
    }
}
