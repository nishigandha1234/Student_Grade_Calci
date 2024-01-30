import java.util.Scanner;

public class GradeCalculator 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        double totalPercentage = 0.0;
        
        for (int i = 1; i <= numSubjects; i++) 
        {
            System.out.print("Enter marks for Subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }

            
            totalMarks += marks;
            totalPercentage += (double) marks / 100.0;
        }
        double averagePercentage = totalPercentage / numSubjects * 100.0;

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");

        String grade = calculateGrade(averagePercentage);

       
        System.out.println("Grade: " + grade);

        
        scanner.close();
    }
    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90.0) {
            return "A";
        } else if (averagePercentage >= 80.0) {
            return "B";
        } else if (averagePercentage >= 70.0) {
            return "C";
        } else if (averagePercentage >= 60.0) {
            return "D";
        } else {
            return "F";         
        }
    }
}
 

