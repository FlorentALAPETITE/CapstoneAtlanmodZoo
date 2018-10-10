import org.reflections.Reflections;

import java.util.Set;

public interface IPrint {
    //IPrint printerInstance = PrintImpl.init();

    Reflections reflections = new Reflections("");
    Set<Class<? extends IPrint>> classes = reflections.getSubTypesOf(IPrint.class);

    public int getValue();
}
