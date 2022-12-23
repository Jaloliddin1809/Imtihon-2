package model;


import java.util.UUID;

public class Student extends BaseModel{
    private int groupNum;
    private int isTrue;
    private boolean isAktiv;
    private double payment;
    private UUID groupId;
    public Student(String name, String phonNumber, int groupNum, int isTrue,boolean isAktiv,double payment) {
        super(name, phonNumber);
        this.groupNum = groupNum;
        this.isTrue = isTrue;
        this.isAktiv=isAktiv;
        this.payment = payment;
    }

    public Student(int groupNum, int isTrue, boolean isAktiv, double payment, UUID groupId) {
        this.groupNum = groupNum;
        this.isTrue = isTrue;
        this.isAktiv = isAktiv;
        this.payment = payment;
        this.groupId = groupId;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(int isTrue) {
        this.isTrue = isTrue;
    }

    public boolean isAktiv(boolean b) {
        return isAktiv;
    }

    public void setAktiv(boolean aktiv) {
        isAktiv = aktiv;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public boolean isAktiv() {
        return isAktiv;
    }
}
