package skillbuilders;

import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        
        System.out.print("Enter the number of students in the class: ");
        int numStudents = userinput.nextInt();
        userinput.nextLine(); 

        
        String[] students = new String[numStudents];

        
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter student " + (i + 1) + "'s name: ");
            students[i] = userinput.nextLine();
        }

        
        System.out.println("\nStudent Roster");
        for (String student : students) {
            System.out.println(student);
        }

        userinput.close();
    }
}
