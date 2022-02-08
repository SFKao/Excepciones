public class ExceptionFueraRangoArray{
    public static double get(double[] ar, int i) throws ExceptionFueraRango{
        try {
            return ar[i];
        }catch (Exception e){
            throw new ExceptionFueraRango(e.getMessage());
        }
    }

    public static void main(String[] args) {

        double ar[] = new double[10];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = i+1;
        }

        try{
            for (int i = 0; i < ar.length ; i++) {
                ar[i] *= get(ar,i+1);
            }
        }catch (ExceptionFueraRango a) {
            System.out.println(a);
        }
    }
}


class ExceptionFueraRango extends Exception{
    public ExceptionFueraRango() {
    }

    public ExceptionFueraRango(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "Se ha producido una expección " + this.getClass() + '\n' + "Con el mensaje " + this.getMessage();
    }
}
