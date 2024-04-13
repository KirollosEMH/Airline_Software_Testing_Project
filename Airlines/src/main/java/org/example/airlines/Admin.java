package org.example.airlines;

public class Admin extends User {
    private  String password;

    public Admin() {
     super();
    }
    public Admin(String name, String email, int age, String phone, String id, String password) {
        super(name, email, age, phone, id);
        this.password = password;
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
        System.out.println("Admin Age: " + getAge());
        System.out.println("Admin Phone: " + getPhone());
        System.out.println("Admin ID: " + getId());
        System.out.println("Admin Password: " + password);
    }
}
