package problem5;

public class Instructor extends Person {
    private String employeeNumber;
    private Subject[] subjectsTaught;
    private final int MAX_SUBJECTS = 10;
    public Instructor(String firstName, String secondName, String telephone, String email, String employeeNumber) {
        super(firstName, secondName, telephone, email);
        this.employeeNumber = employeeNumber;
        this.subjectsTaught = new Subject[MAX_SUBJECTS];
    }
    // Getter
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void addSubject(Subject subject) {
        for (int i = 0; i < MAX_SUBJECTS; i++) {
            if (subjectsTaught[i] == null) {
                subjectsTaught[i] = subject;
                return;
            }
        }
        System.out.println("Cannot add more subjects to this instructor.");
    }

    public String cleanEmployeeNumber() {
        StringBuilder cleaned = new StringBuilder();
        for (int i = 0; i < employeeNumber.length(); i++) {
            char c = employeeNumber.charAt(i);
            if (c != ' ') {
                cleaned.append(c);
            }
        }
        return cleaned.toString();
    }
    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", cleanEmployeeNumber(), getSecondName(), getFirstName());
    }

    public String toCard(){
        return String.format("Instructor\n----------\nEmployee #: %s\nName : %s, %s\nEmail : %s\nPhone : %s",
                cleanEmployeeNumber(), getSecondName(), getFirstName(), getEmail(), getPhone());
    }

    public String displayName(){
        StringBuilder display = new StringBuilder();
        if (firstName == null || firstName.isEmpty()) {
            display.append(secondName);
        } else if (secondName == null || secondName.isEmpty()) {
            display.append(firstName);
        } else {
            display.append(firstName).append(" ").append(secondName);
        }
        return display.toString();
    }
}
