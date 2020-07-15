import aop.tx.com.chencan.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

public class SpringAOPXMLTxTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springaopxmltx.xml");

    @Test
    public void test01() throws FileNotFoundException {
        BookService bean = context.getBean(BookService.class);
        bean.buyBook();
    }

    @Test
    public void test02() {
//        MultService bean = context.getBean(MultService.class);
//        bean.mult();
//        bean.buyBook();
        BookService bean = context.getBean(BookService.class);
        bean.mult();
    }
}
