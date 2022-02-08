public class TestConversion {

    public static void main(String[] args) {
        try{
            System.out.println(ConversionHexadecimal.binarioAHexadecimal(ConversionBinario.HexadecimalABinario("ABCF124")));
            System.out.println(ConversionBinario.HexadecimalABinario(ConversionHexadecimal.binarioAHexadecimal("0011011100011011100")));
        }catch (Exception a){
            System.out.println(a);
        }

        try{
            System.out.println(ConversionHexadecimal.binarioAHexadecimal("234"));
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            System.out.println(ConversionBinario.HexadecimalABinario("ASDFG"));
        }catch (Exception e){
            System.out.println(e);
        }
    }

}

class ConversionHexadecimal{
    public static String binarioAHexadecimal(String input) throws Exception {
        String in = input.toUpperCase();
        String res ="";
        String aux ="";
        for(int i = in.length()%4; i > 0; i--)
            in = "0"+in;
        for(int i = in.length(); i >= 4; i-=4){
            aux = in.substring(in.length()-4,in.length());
            in = in.substring(0,in.length()-4);
            switch (aux){
                case "0000":
                    res = "0"+ res;
                    break;
                case "0001":
                    res = "1"+ res;
                    break;
                case "0010":
                    res = "2"+ res;
                    break;
                case "0011":
                    res = "3"+ res;
                    break;
                case "0100":
                    res = "4"+ res;
                    break;
                case "0101":
                    res = "5"+ res;
                    break;
                case "0110":
                    res = "6"+ res;
                    break;
                case "0111":
                    res = "7"+ res;
                    break;
                case "1000":
                    res = "8"+ res;
                    break;
                case "1001":
                    res = "9"+ res;
                    break;
                case "1010":
                    res = "A"+ res;
                    break;
                case "1011":
                    res = "B"+ res;
                    break;
                case "1100":
                    res = "C"+ res;
                    break;
                case "1101":
                    res = "D"+ res;
                    break;
                case "1110":
                    res = "E"+ res;
                    break;
                case "1111":
                    res = "F"+ res;
                    break;
                default:
                    throw new Exception("Error de traduccion de binario a Hexadecimal");
            }
        }
        return res;
    }
}

class ConversionBinario{
    public static String HexadecimalABinario(String input) throws Exception{
        String in = input.toUpperCase();
        String res ="";
        for (int i = in.length()-1; i >=0 ; i--) {
            switch (in.charAt(i)){
                case '0':
                    res = "0000"+res;
                    break;
                case '1':
                    res = "0001"+res;
                    break;
                case '2':
                    res = "0010"+res;
                    break;
                case '3':
                    res = "0011"+res;
                    break;
                case '4':
                    res = "0100"+res;
                    break;
                case '5':
                    res = "0101"+res;
                    break;
                case '6':
                    res = "0110"+res;
                    break;
                case '7':
                    res = "0111"+res;
                    break;
                case '8':
                    res = "1000"+res;
                    break;
                case '9':
                    res = "1001"+res;
                    break;
                case 'A':
                    res = "1010"+res;
                    break;
                case 'B':
                    res = "1011"+res;
                    break;
                case 'C':
                    res = "1100"+res;
                    break;
                case 'D':
                    res = "1101"+res;
                    break;
                case 'E':
                    res = "1110"+res;
                    break;
                case 'F':
                    res = "1111"+res;
                    break;
                default:
                    throw new Exception("Error en la conversion de hexadecimal a binario");

            }
        }
        return res;
    }
}