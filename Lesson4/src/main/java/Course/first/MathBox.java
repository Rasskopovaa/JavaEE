package Course.first;

import java.util.ArrayList;
import java.util.List;

public class MathBox {
       private List digits = new ArrayList();

        public  void addDigit(Object digit){
            digits.add(digit);
        }
        public Integer getSumm(){
            Integer summ=0;
            for(Object digit:digits){
                summ+=(Integer)digit;
            }
            return summ;
        }
}
