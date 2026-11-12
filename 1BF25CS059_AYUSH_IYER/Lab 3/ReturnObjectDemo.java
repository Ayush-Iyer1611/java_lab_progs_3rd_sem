class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    Student compare(Student s) {

        if (this.marks > s.marks) {
            return this;
        } else {
            return s;
        }
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class ReturnObjectDemo {
    public static void main(String[] args) {

        Student s1 = new Student(85);
        Student s2 = new Student(92);

        Student result = s1.compare(s2);

        System.out.println("Student with higher marks:");
        result.display();
    }
}