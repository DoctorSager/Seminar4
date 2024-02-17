package Task3;
import java.util.List;

public class Calculator<T> {

    public double sum(List<? extends Number> numbers){

        double res = 0;

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

}
