package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(5,23,42,1,32,4));
        Calculator<Integer> calculator = new Calculator<>();
        System.out.println(calculator.sum(list1));

        List<Double> list2 = new ArrayList<>(Arrays.asList(5.0,23.0,4.0,1.0,2.0,4.0));
        System.out.println(calculator.sum(list2));

        System.out.println(calculator.multyple(list1));
        System.out.println(calculator.division(list1));

        int res1 = calculator.sum(list1);
        System.out.println(calculator.toBinary(res1));
        
        String res2 = "123";
        Calculator<String> calculator2 = new Calculator<>();
        System.out.println(calculator2.toBinary(Integer.parseInt(res2)));

    
    }
}
