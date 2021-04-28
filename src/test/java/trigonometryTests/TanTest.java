package trigonometryTests;

import instruments.CsvLogger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.Tan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class TanTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Tan tan;

    @BeforeAll
    public void init() {
        tan = new Tan(ACCURACY);
        tan.setCos(TrigonometryMocks.getCosMock());
        tan.setSin(TrigonometryMocks.getSinMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/tan_test_data.csv")
    public void tableValuesTest(float x, float expected) {
        double actual = tan.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

    @AfterAll
    public void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("tan.csv", -5, -1, 0.1);
        csvLogger.log(tan);
    }

    @Test
    public void nanTest() {
        assertThrows(IllegalArgumentException.class,
                () -> tan.calculate(Double.NaN));
    }

    @Test
    public void positiveInfinityTest() {
        double expected = Double.NaN;
        double actual = tan.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityTest() {
        double expected = Double.NaN;
        double actual = tan.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
