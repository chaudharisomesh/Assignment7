package Learning.Assignment7;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class p10 {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
