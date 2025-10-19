package problem5;

public class Test {
    public static void main(String[] args) {
        // Test all the methods coded:
        Instructor instructor = new Instructor("Mohammed", "Ayman", "1234567890",
                "mohammed.ayman@gmail.com", "20290239");
        Subject subject = new Subject(1, " CS101 ", "intro to computer science", instructor);
        System.out.println("Clean Employee Number: " + instructor.cleanEmployeeNumber());
        System.out.println("Normalized Code: " + subject.normalizedCode());
        System.out.println("Proper Title: " + subject.properTitle());
        System.out.println("Summary Line: " + instructor.summaryLine());
        System.out.println("Is Intro Course: " + subject.isIntroCourse());
        System.out.println("Card Representation:\n" + instructor.toCard());
        System.out.println("Syllabus Line: " + subject.syllabusLine());
        System.out.println("Display Name: " + instructor.displayName());


    }
}

