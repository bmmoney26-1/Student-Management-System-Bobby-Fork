package main.java.students.bobby;

import java.util.ArrayList;

public class Instructor extends Person {

    private String department;
    private ArrayList<Student> roster;

    public Instructor(int id, String firstName, String lastName,
                      String email, String department) {

        super(id, firstName, lastName, email);
        this.department = department;
        this.roster = new ArrayList<>();
    }

    public void addStudent(Student student) {
        roster.add(student);
    }

    public void printRoster() {

        System.out.println("Dr. " + getLastName() + "'s Roster:");

        for (Student s : roster) {
            System.out.println("  - " +
                    s.getFirstName() + " " + s.getLastName() +
                    " | Grade Level: " + s.getGradeLevel() +
                    " | GPA: " + s.getGpa());
        }
    }
    public String createAnnouncement(String message) {
        return "Announcement from Dr. " + getLastName() + ": " + message;
    }

    @Override
    public void getSummary() {
        System.out.println(
                "[Instructor] Dr. " + getFirstName() + " " + getLastName() +
                        " | Department: " + department
        );
    }
}