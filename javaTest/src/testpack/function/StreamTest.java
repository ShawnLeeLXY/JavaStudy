package testpack.function;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周小明");
        manList.add("陈小明");
        manList.add("刘明");
        manList.add("吴小明");
        manList.add("周小华");
        manList.add("李小明");
        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林小丽");
        womanList.add("张小丽");
        womanList.add("林小云");
        womanList.add("柳小丽");
        womanList.add("林小月");
        womanList.add("王小丽");
//        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
//        Stream<String> womanStream = womanList.stream().filter(s->s.startsWith("林")).skip(1);
//        Stream<String> stream = Stream.concat(manStream, womanStream);
//        stream.map(Actor::new).forEach(p->System.out.println(p.getName()));
        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3),
                womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new).
                forEach(p -> System.out.println(p.getName()));
    }
}
