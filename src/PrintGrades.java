import java.util.Scanner;
/*
* This class is for the Print Grades Assignment from Java Bootcamp
* The program prompts the user for exam scores and displays an
* appropriate grade and message.
*/
public class PrintGrades {

   public static void main(String[] args) {

      //Initialize variables
      Scanner keyboard = new Scanner(System.in);
      double exam_score = Double.MIN_VALUE;
      char grade = ' ';
      String message = " ";
      boolean more_scores;
      String response;

      //Get scores from user and display grade with message
      more_scores = true;
      do {
         System.out.print("Enter an exam score: ");        
         exam_score = Double.parseDouble(keyboard.next());
         if (exam_score >= 90) {
            grade = 'A';
            message = "Excellent job. Your grade is an 'A'";
         } else if (exam_score >= 80) {
            grade = 'B';
            message = "Good job. Your grade is an 'B'";
         } else if (exam_score >= 70) {
            grade = 'C';
            message = "Your grade is an 'C'. Try to raise your grade.";
         } else if (exam_score >= 60) {
            grade = 'D';
            message = "Your grade is an 'D'. Please see a tutor.";
         } else {
            grade = 'F';
            message = "Go back to school.";
         }
         System.out.print("Do you want to enter another score (Y/N)? ");
         response = keyboard.next();
         if (response.charAt(0) == 'N' || response.charAt(0) == 'n') {
            more_scores = false;
         }
      } while (more_scores);
   }
}
