package springData;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

public class RandomIntBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field f : fields) {
            RandomInt randomInt = f.getAnnotation(RandomInt.class);
            if (randomInt != null) {
                int min = randomInt.min();
                int max = randomInt.max();
                Random rand = new Random();
                int random = min + rand.nextInt(max - min);
                f.setAccessible(true);
                ReflectionUtils.setField(f, bean, random);

            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
