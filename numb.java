abstract class Student {
     String name;
     int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public abstract void mark();
}

class CIA extends Student {
     int ciaMarks;

    public CIA(String name, int rollNumber, int ciaMarks) {
        super(name, rollNumber);
        this.ciaMarks = ciaMarks;
    }
    public void mark() {
        System.out.println("CIA Marks of " + name + " (Roll Number: " + rollNumber + "): " + ciaMarks);
    }
}

class Semester extends Student {
    private int semesterMarks;

    public Semester(String name, int rollNumber, int semesterMarks) {
        super(name, rollNumber);
        this.semesterMarks = semesterMarks;
    }

    public void mark() {
        System.out.println("Semester Marks of " + name + " (Roll Number: " + rollNumber + "): " + semesterMarks);
    }
}

public class numb {
    public static void main(String args[]){
        CIA student1 = new CIA("John", 101, 85);
        Semester student2 = new Semester("Alice", 102, 70 );
        student1.mark();
        student2.mark();
    }
    
}

