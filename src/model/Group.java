package model;

import java.util.UUID;

public class Group {
    private UUID id;
    private String name;
    private int num;
    private UUID acadId;//Bu qaysi academiyada ekanligini bilish uchun


    public Group(UUID id) {
        this.id = UUID.randomUUID();
    }

    public Group(String name, int num, UUID acadId) {
        this.name = name;
        this.num = num;
        this.acadId = acadId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public UUID getAcadId() {
        return acadId;
    }

    public void setAcadId(UUID acadId) {
        this.acadId = acadId;
    }

}
