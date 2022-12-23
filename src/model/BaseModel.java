package model;

import java.util.UUID;

public abstract class BaseModel {
    protected UUID id;
    protected String name;
    protected String phonNumber;

    public BaseModel() {
        this.id = UUID.randomUUID();
    }

    public BaseModel(String name, String phonNumber) {
        this.name = name;
        this.phonNumber = phonNumber;
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

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }
}
