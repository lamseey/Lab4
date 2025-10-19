package problem5;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject(int id, String code, String title, Instructor instructor) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.instructor = instructor;
        instructor.addSubject(this);
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public String getTitle() {
        return title;
    }

    public String normalizedCode(){
        return code.trim().toUpperCase();
    }

    public String properTitle(){
        StringBuilder proper = new StringBuilder();
        for (int i = 0; i < title.length(); i++) {
            char c = title.charAt(i);
            if (i == 0 || title.charAt(i - 1) == ' ') {
                proper.append(Character.toUpperCase(c));
            } else {
                proper.append(Character.toLowerCase(c));
            }
        }
        return proper.toString();
    }

    public boolean isIntroCourse(){
        return title.startsWith("INTRO-") || title.toLowerCase().contains("intro");
    }

    public String syllabusLine(){
        StringBuilder syllabus = new StringBuilder();
        syllabus.append(code).append(" - ").append(title).append("(Instructor: ").append(instructor.getFirstName()).append(" ").append(instructor.getSecondName()).append(")");
        return syllabus.toString();
    }
}
