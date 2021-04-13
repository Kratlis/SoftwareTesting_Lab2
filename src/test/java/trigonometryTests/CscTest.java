package trigonometryTests;

import instruments.CsvLogger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.Csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;


@TestInstance(value = PER_CLASS)
public class CscTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Csc csc;

    @AfterAll
    public void logInCSV() {
        csc = new Csc(ACCURACY);
        csc.setSin(TrigonometryMocks.getSinMock());
        CsvLogger csvLogger = new CsvLogger("csc.csv", -5, -1, 0.1);
        csvLogger.log(csc);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csc_test_data.csv")
    public void tableValuesStubsTest(float x, float expected) {
        csc = new Csc(ACCURACY);
        csc.setSin(TrigonometryMocks.getSinMock());
        double actual = csc.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        csc = new Csc(ACCURACY);
        csc.setSin(TrigonometryMocks.getSinMock());
        assertThrows(IllegalArgumentException.class,
                () -> csc.calculate(Double.NaN));
    }

    @Test
    public void positiveInfinityStubsTest() {
        csc = new Csc(ACCURACY);
        csc.setSin(TrigonometryMocks.getSinMock());
        double expected = Double.NaN;
        double actual = csc.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        csc = new Csc(ACCURACY);
        csc.setSin(TrigonometryMocks.getSinMock());
        double expected = Double.NaN;
        double actual = csc.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
