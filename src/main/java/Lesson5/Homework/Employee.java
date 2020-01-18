package Lesson5.Homework;

import Lesson5.DatExample.Person;
import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Employee implements Serializable {
    private static String nameFile = "C:\\EmDle\\MyDoc.txt";

    private String name;
    private int age;
    private double salary;
    private Job job;

    public Employee() {
    }

    public enum Job {
        Менеджер,
        Разработчик,
        Администратор,
        Тестироващик,
        Аналитик,
        Дизайнер,
        ;
    }
    public Employee(String name, int age, double salary, Job job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                job == employee.job;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, job);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", job=" + job +
                '}';
    }



    //записывает лист, в котором будут employeers в файл
    public static boolean saveList(List<Employee> list) {
        try (ObjectOutputStream objectstream = new ObjectOutputStream(new FileOutputStream(nameFile, true))) {
            objectstream.writeObject(list);
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    //чтение в файл
    public static List<Employee> readList() {
        List<Employee> list = new ArrayList<>();
        try (ObjectInputStream objectstream = new ObjectInputStream(new FileInputStream(nameFile))) {
            list = (ArrayList<Employee>) objectstream.readObject();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    //сохраняет сотрудника в файл
    public static boolean save(Employee employee) {
        List<Employee> list = readList();
        list.add(employee);
        try {
            new FileOutputStream(nameFile).close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return saveList(list);

    }

    public  static boolean delete(Employee employee) {
        List<Employee> list = readList();
        boolean res = false;
        for (int i = 0; i < list.size(); i++) { //сравнимаем элементы листа с сотрудниками
            if (list.get(i).getName().equals(employee.getName()) &&
                    list.get(i).getAge() == (employee.getAge()) &&
                    list.get(i).getSalary() == employee.getSalary() &&
                    list.get(i).getJob().equals(employee.getJob())) {
                list.remove(list.get(i));
                list.remove(employee);
                res = true;
            }
        }
            //чистим файл
            try {
                new FileOutputStream(nameFile).close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            for (Employee em : list) {
                save(em);
            }
        return res;
    }

    public static Employee getbyName(String name) {
        List<Employee> list = readList();
        Employee result = null;
        for (Employee em : list) {
            if (em.getName().equals(name))
                result = em;
        }
        return result;

    }

    public static List<Employee> getByJob(Job job) {
        List<Employee> list = readList();
        ArrayList<Employee> result = new ArrayList<>();
        for (Employee em : list) {
            if (em.getJob().equals(job)) {
                result.add(em);
            }

        }
        return result;
    }
//добавляет в список, или обновляет если такой сотрудник уже есть
    public static boolean SaveorUpdate(Employee employee) {
        List<Employee> list = readList();
        boolean result = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(employee.getName()) && list.get(i).getAge() == employee.getAge()) {
                list.get(i).setSalary(employee.getSalary());
                list.get(i).setJob(employee.getJob());
                result = true;
            }

        }
        if (!result)
            list.add(employee);
            try {
                new FileOutputStream(nameFile).close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            result = saveList(list);
            return result;
    }
    //метод, меняющий профессию всех сотрудников с одной на другую
public  static  boolean changeAllWork(Job job1, Job job2){
        List<Employee> list = readList();
        for(Employee employee:list){
            if(employee.getJob().equals(job1)){
                employee.setJob(job2);
                return  true;
            }
        }
    try {
        new FileOutputStream(nameFile).close();

    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

     return saveList(list);
}

    public static void printFile() {
        List<Employee> list = Employee.readList();
        for (Employee employee : list){
            System.out.println(employee);
        }
    }

}