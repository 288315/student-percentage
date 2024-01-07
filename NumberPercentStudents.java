import java.util.Scanner;

public class NumberPercentStudents {
    public static void main(String[] args) {

        double maleStudents,
               femaleStudents,
               totalStudents,
               malePercent,
               femalePercent;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of males: ");
        maleStudents = in.nextInt();

        System.out.print("Enter the number of females: ");
        femaleStudents = in.nextInt();
        
        totalStudents = maleStudents + femaleStudents;
        malePercent = ((maleStudents / totalStudents) * 100);
        femalePercent = ((femaleStudents / totalStudents) * 100);
        
        System.out.println("Number of students = " + totalStudents);
        System.out.printf("Male percentage = %.2f", malePercent);
        System.out.printf("\n");
        System.out.printf("Female percentage = %.2f", femalePercent);
    }
}
