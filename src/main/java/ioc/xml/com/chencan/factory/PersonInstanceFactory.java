package ioc.xml.com.chencan.factory;

import spring.ioc.xml.com.chencan.bean.Person;

public class PersonInstanceFactory {

    public Person getInstance(String name) {
        Person person = new Person();
        person.setId(2);
        person.setName(name);
        person.setAge(22);
        return person;
    }
}
