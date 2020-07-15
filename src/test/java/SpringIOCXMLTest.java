import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.ioc.xml.com.chencan.bean.Person;

public class SpringIOCXMLTest {
    public static void main(String[] args) {
        /**
         * IOC容器中的person对象是什么时候创建的？
         * 在容器创建完成之前就已经把对象创建好了
         *
         * ApplicationContext：IOC容器的入口，想要获取对象，必须要创建该类
         * 该类有2个读取配置文件的实现类
         *  ClassPathXmlApplicationContext:从classpath中读取数据
         *  FileSystemXmlApplicationContext:从当前文件系统读取数据
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("springioc.xml");

        System.out.println("=======================根据bean标签的id来获取对象================================");
        //根据bean标签的id来获取对象
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        System.out.println("========================bean之间的继承关系======================================");
        Person child = context.getBean("parent", Person.class);
        System.out.println(child);

        System.out.println("========================spring管理第三方bean======================================");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);

        System.out.println("========================spring中的自动装配======================================");
        Person person1 = context.getBean("personWire", Person.class);
        System.out.println(person1);
    }
}
