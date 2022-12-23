package service;

import model.Group;
import model.Student;

import java.util.UUID;

public class StudentService extends BaseService{
    private int index=0;
    public Student[] students;
    int anInt=0;
    @Override

    protected boolean add(Object object) {
        Student student=(Student) object;
        if (getById(student.getId())!=null){
            return false;
        }
        studentList[index++]=student;
        return true;
    }

    @Override
    protected Object  getById(UUID id) {
        for (Student student : studentList) {
            if(student!=null){
                if(student.getId().equals(id)){
                    return student;
                }
            }
        }
        return null;
    }
    public Student login(String name,Student phonNumber){
        for (Student student : studentList) {
            if(student!=null){
                if(student.getName().equals(name) && student.getPhonNumber().equals(phonNumber)){
                    return student;
                }
            }
        }
        return null;
    }
    private boolean getIsTrue(Student student){
        if(student.getPayment()<=0 || student.getIsTrue()>=3){
            return student.isAktiv(false);
        }
        return student.isAktiv(true);
    }
    public boolean addStudent(){
        for (Student student : studentList) {
            if(getIsTrue(student)){

            }
        }
        return false;
    }
}
