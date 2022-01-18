package com.gaocai.dao;

import com.gaocai.domain.Student;

public interface StudentDao {
    public Student getById(String id);

    public void save(Student s);
}
