class Student {
    private String name;
    private String studentId;
    private String major;

    public Student(String name, String studentId) {
        this(name, studentId, "Undeclared");
    }

    public Student(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Major: " + major);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Bob Smith", "S1234");
        System.out.println("Details for student 1:");
        student1.displayDetails();

        System.out.println("\nDetails for student 2:");
        Student student2 = new Student("Alice Johnson", "S5678", "Computer Science");
        student2.displayDetails();
    }
}
