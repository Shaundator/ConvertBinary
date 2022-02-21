package binaertodecimal.bi2deci.services;

public class BiToDeci {

    public int conversion(String data){
        String[] decimalString = data.split("");
        int result = 0;
        int count = 0;
        for (int i = decimalString.length-1; i > -1; i--) {
            result += Integer.parseInt(decimalString[i]) * (int) Math.pow(2, count);
            count++;
        }
        return result;
    }
}
