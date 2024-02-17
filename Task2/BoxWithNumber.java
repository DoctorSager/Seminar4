package Task2;


public class BoxWithNumber <T> {

    private T[] array;

    public BoxWithNumber(T...element) {
        this.array = element;
    }

    public BoxWithNumber() {
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public Double Average(){
        
        Double res = 0.0;
        
        for (int i = 0; i < array.length; i++) {
          //  res += array[i].doubleValue();
        }
        res = res/array.length;
        return res;
    }

    public boolean CompareAverage(BoxWithNumber<? extends Number> box2){

        return Average() > box2.Average();
    }

    

    

}
