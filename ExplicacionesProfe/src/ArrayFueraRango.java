import java.util.Arrays;

public class ArrayFueraRango {

    public static void main(String[] args) {
        double array[] = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        try {
            System.out.println(accederPorIndice(array,2));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println(accederPorIndice(array, array.length)+2);
        } catch (Exception e) {
            System.out.println(e);
        }

        for (int i = 0; i <= array.length; i++) {
            try{
                array[i] *= 10;
            }catch (Exception e){
                System.out.println(e);
            }
        }

        System.out.println(Arrays.toString(array));

    }

    public static double accederPorIndice(double ar[], int i) throws Exception{
        return ar[i];
    }



}
