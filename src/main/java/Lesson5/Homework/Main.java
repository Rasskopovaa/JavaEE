package Lesson5.Homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        String nameFile = "C:\\EmDle\\MyDoc.txt";

        try {
            new FileOutputStream(nameFile).close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Employee employee1 = new Employee("Oleq",24,50000, Employee.Job.Менеджер);
        Employee employee2 = new Employee("Igor",27,60000, Employee.Job.Администратор);
        Employee employee3 = new Employee("Fedor",30,480000, Employee.Job.Разработчик);
        Employee employee4 = new Employee("Aleks",34,50000, Employee.Job.Дизайнер);
        Employee employee5 = new Employee("Alesya",34,50660, Employee.Job.Дизайнер);

        System.out.println("Запись сотрудников в файл");
        Employee.save(employee1);
        Employee.save(employee2);
        Employee.save(employee3);
        Employee.save(employee4);
        Employee.save(employee5);

        System.out.println("Данные в файле:");
        Employee.printFile();

        System.out.println("Удаление сотрудников");
        Employee.delete(employee2);
        Employee.delete(employee3);
        System.out.println("Удаление произведено");

        Employee.printFile();

        System.out.println("Поиск по имени"+" "+ Employee.getbyName("Alesya"));


        List<Employee> list = Employee.getByJob(Employee.Job.Дизайнер);
        System.out.println("Поиск по профессии");
        for(Employee emp:list){
            System.out.println(emp);
        }
        System.out.println("ОБновление");
        Employee.SaveorUpdate(new Employee("Sasha",23,20000, Employee.Job.Тестироващик));
        Employee.SaveorUpdate(new Employee("Fedor",30,590000, Employee.Job.Администратор));
        Employee.printFile();

        System.out.println("Меняем профессию");
        Employee.changeAllWork(Employee.Job.Тестироващик, Employee.Job.Разработчик);
         Employee.printFile();

    }

}
