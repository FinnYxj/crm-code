package com.gaocai.service.impl;
import com.gaocai.dao.StudentDao;
import com.gaocai.domain.Student;
import com.gaocai.service.StudentService;
import com.gaocai.util.SqlSessionUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

    @Override
    public Student getById(String id) {
        Student s = studentDao.getById(id);
        return s;
    }

    @Override
    public void save(Student s) {
        studentDao.save(s);
    }

    @Override
    public List<Student> getAll() {
        List<Student> sList = studentDao.getAll();
        return sList;
    }

}
