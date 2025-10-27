package zadanie_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        Map<String, Double> grades1 = new HashMap<>();
        grades1.put("Math", 4.0);
        grades1.put("Physics", 3.5);
        students.add(new Student("Иван", "Группа1", 1, grades1));

        Map<String, Double> grades2 = new HashMap<>();
        grades2.put("Math", 2.0);
        grades2.put("Physics", 2.5);
        students.add(new Student("Мария", "Группа1", 1, grades2));

        Map<String, Double> grades3 = new HashMap<>();
        grades3.put("Math", 3.0);
        grades3.put("Physics", 3.0);
        students.add(new Student("Петр", "Группа2", 2, grades3));

        StudentUtils.removeStudentsBelowAverage(students);

        StudentUtils.promoteStudents(students);

        StudentUtils.printStudents(students, 2);
    }
}
