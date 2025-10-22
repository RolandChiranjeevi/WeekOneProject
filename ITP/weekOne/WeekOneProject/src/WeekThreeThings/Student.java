package WeekThreeThings;

public class Student {
    private String studentName;
    private int studentClass;

    public Student(String studentName, int studentClass) {
        this.studentName = studentName;
        this.studentClass = studentClass;
    }
public void getPromoted(int years) {
        studentClass += years;
    }
public static String stadie(int studentClass) {
  if (studentClass >=1 && studentClass <=3) {
      return "lågstadiet";
  } else if(studentClass>=4 && studentClass<=6) {
      return "mellanstadiet";
  } else if(studentClass>=7 && studentClass<=9) {
      return "högstadiet";
  } else if (studentClass>=10 && studentClass<=12) {
      return "gymnasie";
  } else {
      return "Felaktigt val, ange en årskurs mellan 1-12";
  }
}

public String getStudentName() {
        return studentName;
}

public int getStudentClass(){
        return studentClass;
}


}
