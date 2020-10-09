package NaturalesARomanos;

import java.util.Arrays;
import java.util.List;

public class NumerosRomanos {

    private final static List<String> simbolosRomanos = Arrays.asList("I","V","X","L","C","D","M");

    public String ConvertirARomanos(Integer numNat) {

        int inc = 0;
        char[] numChar = numNat.toString().toCharArray();
        String result ="";

        for (int i = numChar.length -1; i >= 0 ; i--) {
            String romano =generaRomanos(Character.getNumericValue(numChar[i]),0+inc,1+inc,2+inc);
            result = romano+ result;
            inc +=2;
        }

        return result;

    }

    private String generaRomanos(int decena, int x, int y, int z){
        switch (decena) {
            case 4:
                return simbolosRomanos.get(x) + simbolosRomanos.get(y);
            case 9:
                return simbolosRomanos.get(x) + simbolosRomanos.get(z);
        }
        if( decena <= 3)
            return pasarARomanos(1,decena,"", simbolosRomanos.get(x));
        if ( decena <= 8){
            return pasarARomanos(6,decena,simbolosRomanos.get(y),simbolosRomanos.get(x));
        }

        return null;
    }

    private String pasarARomanos(int inicioCuenta, int numNat, String simbolo, String incRomano){

        for(int i = inicioCuenta; i<= numNat; i++)
            simbolo += incRomano;
        return simbolo;
    }
}
