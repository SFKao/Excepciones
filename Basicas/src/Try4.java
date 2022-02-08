public class Try4 {
    public static void main(String arg[]) {
        int[] array = new int[20];
        try {
            String s = null;
            s.equals("QQQQ");
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            System.out.println(" Error de índice en un array");
        } catch (ArithmeticException excepcion) {
            System.out.println(" Error de índice en un array");
        } catch (Exception excepcion) {
            System.out.println("Se ha generado un error que no es deíndices, ni Aritmético");
            System.out.println("El objeto error es de tipo " + excepcion);
        }
    }
}