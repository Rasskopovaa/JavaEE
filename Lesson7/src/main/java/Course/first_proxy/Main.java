package Course.first_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new JavaTrainer();
        TrainingCentre trainingCentre = new TrainingCentre(trainer);
        Trainer stc = (Trainer) Proxy.newProxyInstance(TrainingCentre.class.getClassLoader(),new Class[]{Trainer.class}, trainingCentre);
        System.out.println("Without proxy");
        trainer.eat();
        trainer.talk();
        trainer.teach();
        System.out.println("With proxy");
        stc.eat();
        stc.talk();
        stc.teach();

    }
}