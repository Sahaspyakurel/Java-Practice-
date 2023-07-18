class Student {
    String name;
    int age;
    double marks;

    public Student(String n, int a, double m) {
        name = n;
        age = a;
        marks = m;

    }

    void display() {
        System.out.println("Name: " + name + "  Age: " + age + "   Marks: " + marks);

    }

    double getpercent() {
        return (marks / 3);
    }

}

public class Studentdemo {
    public static void main(String[] args) {
        Student s = new Student("Sunil", 22, 45.5);
        s.display();
        Student p = new Student("Ramhari", 21, 50.5);
        p.display();
        double score = p.getpercent();
        System.out.println("Percentage: " + score);

    }

}
