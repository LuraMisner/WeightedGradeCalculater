
public class Assignment {
   public static enum AssignmentTypes {
      Homework,
      Exam,
      Attendance,
      Other
   }
   
   AssignmentTypes assignmentType;
   Double assignmentGrade;
   
   public Assignment (AssignmentTypes type, Double grade) {
      assignmentType = type;
      assignmentGrade = grade;
   }
}

