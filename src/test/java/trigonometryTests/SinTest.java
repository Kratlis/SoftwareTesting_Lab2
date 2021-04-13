package trigonometryTests;

import instruments.CsvLogger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.Sin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class SinTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Sin sin;

    @BeforeAll
    public void init() {
        sin = new Sin(ACCURACY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sin_test_data.csv")
    public void tableValuesTest(float x, float expected) {
        double actual = sin.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

    @AfterAll
    public void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("sin.csv", -5, -1, 0.1);
        csvLogger.log(sin);
    }

    @Test
    public void nanTest() {
        assertThrows(IllegalArgumentException.class,
                () -> sin.calculate(Double.NaN));
    }

    @Test
    public void positiveInfinityTest() {
        double expected = Double.NaN;
        double actual = sin.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityTest() {
        double expected = Double.NaN;
        double actual = sin.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
