package student.calculator;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentGrade studentGrade = new StudentGrade();
        System.out.print("Enter the number of subjects: ");
        int numberSubjects = scanner.nextInt();
        int totalMarks = studentGrade.getTotalMarks(numberSubjects, scanner);
        int averagePercentage = totalMarks / numberSubjects;
        System.out.print("Total Marks: " + totalMarks +" And Average Percentage: "
                + averagePercentage + "%" +" and the corresponding grade to the use is: "+
                studentGrade.getGrade(averagePercentage));


    }
}
