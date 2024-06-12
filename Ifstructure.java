import java.util.Scanner;

public class Ifstructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[] student_marks = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            student_marks[i] = scanner.nextInt();
        }

        for (int i = 0; i < student_marks.length; i++) {
            if (student_marks[i] >= 100) {
                System.out.println("First class");
            } else if (student_marks[i] >= 75) {
                System.out.println("Second class");
            } else if (student_marks[i] >= 50) {
                System.out.println("Third class");
            } else if (student_marks[i] >= 40) {
                System.out.println("Fourth class");
            } else {
                System.out.println("Failed");
            }
        }

        scanner.close();
    }
}
