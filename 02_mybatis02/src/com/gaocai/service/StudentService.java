package com.gaocai.service;

import com.gaocai.domain.Student;

public interface StudentService {
    public Student getById(String id);

    public void save(Student s);
}
