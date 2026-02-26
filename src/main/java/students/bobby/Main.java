package students.bobby;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Student s1 = new Student(1, "Joseph", "Turner",
                "joseph.Turner@school.edu", 10, 3.65);

        Student s2 = new Student(2, "Matthew", "Johnson",
                "marcus.brown@school.edu", 10, 3.4);

        Instructor drFelipe = new Instructor(100,
                "Felipe", "Hernandez",
                "fh@gmail.com", "Computer Science");

        drFelipe.addStudent(s1);
        drFelipe.addStudent(s2);

        people.add(s1);
        people.add(s2);
        people.add(drFelipe);

        //  Polymorphism in action
        for (Person p : people) {
            p.getSummary();
        }

        System.out.println();
        drFelipe.printRoster();
        System.out.println();
        System.out.println(drFelipe.createAnnouncement("Your project is due Tuesday."));
    }
}