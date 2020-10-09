package LectorNumerosTest;

import lectorDeNumeros.LeerNumeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectorNumerosTest {

    private LeerNumeros num = new LeerNumeros();

    @Test
    public void convertirABinario(){
        int esperado;

        esperado =num.NumeroABinario(8);
        assertEquals(1000, esperado );
    }
    @Test
    public void convertir_12AC_Hexa(){
        int esperado;
        String hexa;
        hexa =num.NumeroAHexa(12);
        assertEquals("C", hexa );
    }

    @Test
    public void convertir_15AC_Hexa(){
        int esperado;
        String hexa;
        hexa =num.NumeroAHexa(15);
        assertEquals("F", hexa );
    }

    @Test
    public void convertir_8A10_Octal(){
        String esperado ="";

        esperado =num.NumeroAOctal(8);
        assertEquals("10", esperado );
    }

    @Test
    public void convertir_octal_decimal(){
        long esperado = 0;
        esperado = num.OctalADecimal("12");
        assertEquals(10, esperado);
    }
}
