package realExample;


import realExample.dao.CityDao;
import realExample.dao.CityDaoImpl;
import realExample.dao.StudentDao;
import realExample.dao.StudentDaoImpl;
import realExample.pojo.City;
import realExample.pojo.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        Student student = new Student(0, "Fedor", "Derkov", 21, 4, "+888555");
        studentDao.addStudent(student);


        Student student2 = studentDao.getStudentById(3);
        System.out.println(student2);

        student.setName("Mikhail");
        student.setSurname("Nekhoroshev");

        studentDao.updateStudent(student2);
        studentDao.deleteStudentById(3);

        studentDao.deleteStudentByName("Irina");


        CityDao cityDao = new CityDaoImpl();

        City city = new City(9, "Helsinki", 300000);
        cityDao.addCity(city);
        City city2 = cityDao.getCityById(2);
        System.out.println(city2);

        City city3 = cityDao.getCityByName("Moskva");
        System.out.println(city3);
        city3.setName("Tokyo");
        city3.setCitizens(1_000_000);
        cityDao.updateCity(city3);

        cityDao.deleteCityById(4);
        cityDao.deleteCityBuName(city);


    }
}