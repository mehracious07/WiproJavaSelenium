package LabSession24July;

abstract class Student {
    String name;
    String rollNo;
    int totalMarks;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void getGrade() {
        if (totalMarks >= 91 && totalMarks <= 100) {
            System.out.println("Grade A+");
        } else if (totalMarks >= 81 && totalMarks <= 90) {
            System.out.println("Grade A");
        } else if (totalMarks >= 71 && totalMarks <= 80) {
            System.out.println("Grade B");
        } else {
            System.out.println("Not qualified");
        }
    }

    public abstract void calculateTotalMarks();
}

class EngineeringStudent extends Student {
    int english, hindi, maths, socialScience;

    public EngineeringStudent(String name, String rollNo, int english, int hindi, int maths, int socialScience) {
        super(name, rollNo);
        this.english = english;
        this.hindi = hindi;
        this.maths = maths;
        this.socialScience = socialScience;
        calculateTotalMarks();
    }

    @Override
    public void calculateTotalMarks() {
        this.totalMarks = english + hindi + maths + socialScience;
    }
}

class MedicalStudent extends Student {
    int biology, chemistry, physics, english;

    public MedicalStudent(String name, String rollNo, int biology, int chemistry, int physics, int english) {
        super(name, rollNo);
        this.biology = biology;
        this.chemistry = chemistry;
        this.physics = physics;
        this.english = english;
        calculateTotalMarks();
    }

    @Override
    public void calculateTotalMarks() {
        this.totalMarks = biology + chemistry + physics + english;
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
        EngineeringStudent engStudent = new EngineeringStudent("Ravi", "ENG123", 85, 75, 90, 80);
        System.out.println("Engineering Student: " + engStudent.name);
        engStudent.getGrade();

        MedicalStudent medStudent = new MedicalStudent("Priya", "MED456", 88, 79, 85, 80);
        System.out.println("Medical Student: " + medStudent.name);
        medStudent.getGrade();
    }
}
