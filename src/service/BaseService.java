package service;

import model.Academy;
import model.Student;
import model.Teacher;

import java.util.UUID;

public abstract class BaseService {
    protected abstract boolean add(Object object);
    protected abstract Object getById(UUID id);
    protected static Teacher[] teacherList=new Teacher[100];
    protected static Student[] studentList=new Student[500];
    protected static Academy[] academieList=new Academy[100];
}
