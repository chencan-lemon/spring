package ioc.annotation.com.chencan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import spring.ioc.annotation.com.chencan.dao.BaseDao;

public class BaseService<T> {

    @Autowired
    private BaseDao<T> baseDao;

    public void save(){
        baseDao.save();
    }
}
