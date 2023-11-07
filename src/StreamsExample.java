import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();

        mylist.add(10);
        mylist.add(500);
        mylist.add(1022);
        mylist.add(2010);

        
        List<Integer> squareList = mylist.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println("my list is: " + squareList);
    }
}

}
