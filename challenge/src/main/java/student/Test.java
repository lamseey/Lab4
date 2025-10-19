package student;

public class Test {
    public static void main(String[] args) {
        // Display computer science students
        Major artMajor = new Major("01", "Arts");
        Major csMajor = new Major("23", "Computer Science");
        Student student1 = new Student("Ahmed", "Amine", "0612345678", "ahmed.amine@gmail.com", "24775544", artMajor);
        Student student2 = new Student("Safi", "Amal", "0698765432", "sara.laila@gmail.com", "22885676", csMajor);
        Student student3 = new Student("Alami", "Samir", "0611223344", "alami.samir@gmail.com", "23585976", csMajor);
        System.out.println("Students in Computer Science Major:");
        csMajor.displayStudents();
        System.out.println("Finding student with CNE 22885676: ");
        Student foundStudent = csMajor.findStudentByCNE("22885676");
        if (foundStudent != null) {
            System.out.println("Found: " + foundStudent.getFullNameFormatted());
        } else {
            System.out.println("Student not found.");
        }
        csMajor.removeStudentByCNE("23585976");
        System.out.println("Students in Computer Science Major after removing the student with CNE 23585976:");
        csMajor.displayStudents();
        System.out.println("Student N1 formatted name: ");
        System.out.println(student1.getFullNameFormatted());
        System.out.println("Computer science capacity: "+ 50);
        System.out.println("Current enrollment: " + csMajor.getStudentCount());
        System.out.println("Occupancy rate: " + ((csMajor.getStudentCount() / 50.0) * 100) + "%");
        System.out.println("Student list as string: ");
        System.out.println(csMajor.getStudentListAsString());

    }
}

