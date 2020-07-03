package realExample;

import realExample.dao.StudentDao;
import realExample.dao.StudentDaoImpl;
import realExample.pojo.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
     /*Student student = new Student(0,"Fedor","Derkov",21,4,"+888555");
        studentDao.addStudent(student);


Student student = studentDao.getStudentById(3);
System.out.println(student);

student.setName("Mikhail");
student.setSurname("Nekhoroshev");

studentDao.updateStudent(student);
studentDao.deleteStudentById(3);*/

studentDao.deleteStudentByName("Irina");
}
}