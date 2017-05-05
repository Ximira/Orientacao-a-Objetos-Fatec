package gradestool;

public class GradesCalc {
    
    public static boolean isApproved(float finalGrade) {
        return finalGrade >= 6;
    }
    
    public static float calcFinalGrade(float[] grades, float[] percentages) throws Exception {
        checkListlength(grades, percentages);
        checkPercentace(percentages);
        
        float grade, finalGrade = 0;
        for (int count = 0; count < grades.length; count++) {
            grade = grades[count] * percentages[count];
            finalGrade += grade;
        }
        
        return finalGrade;
    }
    
    public static void gradeListIsValid(float[] grades) throws Exception {
        for (float grade : grades)
            if (grade < 0 || grade > 10)
                throw new Exception("Invalid grade " + grade);
    }
    
    private static void checkListlength(float[] grades, float[] percentages) throws Exception {
        if (grades.length != percentages.length)
            throw new Exception("The grade list and percentage list did not match");
    }
    
    private static void checkPercentace(float[] percentage) throws Exception {
        float total = 0;
        
        for (float num : percentage)
            total += num;
        
        if (total != 1)
            throw new Exception("The total percentace is diferent them 1");
    }
}
