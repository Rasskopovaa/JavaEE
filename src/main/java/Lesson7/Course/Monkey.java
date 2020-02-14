package Lesson7.Course;

public abstract class Monkey {
    private  String  name;
     public Integer age;
     private String country;
     private String subType;

     private final int nymLegs =2;

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void saySmth(String speech){
        System.out.println(speech);
    }
}
