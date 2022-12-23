package service;

import model.Academy;
import model.Group;
import model.Student;

import javax.swing.*;
import java.util.UUID;

public class AcademyService extends BaseService{

    private int index=0;
    @Override
    protected boolean add(Object object) {
        Academy academy=(Academy) object;
        if(getById(academy.getId())!=null){
            return false;
        }
        academieList[index++]=academy;
        return true;
    }
    @Override
    protected Object getById(UUID id) {
        for (Academy academy : academieList) {
            if(academy!=null){
                if(academy.getId().equals(id)){
                    return academy;
                }
            }
        }
        return null;
    }
    public void getAcademiList(Student student){
        if(getById(student.getId())!=null){
        for(Academy academy:academieList){
            if(academy!=null) {
                System.out.println("Academy name:" + academy.getName());
                System.out.println("Academy location:" + academy.getLocation());
                System.out.println("Academy telephon:" + academy.getPhonNumber());
                }
            }
        }
    }


}