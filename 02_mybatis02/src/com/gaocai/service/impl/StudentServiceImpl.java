package com.gaocai.service.impl;

import com.gaocai.dao.StudentDao;
import com.gaocai.dao.impl.StudentDaoImpl;
import com.gaocai.domain.Student;
import com.gaocai.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao =  new StudentDaoImpl();

    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }
}
