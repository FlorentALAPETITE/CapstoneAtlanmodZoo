import org.springframework.stereotype.Service;

@Service
public class Print1Factory implements PrinterFactory {

    @Override
    public IPrint initPrinter() {
        return Print1.init();
    }
}
