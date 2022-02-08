public class Try7 {
    public static void main(String arg[]) {
        try {
            Exception e = new Exception("Este es mi propio error.");
            throw e;
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        } finally {
            System.out.println("Se ejecuta finally");
        }
    }
}