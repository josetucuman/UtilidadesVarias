package NaturalesARomanosTest;

import NaturalesARomanos.NumerosRomanos;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumNaturalARomanoTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();
    private String romano = "";

    @Test
    public void pasar1ARomanos(){

       romano = numerosRomanos.ConvertirARomanos(1);

        assertEquals("I", romano);
    }

    @Test
    public void pasar2ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(2);

        assertEquals(romano, "II");
    }

    @Test
    public void pasar3ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(3);
        assertEquals(romano, "III");
    }

    @Test
    public void pasar4ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(4);
        assertEquals(romano, "IV");
    }

    @Test
    public void pasar5ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(5);

        assertEquals(romano, "V");
    }

    @Test
    public void pasar6ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(6);

        assertEquals(romano, "VI");
    }

    @Test
    public void pasar7ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(7);

        assertEquals("VII", romano);
    }

    @Test
    public void pasar8ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(8);

        assertEquals(romano, "VIII");
    }
    @Test
    public void pasar9ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(9);

        assertEquals(romano, "IX");
    }

    @Test
    public void pasar10ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(10);

        assertEquals(romano, "X");
    }
    @Test
    public void pasar11ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(11);

        assertEquals(romano, "XI");
    }

    @Test
    public void pasar12ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(12);

        assertEquals(romano, "XII");
    }

    @Test
    public void pasar13ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(13);

        assertEquals(romano, "XIII");
    }
    @Test
    public void pasar14ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(14);

        assertEquals(romano, "XIV");
    }

    @Test
    public void pasar15ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(15);

        assertEquals(romano, "XV");
    }

    @Test
    public void pasar16ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(16);

        assertEquals(romano, "XVI");
    }
    @Test
    public void pasar17ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(17);

        assertEquals(romano, "XVII");
    }

    @Test
    public void pasar186ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(18);

        assertEquals(romano, "XVIII");
    }

    @Test
    public void pasar19ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(19);

        assertEquals(romano, "XIX");
    }
    @Test
    public void pasar20ARomanos(){
        romano = numerosRomanos.ConvertirARomanos(20);

        assertEquals(romano, "XX");
    }

    @Test
    public void verificarVeintenaRomana(){
        List<Integer> numerosNaturales = Arrays.asList(20,21,22,23,24,25,26,27,28,29);

        List<String> romanos = numerosNaturales.stream()
                                    .map(num -> numerosRomanos.ConvertirARomanos(num))
                                    .collect(Collectors.toList());

        assertEquals(romanos.get(0),"XX");
        assertEquals(romanos.get(1),"XXI");
        assertEquals(romanos.get(2),"XXII");
        assertEquals(romanos.get(3),"XXIII");
        assertEquals(romanos.get(4),"XXIV");
        assertEquals(romanos.get(5),"XXV");
        assertEquals(romanos.get(6),"XXVI");
        assertEquals(romanos.get(7),"XXVII");
        assertEquals(romanos.get(8),"XXVIII");
        assertEquals(romanos.get(9),"XXIX");
    }

    @Test
    public void verificarTreintenaRomana(){
        List<Integer> numerosNaturales = Arrays.asList(30,31,32,33,34,35,36,37,38,39);

        List<String> romanos = numerosNaturales.stream()
                .map(num -> numerosRomanos.ConvertirARomanos(num))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0),"XXX");
        assertEquals(romanos.get(1),"XXXI");
        assertEquals(romanos.get(2),"XXXII");
        assertEquals(romanos.get(3),"XXXIII");
        assertEquals(romanos.get(4),"XXXIV");
        assertEquals(romanos.get(5),"XXXV");
        assertEquals(romanos.get(6),"XXXVI");
        assertEquals(romanos.get(7),"XXXVII");
        assertEquals(romanos.get(8),"XXXVIII");
        assertEquals(romanos.get(9),"XXXIX");
    }

    @Test
    public void verificarDecenasRomana(){
        List<Integer> numerosNaturales = Arrays.asList(40, 50, 60, 70, 80, 90, 87, 99, 37);
        List<String> romanos = numerosNaturales.stream()
                .map(num -> numerosRomanos.ConvertirARomanos(num))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0),"XL");
        assertEquals(romanos.get(1),"L");
        assertEquals(romanos.get(2),"LX");
        assertEquals(romanos.get(3),"LXX");
        assertEquals(romanos.get(4),"LXXX");
        assertEquals(romanos.get(5),"XC");
        assertEquals(romanos.get(6),"LXXXVII");
        assertEquals(romanos.get(7),"XCIX");
        assertEquals(romanos.get(8),"XXXVII");

    }

    @Test
    public void verificarRomanos(){
        List<Integer> numerosNaturales = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 2984);
        List<String> romanos = numerosNaturales.stream()
                .map(num -> numerosRomanos.ConvertirARomanos(num))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0),"C");
        assertEquals(romanos.get(1),"CC");
        assertEquals(romanos.get(2),"CCC");
        assertEquals(romanos.get(3),"CD");
        assertEquals(romanos.get(4),"D");
        assertEquals(romanos.get(5),"DC");
        assertEquals(romanos.get(6),"DCC");
        assertEquals(romanos.get(7),"DCCC");
        assertEquals(romanos.get(8),"CM");
        assertEquals(romanos.get(9),"MMCMLXXXIV");

    }
}
