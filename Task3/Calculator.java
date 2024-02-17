package Task3;
import java.util.List;

public class Calculator<T> {

    public int sum(List<? extends Number> numbers){

        int res = 0;

        for (int i = 0; i < numbers.size(); i++) {
            res += numbers.get(i).doubleValue();
        }
        return res;
    }

    public double multyple(List<? extends Number> numbers){
        
        double res = 1;

        for (int i = 0; i < numbers.size(); i++) {
            
            res *= numbers.get(i).doubleValue();
        }
        return res;
    }

    public double division(List<? extends Number> numbers){
        double res = numbers.get(0).doubleValue();

        for (int i = 1; i < numbers.size(); i++) {
            res /= numbers.get(i).doubleValue();
        }
        return res;
    }
    public String toBinary(int res){

        
        return Integer.toBinaryString(res);
    }
}
