package main.java.students.bobby;
import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {














      ArrayList<Student>Students=new ArrayList<>();
      Students.add(new Student("Samantha", "Higgins", "samantha.higgins@school.edu", 12, 3.8));
      Students.add(new Student("Charles", "Turner", "charles.turner@school.edu", 12, 3.7));
      Students.add(new Student("Jacob", "Westly", "jacob.westly@school.edu", 12, 3.9));
      Students.add(new Student("Hector", "Dawson", "hector.dawson@school.edu", 9, 3.1));
      Students.add(new Student("Hannah", "Royal", "hannah.royal@school.edu", 9, 3.7));
      Students.add(new Student("Zachary", "Fredrick", "zachary.fredrick@school.edu", 9, 2.9));
      Students.add(new Student("Taylor", "Phillips", "taylor.phillips@school.edu", 10, 3.6));
      Students.add(new Student("Billy", "Johnson", "billy.johnson@school.edu", 10, 3.3));
      Students.add(new Student("Luthor", "Wanderlei", "luthor.wanderlei@school.edu", 10, 3.65));
for (Student s : Students){
    s.getSummary();
}


    }
}
