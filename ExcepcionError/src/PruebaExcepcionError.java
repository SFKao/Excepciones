import java.util.Scanner;

public class PruebaExcepcionError {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        if(args.length!=0){
            try{
                throw new ExcepcionError(args[0]);
            }catch (ExcepcionError e){
                System.out.println(e);
            }
        }else{
            while (true){

                System.out.println("Introduce que pasar a la excepcion");
                try{
                    throw new ExcepcionError(in.nextLine());
                } catch (ExcepcionError excepcionError) {
                    System.out.println(excepcionError);
                }
                System.out.println();
            }
        }
    }

}


class ExcepcionError extends Exception{

    public ExcepcionError() {
    }

    public ExcepcionError(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

    @Override
    public String getMessage() {
        String aux = "Error ExcepcionError : ";
        int num;
        try{
            num = Integer.parseInt(super.getMessage());
        }catch (NumberFormatException e){
            aux = aux + "-1, no era un numero.";
            return aux;
        }
        if(num >= 0 && num < 11){
            aux = aux + "1, numero entre 0 y 10";
        }else if(num >= 11 && num < 21){
            aux = aux + "2, numero entre 11 y 20";
        }else if(num >= 21 && num < 31){
            aux = aux + "3, numero entre 21 y 30";
        }else{
            aux = aux + "0, no estaba en el rango";
        }
        return aux;
    }
}