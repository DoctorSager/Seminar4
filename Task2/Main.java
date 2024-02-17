package Task2;

public class Main {

    public static void main(String[] args) {

        BoxWithNumber<Double> box1 = new BoxWithNumber<>(1.0,4.0,52.0,6.0,563.0,2.0,4.0);
        System.out.println(box1.Average());

        BoxWithNumber <Double> num2 = new BoxWithNumber<>(2.5,7.4,23.0,13.0,34.0);
        System.out.println(num2.Average());
        System.out.println(num2.CompareAverage(box1));
        
        BoxWithNumber<Integer> boxInt = new BoxWithNumber<>(1,24,2,53,5,5,6,3);
        System.out.println(boxInt.Average());
        System.out.println(num2.CompareAverage(boxInt));

        //BoxWithNumber<String> boxString = new BoxWithNumber<>("2","dsf","753");
        //System.out.println(boxString.CompareAverage(boxInt));

    }

}
