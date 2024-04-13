package org.example.airlines;

public abstract class User {
    private String name;
    private String email;
    private int age;
    private String phone;
    private String id;

    public abstract void displayInfo();

    public User() {
        this.name = "";
        this.email = "";
        this.age = 0;
        this.phone = "";
        this.id = "";
    }

    public User(String name, String email, int age, String phone, String id) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }
}
