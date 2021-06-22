package ConsumerExample;

import java.util.List;

public class ConsumerDemo {
    public static void main(String[] args) {

        List<String> string = List.of("a","b","c");

        //Imperative programming style to iterate
        for(String each : string)
            System.out.println(each);
        //Declarative programming style
      string.forEach((each)->System.out.println(each));
        
    }
}
