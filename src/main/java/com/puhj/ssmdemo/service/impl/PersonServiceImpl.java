package com.puhj.ssmdemo.service.impl;

import com.puhj.ssmdemo.dao.PersonDao;
import com.puhj.ssmdemo.entity.Person;
import com.puhj.ssmdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("personServiceImpl")
public class PersonServiceImpl implements PersonService {

    @Qualifier("personDao")
    @Autowired
    private PersonDao personDao;

    @Override
    public void add(Person person) {
        personDao.insert(person);
    }

    @Override
    public void remove(Integer id) {
        personDao.delete(id);
    }

    @Override
    public void edit(Person person) {
        personDao.update(person);
    }

    @Override
    public Person get(Integer id) {
        return personDao.select(id);
    }

    @Override
    public List<Person> getAll() {
        return personDao.selectAll();
    }
}
