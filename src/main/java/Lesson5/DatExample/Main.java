package Lesson5.DatExample;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 35, 67, true);
    writePerson(tom);
        Person newTom = readPerson();
        System.out.println(newTom);

    }
   static void writePerson(Person person) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
                dos.writeUTF(person.getName());
                dos.writeInt(person.getAge());
                dos.writeDouble(person.getHeight());
                dos.writeBoolean(person.isMarried());

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        static Person readPerson() {
        Person person = new Person();
            try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
                person.setName(dis.readUTF());
                person.setAge(dis.readInt());
                person.setHeight(dis.readDouble());
                person.setMarried(dis.readBoolean());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            return person;
        }
    }
