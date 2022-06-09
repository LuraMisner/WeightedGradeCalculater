
class Main {
   public static void main (String args[]) {
      // Create some assignments
      Assignment a1 = new Assignment(Assignment.AssignmentTypes.Homework, 85.00);
      Assignment a2 = new Assignment(Assignment.AssignmentTypes.Homework, 70.00);
      Assignment a3 = new Assignment(Assignment.AssignmentTypes.Homework, 100.00);
      Assignment a4 = new Assignment(Assignment.AssignmentTypes.Exam, 90.00);
      Assignment a5 = new Assignment(Assignment.AssignmentTypes.Attendance, 100.00);
      Assignment a6 = new Assignment(Assignment.AssignmentTypes.Attendance, 0.00);
      Assignment a7 = new Assignment(Assignment.AssignmentTypes.Other, 100.00);
      Assignment a8 = new Assignment(Assignment.AssignmentTypes.Other, 90.00);
      
      Assignment[] assignmentList = {a1, a2, a3, a4, a5, a6, a7, a8};
      
      
      // Calculate the grade for (Homework: 30%, Exam: 50%, Attendance: 10%, Other: 10%)
      Grades.Grades(30, 50, 10, 10, assignmentList);
   }
}