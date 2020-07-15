import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import aop.annotation.com.chencan.service.MyCalculator;

public class SpringAOPXMLTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springaopxml.xml");
    @Test
    public void test01() throws NoSuchMethodException {
        MyCalculator calculator = context.getBean(MyCalculator.class);
        calculator.div(1, 1);
        System.out.println(calculator.getClass());
    }
}
