import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Validador;

public class ValidadorTest {


    @Test
    void caso1() {
        Validador validador = new Validador();
        assertEquals(validador.validaCPF("78755548841"), false);
    }

    @Test
    void caso2() {
        Validador validador = new Validador();
        assertEquals(validador.validaCPF("12345678910"), false);
    }

    @Test
    void caso3() {
        Validador validador = new Validador();
        assertEquals(validador.validaCPF("30278593070"), true);
    }

    @Test
    void caso4() {
        Validador validador = new Validador();
        assertEquals(validador.validaCPF("302785930709"), false);
    }

    @Test
    void caso5() {
        Validador validador = new Validador();
        assertEquals(validador.validaCPF(""), false);
    }

    @Test
    void caso6() {

        Validador validador = new Validador();
        assertEquals(validador.validaCPF("111.111.111-11"), false);
        assertEquals(validador.validaCPF("222.222.222-22"), false);
        assertEquals(validador.validaCPF("333.333.333-33"), false);
        assertEquals(validador.validaCPF("444.444.444-44"), false);
        assertEquals(validador.validaCPF("555.555.555-55"), false);
        assertEquals(validador.validaCPF("666.666.666-66"), false);
        assertEquals(validador.validaCPF("777.777.777-77"), false);
        assertEquals(validador.validaCPF("888.888.888-88"), false);
        assertEquals(validador.validaCPF("999.999.999-99"), false);
        assertEquals(validador.validaCPF("000.000.000-00"), false);
      
    }

}
