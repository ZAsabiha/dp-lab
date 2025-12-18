import java.util.*;
class Teacher {
    private ArrayList<Observer> observers = new ArrayList<>();
    private Mediator mediator;

    public Teacher(Mediator mediator) {
        this.mediator = mediator;
    }

    public void addObserver(Observer o) {
         observers.add(o); 
        }

    public void removeObserver(Observer o) {
         observers.remove(o); 
        }

    public void announce(String msg) {
        System.out.println("Teacher Announcement: " + msg);
        for (Observer o : observers)
             o.update(msg);
    }

    public void sendToAll(String msg) {
        mediator.sendToAllStudents("Teacher", msg);
    }

    public void sendToStudent(String studentName, String msg) {
        mediator.sendToStudent("Teacher", studentName, msg);
    }

    public void receiveFromStudent(String studentName, String msg) {
        System.out.println("Teacher received from " + studentName + ": " + msg);
    }
}
