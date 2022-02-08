public class Try6 {
    public static void main(String arg[]) {
        try {
            MiPropioError e = new MiPropioError("Este es mi propio error.");
            throw e;
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
        }
    }
}

class MiPropioError extends Exception {
    public MiPropioError(String mensaje) {
        super(mensaje);
    }
}