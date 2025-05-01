import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.AtividadeStringUtil;

public class AtividadeStringUtilTest {

    @Test
     void testInverterString() {
        assertEquals(AtividadeStringUtil.inverterString("hello"), "olleh");
        assertEquals(AtividadeStringUtil.inverterString(""), "");
        assertEquals(AtividadeStringUtil.inverterString("#!#!"), "!#!#");
    }

    @Test
    void  contarVogais() {
        assertEquals(AtividadeStringUtil.contarVogais("hello"), 2);
        assertEquals(AtividadeStringUtil.contarVogais("aeiou"), 5);
        assertEquals(AtividadeStringUtil.contarVogais(""), 0);
        assertEquals(AtividadeStringUtil.contarVogais("AAEEee"), 6);
        //assertEquals(AtividadeStringUtil.contarVogais("EÉÉéêÊãÃ"), 8);
        
    }

    @Test
    void testIsPalindromo() {
        assertEquals(AtividadeStringUtil.isPalindromo("madam"), true);
        assertEquals(AtividadeStringUtil.isPalindromo("hello"), false);
        assertEquals(AtividadeStringUtil.isPalindromo("  "), true);
        assertEquals(AtividadeStringUtil.isPalindromo("Madam"), true);
        assertEquals(AtividadeStringUtil.isPalindromo("12321"), true);
        assertEquals(AtividadeStringUtil.isPalindromo("ábá"), true);
    }
 
}
