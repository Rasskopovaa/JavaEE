package pojo;

public class Marks {
    private int id;
    private String nameStud;
    private String surnameStud;
    private String subject;
    private int marks;

    public Marks(int id, String nameStud, String surnameStud, String subject, int marks) {
        this.id = id;
        this.nameStud = nameStud;
        this.surnameStud = surnameStud;
        this.subject = subject;
        this.marks = marks;
    }

    public Marks(String nameStud, String surnameStud, String subject, int marks) {
        this.nameStud = nameStud;
        this.surnameStud = surnameStud;
        this.subject = subject;
        this.marks = marks;
    }

    public Marks(int id, String subject, int marks) {
        this.id = id;
        this.subject = subject;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStud() {
        return nameStud;
    }

    public void setNameStud(String nameStud) {
        this.nameStud = nameStud;
    }

    public String getSurnameStud() {
        return surnameStud;
    }

    public void setSurnameStud(String surnameStud) {
        this.surnameStud = surnameStud;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
