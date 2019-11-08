package pl.edu.wszib;

import org.junit.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void initData() {
        System.out.println("BeforeClass method !!");
        calculator = new Calculator();
    }

    @AfterClass
    public static void destroyData() {
        System.out.println("AfterClass method !!");
        calculator = null;
    }

    @Before
    public void beforeMethod() {
        System.out.println("BeforeMethod !!");
    }

    @After
    public void afterMethod() {
        System.out.println("AfterMethod !!");
    }

    public CalculatorTest() {
        System.out.println("Konstruktor !!");
    }

    @Test
    public void positiveSumTest() {
        // przygotowanie danych
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void negativeSumTest() {
        // przygotowanie danych
        int a = -3;
        int b = -5;
        int expectedResult = -8;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void zeroAndNegativeSumTest() {
        // przygotowanie danych
        int a = 0;
        int b = -10;
        int expectedResult = -10;

        // wykonanie testu
        int result = CalculatorTest.calculator.add(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void positiveNegativeMultiplyTest() {
        // przygotowanie danych
        int a = 5;
        int b = -10;
        int expectedResult = -50;

        // wykonanie testu
        int result = CalculatorTest.calculator.multipy(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void posiviteDivideTest() {
        // przygotowanie danych
        int a = 5;
        int b = 2;
        double expectedResult = 2.5;

        // wykonanie testu
        double result = CalculatorTest.calculator.divide(a, b);

        // asercja
        Assert.assertEquals(expectedResult, result, 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        // przygotowanie danych
        int a = 5;
        int b = 0;

        // wykonanie testu
        CalculatorTest.calculator.divide(a, b);
    }
}
