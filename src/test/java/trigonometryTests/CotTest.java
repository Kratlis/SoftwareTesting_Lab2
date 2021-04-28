package trigonometryTests;

import instruments.CsvLogger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.Cot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class CotTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Cot cot;

    @BeforeAll
    public void init() {
        cot = new Cot(ACCURACY);
        cot.setCos(TrigonometryMocks.getCosMock());
        cot.setSin(TrigonometryMocks.getSinMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/cot_test_data.csv")
    public void tableValuesTest(float x, float expected) {
        double actual = cot.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

    @AfterAll
    public void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("cot.csv", -5, -1, 0.1);
        csvLogger.log(cot);
    }

    @Test
    public void nanTest() {
        assertThrows(IllegalArgumentException.class,
                () -> cot.calculate(Double.NaN));
    }

    @Test
    public void positiveInfinityTest() {
        double expected = Double.NaN;
        double actual = cot.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityTest() {
        double expected = Double.NaN;
        double actual = cot.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
