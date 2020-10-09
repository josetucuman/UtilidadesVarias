package lectorDeNumeros;

public class LeerNumeros {


    public Integer NumeroABinario(Integer numDec) {
        int  exponente = 0, digito;
        double binario =0;
        while(numDec >= 0){
            digito = numDec % 2;
            binario += digito * Math.pow(10,exponente);
            exponente ++;
            numDec /=2;
        }

        return new Integer((int) binario);
    }

    public String NumeroAHexa(int numDec) {
        String hex = "";
        String caracHexa = "0123456789ABCDEF";
        while (numDec >= 0){
            int res = numDec % 16;
            hex = caracHexa.charAt(res) + hex;
            numDec /=16;
        }

        return hex;
    }

    public String NumeroAOctal(int numDec) {
        String octalNum="";
        String octales = "01234567";
        while (numDec > 0){
            int res = numDec % 8;
            octalNum = octales.charAt(res) + octalNum;
            numDec /=8;
        }
        return octalNum;
    }

    public Long OctalADecimal(String octal) {
        long decimal = 0;
        int potencia = 0;
        for (int i = octal.length() -1 ; i >= 0 ; i--) {
            int valorDec = Character.getNumericValue(octal.charAt(i));
            long elevado = (long)Math.pow(8, potencia)*valorDec;
            decimal += elevado;
            potencia ++;
        }
        return decimal;
    }
}
