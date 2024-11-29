import java.util.ArrayList;

class Student {
    private String name;
    private int id;
    private ArrayList<Integer> grades;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    // Method to add a grade
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
        }
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find the highest grade
    public int findHighestGrade() {
        if (grades.isEmpty()) return 0;

        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public int findLowestGrade() {
        if (grades.isEmpty()) return 0;

        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    // Method to display the grade report
    public void displayGradeReport() {
        System.out.println("\nGrade Report for Student: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverage());
        System.out.println("Highest Grade: " + findHighestGrade());
        System.out.println("Lowest Grade: " + findLowestGrade());
    }

    public static void main(String[] args) {
        // Test with multiple students
        Student student1 = new Student("suhail mumtaz", 101);
        student1.addGrade(85);
        student1.addGrade(92);
        student1.addGrade(76);

        Student student2 = new Student("anan", 102);
        student2.addGrade(88);
        student2.addGrade(90);
        student2.addGrade(95);

        Student student3 = new Student("inayat ", 103);
        student3.addGrade(70);
        student3.addGrade(65);
        student3.addGrade(80);

        // Display grade reports
        student1.displayGradeReport();
        student2.displayGradeReport();
        student3.displayGradeReport();
    }
}