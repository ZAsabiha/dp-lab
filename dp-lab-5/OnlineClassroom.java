public class OnlineClassroom {
    public static void main(String[] args) {

        Mediator mediator = new Mediator();

        Teacher teacher = new Teacher(mediator);
        mediator.setTeacher(teacher);

        Student s1 = new Student("Sabiha", mediator, teacher);
        Student s2 = new Student("Tanzia", mediator, teacher);

        mediator.addStudent(s1);
        mediator.addStudent(s2);

        teacher.addObserver(s1);
        teacher.addObserver(s2);

        teacher.announce("exam is cancelled today");

       

        s1.sendToTeacher("when will it be rescheduled?");
        teacher.sendToStudent("Sabiha", "next week");
        teacher.sendToAll("Question will be super easy");
        s2.sendToStudent("Sabiha", "lets rest and study later");
    }
}
