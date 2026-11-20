import java.util.Scanner;

public class StudentDataProcessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] students = new String[5];
        
        System.out.println("Enter five student names:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }
        
        System.out.println("\nSTUDENT DATA REPORT");
        
        System.out.println("Names Entered:");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nFormatted Names:");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].toUpperCase() + " ");
        }
        System.out.println();
        
        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            String name = students[i];
            int length = name.length();
            char firstLetter = Character.toUpperCase(name.charAt(0));
            
            System.out.println(name + " | Length: " + length + " | First Letter: " + firstLetter);
        }
        
        System.out.println("Total Students: " + students.length);
        
        scanner.close();
    }
}
