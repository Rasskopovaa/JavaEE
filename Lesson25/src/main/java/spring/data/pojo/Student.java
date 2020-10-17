package spring.data.pojo;


public class Student {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String group;

    public Student() {
    }

    public Student(Integer id, String name, String surname, Integer age, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }

    public Student(String name, String surname, Integer age, String group) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}