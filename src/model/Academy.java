package model;

public class Academy extends BaseModel {
    private String location;

    public Academy() {
        this.location = location;
    }

    public Academy(String name, String phonNumber, String location) {
        super(name, phonNumber);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
