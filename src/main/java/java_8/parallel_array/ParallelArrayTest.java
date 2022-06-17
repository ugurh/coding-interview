package java_8.parallel_array;

import java.util.Arrays;
import java.util.List;

public class ParallelArrayTest {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("X", 2018, 3.4),
                new Student("Z", 2022, 3.47),
                new Student("Y", 2022, 3.7),
                new Student("T", 2021, 4.0)
        );

        double bestGpa = students.parallelStream()
                .filter(s -> s.graduationYear == 2022)
                .mapToDouble(s -> s.gpa)
                .max()
                .getAsDouble();

        System.out.println("Best Student GPA: " + bestGpa);
    }

    static class Student {
        String name;
        int graduationYear;
        double gpa;

        public Student(String name, int graduationYear, double gpa) {
            this.name = name;
            this.graduationYear = graduationYear;
            this.gpa = gpa;
        }

    }
}
