package Homework;

import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;

//Клиент и сервер будут общаться через сокетное соединение. Одна сторона будет записывать данные в сокет, а другая читать. Их общение представляет собой обмен сообщениями Message.
// Класс Connection будет выполнять роль обертки над классом java.net.Socket, которая должна будет уметь сериализовать и десериализовать объекты типа Message в сокет.
// Методы этого класса должны быть готовы к вызову из разных потоков.
public class Connection  implements Closeable {
    private final Socket socket;
     private final ObjectInputStream in ;
     private final ObjectOutputStream out;

    public Connection(Socket socket) throws IOException {
        this.socket = socket;

        this.out = new ObjectOutputStream(socket.getOutputStream());
        this.in =  new ObjectInputStream(socket.getInputStream());
    }
    public void send(Message message) throws IOException{
        synchronized (out){ //Чтобы ограничить доступ к двери, и позволить только одному потоку находится там в какой-либо момент времени, мы используем ключевое слово synchronized
            out.writeObject(message);
        }
    }
    public Message receive() throws IOException, ClassNotFoundException {
        synchronized (in) {
            return (Message) in.readObject();

        }
    }
    public SocketAddress getRemoteSocketAddress() { //Метод, возвращающий удаленный адрес сокетного соединения.
        return socket.getRemoteSocketAddress();
    }
    public void close() throws IOException {
        out.close();
        in.close();
        socket.close();
    }

}
