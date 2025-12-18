class Student implements Observer {
    private String name;
    private Mediator mediator;
    private Teacher teacher;   

    public Student(String name, Mediator mediator, Teacher teacher) {
        this.name = name;
        this.mediator = mediator;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    
    @Override
    public void update(String msg) {
        System.out.println(name + " got announcement: " + msg);
    }

    
    public void sendToTeacher(String msg) {
        mediator.sendToTeacher(name, msg);
        
        teacher.receiveFromStudent(name, msg);
    }

    public void sendToStudent(String studentName, String msg) {
        mediator.sendToStudent(name, studentName, msg);
    }
}
