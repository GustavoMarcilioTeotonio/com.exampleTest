import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.example.Validador;
import com.example.pratica;

public class praticaTest {

    @Test
    void caso1() {
        assertEquals(pratica.calcularAumento(400), 60);
        assertEquals(pratica.calcularAumento(2932), 351.84);
        assertEquals(pratica.calcularAumento(10000), 700.0000000000001);
    }

    @Test
    void caso2() {
        assertEquals(pratica.verificarPrimo(0), false);
        assertEquals(pratica.verificarPrimo(5), true);

    }

    @Test
    void caso3() {
        assertEquals(pratica.calcularMDC(30, 45), 15);
        assertEquals(pratica.calcularMDC(10, 20), 10);
        assertEquals(pratica.calcularMDC(32, 16), 16);

    }

    @Test
    void caso4() {
        assertEquals(pratica.classificarAluno(4), "Reprovado");
        assertEquals(pratica.classificarAluno(5), "Recuperação");
        assertEquals(pratica.classificarAluno(9), "Aprovado");

    }

    @Test
    void caso5() {
        assertEquals(pratica.calculaMediaFinal(8, 7, 0), true);
        assertEquals(pratica.calculaMediaFinal(4, 3, 8), true);
        assertEquals(pratica.calculaMediaFinal(4, 4, 4), false);

    }

    @Test
    void caso6() {
        assertEquals(pratica.calcularSoma(5), 15);
        assertEquals(pratica.calcularSoma(100), 5050);

    }

    @Test
    void caso7() {
        assertEquals(pratica.calcularFatorial(10), 3628800);
        assertEquals(pratica.calcularFatorial(5), 120);
        assertEquals(pratica.calcularFatorial(0), 1);

    }

    @Test
    void caso8() {
        assertEquals(pratica.calcularDesconto(49), 0);
        assertEquals(pratica.calcularDesconto(99), 4.95);
        assertEquals(pratica.calcularDesconto(101), 10.100000000000001);

    }

    @Test
    void caso9() {
        assertEquals(pratica.calcularDescontos(0), 0);
        assertEquals(pratica.calcularDescontos(10), 1);
        assertEquals(pratica.calcularDescontos(20), 2);
        assertEquals(pratica.calcularDescontos(30), 4);
        assertEquals(pratica.calcularDescontos(40), 5);
        assertEquals(pratica.calcularDescontos(50), 6);
        assertEquals(pratica.calcularDescontos(60), 8);
        assertEquals(pratica.calcularDescontos(70), 9);
        assertEquals(pratica.calcularDescontos(80), 9);
        assertEquals(pratica.calcularDescontos(90), 4.5);
        assertEquals(pratica.calcularDescontos(100), 10);

    }

    @Test
    void caso10() {
        assertNull(pratica.validarData("2024-05-65 23:00:01"));
        assertNull(pratica.validarData("05-08-2025 22:00:01"));
        assertNull(pratica.validarData("2024-05-65 25:00:01"));
        assertNotNull(pratica.validarData("2024-10-14 00:00:00"));
      
    }

}
