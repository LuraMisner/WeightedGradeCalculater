import java.util.*;

public class Grades {

   /* Calculates the final class grade given various assignment grades and their weights.
      
      @param homeworkP    the weight of homework assignments on the overall grade.
      @param examP        the weight of exam assignments on the overall grade.
      @param attendanceP  the weight of attendance on the overall grade.
      @param otherP       the weight of other assignments on the overall grade.
      @param assign       list of assignments.
    */
   public static void Grades (int homeworkP, int examP, int attendanceP, int otherP, Assignment[] assign) {
      // Seperate assignments list by category 
      ArrayList<Double> allHomework = new ArrayList<>();
      ArrayList<Double> allExam = new ArrayList<>();
      ArrayList<Double> allAttendance = new ArrayList<>();
      ArrayList<Double> allOther = new ArrayList<>();
      
      for (int i=0; i<assign.length; ++i) {
         if (assign[i].assignmentType == Assignment.AssignmentTypes.Homework) { 
            allHomework.add(assign[i].assignmentGrade);
         } else if (assign[i].assignmentType == Assignment.AssignmentTypes.Exam) { 
            allExam.add(assign[i].assignmentGrade);
         } else if (assign[i].assignmentType == Assignment.AssignmentTypes.Attendance) {
            allAttendance.add(assign[i].assignmentGrade);
         } else {
            allOther.add(assign[i].assignmentGrade);
         }
      }

      // Calculate the overall weighted grade 
      double weightedGrade = (Calculate_Sum(allHomework)/allHomework.size() * (homeworkP/100.00)) + (Calculate_Sum(allExam)/allExam.size()* (examP/100.00)) +
       (Calculate_Sum(allAttendance)/allAttendance.size() * (attendanceP/100.00)) + (Calculate_Sum(allOther)/allOther.size() * (otherP/100.00));
      
      System.out.printf("Weighted grade: %.2f ", weightedGrade);
   
   }
   

   public static double Calculate_Sum(ArrayList<Double> list) {
      int sum = 0;
      for (int i=0; i<list.size(); ++i) {
         sum += list.get(i);
      }
      
      return sum;
   }
}