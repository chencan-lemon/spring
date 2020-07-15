package ioc.annotation.com.chencan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.ioc.annotation.com.chencan.dao.PersonDao;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public void save(){
        System.out.println("personservice");
        personDao.save();
    }

}
