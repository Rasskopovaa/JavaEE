package Course.second;

public class Main {
    public static void main(String[] args) {
       /* IntegerContainer integerContainer = new IntegerContainer(12);
        System.out.println(integerContainer.getMyInt());
        мы можем делать то же самое для всех типов, но это ужасно, лучше создать класс и объявить дженерики
    } */
       GenericContainer <Integer> genericContainer = new GenericContainer<>(new Integer(12));
       genericContainer.setData(12); // если попытаться положить стрингу, не  позволит компилировать
        System.out.println(genericContainer.getMyData());
    }
}
