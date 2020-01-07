package Lesson4.Course.second;

public class GenericContainer <T>{//можно объявить несколько дженериков через запятую, и не забыть объявить перемнную
     private T myData;

  public GenericContainer(T myData){
      this.myData=myData;
  }
  public void setData(T myData){
      this.myData=myData;
  }
    public T getMyData() {
        return myData;
    }
}
