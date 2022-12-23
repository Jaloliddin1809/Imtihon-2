package service;

import model.Academy;
import model.Group;
import model.Student;

import java.util.UUID;

public class GroupService {
    private int index=0;
    private int index1=0;
    public Group[] groupList=new Group[100];
    public Student[] studentList1;

    public boolean addGroup(String name, int num, UUID acadId){
        for (Group group : groupList) {
            if(group!=null){
                if(group.getAcadId().equals(acadId)){
                    return false;
                }
            }
        }
        groupList[index++]=new Group(name,num,acadId);
            return true;
    }
    public void getGroupList(Academy academy){
        for(Group group:groupList){
            if(group!=null){
                if(group.getAcadId().equals(academy.getId())){
                    System.out.println("Group name:"+group.getName());
                    System.out.println("Group num:"+group.getNum());
                }
            }
        }
    }



}
