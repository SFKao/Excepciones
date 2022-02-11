public class DivisionPorCero {
    public static void main(String[] args) {
        System.out.println(divisionEnteroSinExcepciones(2,0));//lo que soliamos hacer
        System.out.println(divisionEnteroSinExcepciones(3,3));

        try {
            System.out.println(divisionEnteroConExcepciones(3,0)); //ahora con excepciones
        } catch (Exception e) {
            System.out.println(e);
        }

        divisionEnterosConExcepcionesSinThrow(2,0);//esto hace el try internamente
        divisionEnterosConExcepcionesSinThrow(2,2);
    }

    public static int divisionEnteroSinExcepciones(int dividendo, int divisor){
        int rest = 0;

        if(divisor!=0){
            rest = dividendo/divisor;
        }else{
            System.out.println("Error, division por 0");
        }

        return rest;
    }

    public static int divisionEnteroConExcepciones(int dividendo, int divisor) throws Exception{
        int rest;
        if(divisor!=0){
            rest = dividendo/divisor;
        }else{
            throw new Exception("Dividiendo entre 0!!");
        }
        return rest;
    }

    public static void divisionEnterosConExcepcionesSinThrow(int dividendo, int divisor){
        int res = 0;
        try{
            res = dividendo/divisor;
        }catch(ArithmeticException a){
            System.out.println("Division por 0");
            System.out.println(a);
        }finally {
            System.out.println("Res = " + res);
        }
    }
}