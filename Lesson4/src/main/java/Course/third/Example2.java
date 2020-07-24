package Course.third;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
    List <Line> l = new ArrayList<>();
    l.add(new Line());
    l.add(new Poligon());
    draw(l);

    List<Poligon> p = new ArrayList<>();
    p.add(new Poligon());
    draw(p);
}
    static void draw(List<? extends Line> c){
        for(Iterator<? extends Line> i = c.iterator();i.hasNext();){
            Line s =i.next();
            s.draw();
        }
    }
}
