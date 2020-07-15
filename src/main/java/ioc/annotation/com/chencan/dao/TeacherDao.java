package ioc.annotation.com.chencan.dao;

import org.springframework.stereotype.Repository;
import spring.ioc.annotation.com.chencan.bean.Teacher;

@Repository
public class TeacherDao extends BaseDao<Teacher>{
    public void save() {
        System.out.println("保存老师");
    }
}
