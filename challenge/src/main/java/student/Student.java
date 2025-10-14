package main.java.student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone, email);
        this.cne = cne;
        this.major = major;

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        super(nom, prenom, telephone, email);
        this.cne = cne;

    }

    // Getters


    // Setters


}

