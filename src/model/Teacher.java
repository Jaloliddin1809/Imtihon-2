package model;

public class Teacher extends BaseModel{
    private double salary;
    private int groupNum;
    private double experience;


    public Teacher(String name, String phonNumber,int groupNum, double salary, double experience) {
        super(name, phonNumber);
        this.groupNum=groupNum;
        this.salary = salary;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }
}
