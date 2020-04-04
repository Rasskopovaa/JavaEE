package Homework;

import java.io.Serializable;

public class Message  implements Serializable {
    private final  String data;//Суть модификатора final - сделать дальнейшее изменение объекта невозможным. С английского "final" можно перевести как "последний, окончательный"
 private final MessageType type;
    public Message(String data, MessageType type) {
        this.data = data;
        this.type = type;
    }
    public String getData(){
        return data;
    }
    public Message(MessageType type) {
        data = null;
        this.type = type;
    }

    public MessageType getType() {
        return type;
    }
}
