import Impl1.Print1;
import api.IPrint;
import impl2.Print2;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Factory {
    public IPrint getDependency(int impl) throws NotImplementedException
    {
        switch (impl) {
            case 1:
                return new Print1();
            case 2:
                return new Print2();
        }
        throw new NotImplementedException();
    }
}
