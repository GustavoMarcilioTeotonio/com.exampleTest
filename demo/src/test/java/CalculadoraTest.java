import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Calculadora;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora c = new Calculadora();
            int resultado = c.somar(4, 8);
            assertEquals(resultado, 12);
        
    }

    @Test
    void testclassificarAluno2(){
        Calculadora c = new Calculadora();

        String resultado = c.classificarAluno(3);
        assertEquals(resultado, "Reprovado");

    }

    @Test
    void testclassificarAluno3(){
        Calculadora c = new Calculadora();

        String resultado = c.classificarAluno(6);
        assertEquals(resultado, "Recuperação");

    }

    @Test
    void testclassificarAluno(){
        Calculadora c = new Calculadora();

        String resultado = c.classificarAluno(8);
        assertEquals(resultado, "Aprovado");

    }

    @Test
    void testCalcularQuadrado(){
        Calculadora c = new Calculadora();

        double resultado = c.CalcularQuadrado(4, 8);
        assertEquals(resultado, 32);

    }

    @Test
    void testCalcularTrinangulo(){
        Calculadora c = new Calculadora();

        double resultado = c.CalcularTrinangulo(4, 8);
        assertEquals(resultado, 16);

        resultado = c.CalcularTrinangulo(5, 5);
        assertEquals(resultado, 12.5);

    }

}
