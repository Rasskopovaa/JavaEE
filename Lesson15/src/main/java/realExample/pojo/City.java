package realExample.pojo;

public class City {
    private int id;
    private String name;
    private int citizens;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", citizens=" + citizens +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCitizens() {
        return citizens;
    }

    public void setCitizens(int citizens) {
        this.citizens = citizens;
    }

    public City(int id, String name, int citizens) {
        this.id = id;
        this.name = name;
        this.citizens = citizens;
    }
}
