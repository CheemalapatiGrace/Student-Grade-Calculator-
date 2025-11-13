import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            list.add(new Student(name, marks));
        }

        try {
            FileWriter fw = new FileWriter("grades.txt");
            for (Student s : list) {
                fw.write(s.toString() + "\n");
                System.out.println(s);
            }
            fw.close();
            System.out.println("\nSaved to grades.txt");
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }
    }
}
