package Learning.Assignment7;
import java.util.*;
import java.util.stream.*;

public class p5 {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count =  myList.stream()
                .count();
        System.out.println(count);
    }
}
