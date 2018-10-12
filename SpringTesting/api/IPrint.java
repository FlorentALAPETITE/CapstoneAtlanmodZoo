import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public interface IPrint {

    @Autowired
    IPrint printerInstance = new ClassPathXmlApplicationContext("inject.xml").getBean(PrinterFactory.class).initPrinter(); 

    public IPrint getInstance();

}
