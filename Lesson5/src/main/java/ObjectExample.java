import DatExample.Person;

import java.io.*;
import java.util.ArrayList;

public class ObjectExample {
    public static void main(String[] args) {
        String filename="people.dat";

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Jake",35,67,true));
        persons.add(new Person("Mike",25,55,false));
        persons.add(new Person("Juju",35,77,true));
        try(ObjectOutputStream objectstream = new ObjectOutputStream(new FileOutputStream(filename))) {
            objectstream.writeObject(persons);
            System.out.println("Запись произведена");
        }
        catch(IOException ex){
        System.out.println(ex.getMessage());
    }

        ArrayList<Person> newPersons = new ArrayList<>();
        try(ObjectInputStream objectInput= new ObjectInputStream(new FileInputStream(filename))){
            newPersons=(ArrayList<Person>)objectInput.readObject();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        for(Person p:persons){
            System.out.println(p);
        }
}
}