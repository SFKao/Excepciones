public class Triangulo {
    public int a;
    public int b;
    public int c;

    public Triangulo(int a, int b, int c) throws IlegalTriangeException {
        this.a = a;
        this.b = b;
        this.c = c;

        int mayor = Math.max(a,b);
        mayor = Math.max(mayor,c);

        if(mayor >= a+b+c-mayor){
            throw new IlegalTriangeException("lados ["+a+", "+b+", "+c+"]");
        }
    }

    public static void main(String[] args) {
        try {
            Triangulo a = new Triangulo(3,4,5);
            System.out.println("Se crea bien");
        } catch (IlegalTriangeException e) {
            System.out.println(e);;
        }

        try{
            Triangulo error = new Triangulo(10,2,2);
        }catch (IlegalTriangeException e){
            System.out.println(e);
        }
    }

}

class IlegalTriangeException extends Exception{
    public IlegalTriangeException() {
    }

    public IlegalTriangeException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "El triangulo no es valido, " + this.getMessage()+", "+this.getClass();
    }
}
