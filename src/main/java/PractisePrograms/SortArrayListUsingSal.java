package PractisePrograms;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortArrayListUsingSal {
    public static void main(String[] args) {
        var list = new ArrayList<Emp>();
        list.add(new Emp(1,"madhukar",31));
        list.add(new Emp(2,"Mamatha",28));
        list.add(new Emp(3,"vanaja",26));
        list.add(new Emp(4,"Sudha",28));

        var sortedList = list.stream().sorted((e1,e2)->e1.getAge()-e2.getAge()).collect(Collectors.toList());
      for(var emp:sortedList)
      {
          System.out.println(emp);
      }
    }

}
