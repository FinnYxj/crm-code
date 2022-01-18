package com.gaocai.dao.impl;

import com.gaocai.dao.StudentDao;
import com.gaocai.domain.Student;
import com.gaocai.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {

    @Override
    public Student getById(String id) {
        System.out.println("调用DaoImpl的getById--------------");
        SqlSession session = SqlSessionUtil.getSession();
        Student s = session.selectOne("test1.getById",id);
        return s;

    }

    @Override
    public void save(Student s) {
        SqlSession session = SqlSessionUtil.getSession();

        session.insert("test1.save",s);

    }
}
