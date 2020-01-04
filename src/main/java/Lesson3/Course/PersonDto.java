package Lesson3.Course;

import java.util.Objects;

public class PersonDto {
    private int id;
    private String fio;
    private int age;

    public PersonDto(int id, String fio, int age) {
        this.id = id;
        this.fio = fio;
        this.age = age;
    }

    public PersonDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto personDto = (PersonDto) o;
        return id == personDto.id &&
                age == personDto.age &&
                Objects.equals(fio, personDto.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, age);
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", age=" + age +
                '}';
    }
}
