
public class Main {

    public static void main(String[] args) {

        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);

        int sum = (Integer)intBox1.getObject() + (Integer)intBox2.getObject();
        System.out.println(sum);

        intBox1.setObject("120");
        
        int sum2 = 0;

        if (intBox2.getObject() instanceof Integer && intBox1.getObject() instanceof Integer) {
            sum2 = (Integer)intBox1.getObject() + (Integer)intBox2.getObject();
        }
        System.out.println(sum2);


        GenBox<Integer> genBox1 = new GenBox<>(10);
        GenBox<Integer> genBox2 = new GenBox<>(20);

        int sum3 = genBox1.getObj() + genBox2.getObj();
        System.out.println(sum3);

    }
}