package main.java.students.bobby;

public abstract class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email) {
this.firstName =  firstName;
this.lastName = lastName;
this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
    public abstract void getSummary();

}
