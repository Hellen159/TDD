/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tdd;
import org.junit.Test;


public class AppTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSomarNumerosPositivos() {
        int resultado = calculadora.somar(2, 3);
        Assertions.assertEquals(5, resultado);
    }
    @Test
    public void testSomarNumerosNegativos() {
        int resultado = calculadora.somar(-2, -3);
        Assertions.assertEquals(-5, resultado);
    }

    @Test
    public void testSomarNumeroPositivoENegativo() {
        int resultado = calculadora.somar(2, -3);
        Assertions.assertEquals(-1, resultado);
    }
}




