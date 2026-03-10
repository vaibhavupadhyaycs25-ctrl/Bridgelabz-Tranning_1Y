class Student {

    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {

        if(marks >= 90) return "A";
        else if(marks >= 75) return "B";
        else if(marks >= 60) return "C";
        else return "D";
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Aman";
        s.rollNumber = 1;
        s.marks = 85;

        s.display();
    }
}