package Course.first_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TrainingCentre  implements InvocationHandler {
    private  Trainer trainer;

    public TrainingCentre(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I take your money");
        System.out.println("I give  money to trainer and consultans");
        System.out.println("Let's go studiyng");
        if(method.getName().equals("talk")){
            System.out.println("Who is late?");
        }
        return  method.invoke(trainer,args);
    }

}
