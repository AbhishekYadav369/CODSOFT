package student.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StudentGrade {

  public int getTotalMarks(int numberSubject, Scanner scanner) {
  List<Integer> marks = new ArrayList<>();
    for (int i = 0; i < numberSubject; i++) {
      System.out.print("Enter marks for subject " + (i + 1) + " out of 100 : ");
      marks.add(scanner.nextInt());
    }
    return marks.stream()
            .reduce(0,(Integer::sum));
  }

  public String getGrade(int averagePercentage) {
    if (averagePercentage >= 90) {
      return "Grade A+";
    } else if (averagePercentage >= 80) {
      return "Grade A";
    } else if (averagePercentage >= 70) {
      return "Grade B";
    } else if (averagePercentage >= 60) {
      return "Grade C";
    } else if (averagePercentage >= 50) {
      return"Grade D";
    } else {
      return"Grade F";
    }
  }
  
}
