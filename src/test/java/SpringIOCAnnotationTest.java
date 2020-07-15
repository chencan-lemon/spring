import ioc.annotation.com.chencan.controller.PersonController;
import ioc.annotation.com.chencan.controller.StudentService;
import ioc.annotation.com.chencan.controller.TeacherService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 给测试类起名字的时候不能定义成Test
 * 测试的方法不可以有参数，不可以有返回值
 */
public class SpringIOCAnnotationTest {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springiocannotation.xml");

    @Test
    public void test01() {
        PersonController personController = context.getBean("personController", PersonController.class);
        personController.save();
    }

    @Test
    public void test02() {

        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.save();

        TeacherService teacherService = context.getBean("teacherService",TeacherService.class);
        teacherService.save();
    }
}
