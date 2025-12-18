import java.util.*;

class Mediator {
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<>();

    public void setTeacher(Teacher t) { 
        teacher = t;
     }

    public void addStudent(Student s) { 
        students.add(s);
     }

    public void sendToTeacher(String from, String msg) {
        System.out.println("this is the message from student to teacher =="+ " "+msg);
    }

    public void sendToAllStudents(String from, String msg) {
         System.out.println("this is the message for all students =="+ " "+msg);
    }

    public void sendToStudent(String from, String studentName, String msg) {
        System.out.println(from + " ==" + studentName + ": " + msg);
    }
}
