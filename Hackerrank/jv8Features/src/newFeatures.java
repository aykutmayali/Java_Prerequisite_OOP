import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class newFeatures {
    List<Integer> list =new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    for(Integer element : list){
        System.out.println(element);
    }

    list.forEach(element -> {System.out.println(element.toString())})

    public class Employee {
        private long id;
        private String name;
        private long age;
    }

    List<Emloyee> list = new ArrayList<>();

    list.stream().forEach(employee -> {System.out.println(employee)});

    list.stream().filter(empl -> empl.getAge()>30).forEach(empl ->{System.out.println(empl)});

    list.stream().filter(empl -> empl.getAge()>30).collect(Collectors .groupingBy(empl->empl.getName(),Collectors.counting));





}
