public class CapturaExcepciones {
    public static void main(String[] args) {

        int errorASaltar = 0; //0 bien, 1 ExceptionIntervalo, 2 NumberFormat, 3 Arithmetic

        String str1 = "10";
        if(errorASaltar == 1) {
            str1 = "10000";
        }

        String str2 = "20";
        if(errorASaltar==2){
            str2 = "1sudfgnsuidng";
        }
        int a;
        try{
            compruebaRango(Integer.parseInt(str1), Integer.parseInt(str2));
            if(errorASaltar==3)
                a = 10/0;
        }catch (ExceptionIntervaloChorrada e){
            System.out.println(e);
        }catch (NumberFormatException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }

    public static void compruebaRango(int num, int denominador) throws ExceptionIntervaloChorrada{
        if(num>100 || denominador <= 5)
            throw new ExceptionIntervaloChorrada("Numero fuera de rango");
    }
}


class ExceptionIntervaloChorrada extends Exception{
    public ExceptionIntervaloChorrada() {
    }

    public ExceptionIntervaloChorrada(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "Se ha producido una expeccion "+ this.getClass() + super.toString();
    }
}
