import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import aop.annotation.com.chencan.service.Calculator;

public class SpringAOPAnnotationTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springaopxml.xml");

    @Test
    public void test01() throws NoSuchMethodException {
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(1,1);
        System.out.println(calculator.getClass());
    }
}
