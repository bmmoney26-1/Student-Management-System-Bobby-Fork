package main.java.students.bobby;

public class Student extends Person{
    private int gradeLevel;
    private double gpa;

    public Student(String firstName, String lastName, String email, int gradeLevel, double gpa){
    super(firstName, lastName, email);
this.gpa=gpa;
this.gradeLevel= gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isOnHonorRoll() {
        return gpa >= 3.5;
    }
    @Override
   public void getSummary(){
    System.out.println("[Student] " + getFirstName() + " " + getLastName() + " | " + "Grade Level: " + gradeLevel
            + " | " + "GPA: " + gpa + " | " + "Honor Roll: " + (isOnHonorRoll() ? "Yes" : "No"));

    }



}
