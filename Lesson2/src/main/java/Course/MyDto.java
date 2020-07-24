package Course;

import java.util.Objects;

public class MyDto {
    private String id;
    private String fio;
    private int age;


    public MyDto(String id, String fio, int age) {
        this.id = id;
        this.fio = fio;
        this.age = age;
    }
    public MyDto()
    {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        MyDto myDto = (MyDto) o;
        return age == myDto.age &&
                id.equals(myDto.id) &&
                fio.equals(myDto.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, age);
    }
}

