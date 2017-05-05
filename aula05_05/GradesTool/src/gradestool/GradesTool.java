package gradestool;

import java.util.Scanner;

public class GradesTool {

    public static void main(String[] args) throws Exception {
        float percentage[] = {0.35f, 0.15f, 0.5f};
        float gradeP1, gradeHomeWork, gradeP2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a P1 grade: ");
        gradeP1 = scan.nextFloat();
        System.out.print("Enter a Home Work grade: ");
        gradeHomeWork = scan.nextFloat();
        System.out.print("Enter a P2 grade: ");
        gradeP2 = scan.nextFloat();
        
        float[] grades = {gradeP1, gradeHomeWork, gradeP2};
        
        GradesCalc.gradeListIsValid(grades);
        
        float finalGrade = GradesCalc.calcFinalGrade(grades, percentage);
        
        System.out.println("Final grade: " + finalGrade);
        
        if (GradesCalc.isApproved(finalGrade))
            System.out.println("Approved");
        else
            System.out.println("Reproved");
    }    
}
