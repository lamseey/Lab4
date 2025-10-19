package problem5;

public class Major {
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 50;

    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount++] = s;
        } else {
            System.out.println("Cannot add more students to this major.");
        }
    }

    public Student findStudentByCNE(String cne){
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getCne().equals(cne)) {
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudentByCNE(String cne){
        // use findStudentByCNE to locate the student
        Student s = findStudentByCNE(cne);
        if (s != null) {
            // shift students to fill the gap
            int index = -1;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getCne().equals(cne)) {
                    index = i;
                    break;
                }
            }
            for (int i = index; i < studentCount - 1; i++) {
                students[i] = students[i + 1];
            }
            students[studentCount - 1] = null;
            studentCount--;
            return true;
        } else {
            return false;
        }
    }

    public double getOccupancyRate(){
        return (double) studentCount / MAX_STUDENTS * 100;
    }

    public String getStudentListAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            sb.append("CNE: ").append(s.getCne())
              .append(", Name: ").append(s.getFirstName()).append(" ").append(s.getSecondName())
              .append("\n");
        }
        return sb.toString();
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public Student[] getStudents() {
        return students;
    }
    public int getStudentCount() {
        return studentCount;
    }

    // Display all students in the major
    public void displayStudents() {
        for (int i = 0; i < studentCount; i++) {
            Student s = students[i];
            System.out.println("CNE: " + s.getCne() + ", Name: " + s.getFirstName() + " " + s.getSecondName());
        }
    }


}
