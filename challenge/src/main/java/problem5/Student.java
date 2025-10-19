package problem5;

public class Student extends Person {
    private String cne;
    private Major major;
    private static final Major DEFAULT_MAJOR = new Major("23", "Computer Science");

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom, telephone, email, cne, DEFAULT_MAJOR);

    }

    public String getFullNameFormatted() {
        return String.format("%s, %s", getSecondName().toUpperCase(), getFirstName());
    }

    // Getters
    public String getCne(){
        return cne;
    }
    public Major getMajor() {
        return major;
    }

    // Setters
    public void setMajor(Major major) {
        this.major = major;
    }
    public void setCne(String cne) {
        this.cne = cne;
    }


}

