package service;

import model.Teacher;

import java.util.UUID;

public class TeacherService extends BaseService {
    private int index=0;
    @Override
    protected boolean add(Object object) {
        Teacher teacher=(Teacher) object;
        if(getById(teacher.getId())!=null){
            return false;
        }
        teacherList[index++]=teacher;
        return true;
    }

    @Override
    protected Object getById(UUID id) {
        for (Teacher teacher:teacherList){
            if(teacher!=null){
                if(teacher.getId().equals(id)){
                    return teacher;
                }
            }
        }
        return null;
    }

}
