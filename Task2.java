import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = getNumberOfSubjects(scanner);
        int[] marks = getMarks(scanner, numSubjects);

        int totalMarks = calculateTotal(marks);
        double average = calculateAverage(totalMarks, numSubjects);
        char grade = calculateGrade(average);

        displayResult(totalMarks, average, grade);

        scanner.close();
    }

    
    public static int getNumberOfSubjects(Scanner scanner) {
        System.out.print("Enter the number of subjects: ");
        return scanner.nextInt();
    }


    public static int[] getMarks(Scanner scanner, int numSubjects) {
        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; ) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            int input = scanner.nextInt();
            if (input < 0 || input > 100) {
                System.out.println("Invalid mark. Please enter between 0 and 100.");
            } else {
                marks[i] = input;
                i++;
            }
        }
        return marks;
    }


    public static int calculateTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

   
    public static double calculateAverage(int total, int numSubjects) {
        return (double) total / numSubjects;
    }

   
    public static char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else if (average >= 50) return 'E';
        else return 'F';
    }

   
    public static void displayResult(int total, double average, char grade) {
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }
}
