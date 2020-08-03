package pojo;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String contact;
    private int city;
    private int mark;
    private String subject;

    public Student(int id, String name, String surname, int age, String contact, int city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.contact = contact;
        this.city = city;
    }

    public Student(String name, String surname, int mark, String subject) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
        this.subject = subject;
    }

    public Student(String name, String surname, int age, String contact, int city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.contact = contact;
        this.city = city;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                ", city=" + city +
                '}';
    }
}
