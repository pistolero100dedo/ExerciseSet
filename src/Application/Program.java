package Application;

import Entities.Classes;
import Entities.Students;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Classes> set = new HashSet<>();

        int className = -1;

        for (int i = 0; i < Classes.getClasses().length; i++) {
            className++;
            String course = Classes.getClasses()[className];
            System.out.print("How many students for course " + course + ": ");
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int studentId = sc.nextInt();

                set.add(new Classes(studentId));
            }

        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
