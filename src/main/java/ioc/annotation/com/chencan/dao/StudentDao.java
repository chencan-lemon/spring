package ioc.annotation.com.chencan.dao;

import org.springframework.stereotype.Repository;
import spring.ioc.annotation.com.chencan.bean.Student;

@Repository
public class StudentDao extends BaseDao<Student> {
    public void save() {
        System.out.println("保存学生");
    }
}
