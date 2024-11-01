import org.junit.jupiter.api.*;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Antes de todos testes.");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Antes de cada teste.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Depois de cada teste.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Depois de todos testes.");
    }

    @Test
    public void somaDoisNumeros(){
        int soma = calculadora.soma(10,20);
        Assertions.assertEquals(30, soma);
    }

    @Test
    public void somaOutrosDoisNumeros(){
        int soma = calculadora.soma(7,14);
        Assertions.assertEquals(21, soma);
    }

    @Test
    public void divideDoisNumeros(){
        int divisao = calculadora.divisao(49,7);
        Assertions.assertEquals(7, divisao);
    }

    @Test
    public void verificaSeEPar(){
        boolean verifica = calculadora.verificaPar(14);
        Assertions.assertTrue(verifica);
    }
}
