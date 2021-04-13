package trigonometryTests;

import instruments.CsvLogger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.Sec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
// todo: sec, cot, tan
@TestInstance(value = PER_CLASS)

public class SecTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Sec sec;

    @AfterAll
    public void logInCSV() {
        sec = new Sec(ACCURACY);
        sec.setCos(TrigonometryMocks.getCosMock());
        sec.getCos().setSin(TrigonometryMocks.getSinMock());
        CsvLogger csvLogger = new CsvLogger("sec.csv", -5, -1, 0.1);
        csvLogger.log(sec);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sec_test_data.csv")
    public void tableValuesStubsTest(float x, float expected) {
        sec = new Sec(ACCURACY);
        sec.setCos(TrigonometryMocks.getCosMock());
        sec.getCos().setSin(TrigonometryMocks.getSinMock());
        double actual = sec.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        sec = new Sec(ACCURACY);
        sec.setCos(TrigonometryMocks.getCosMock());
        sec.getCos().setSin(TrigonometryMocks.getSinMock());
        assertThrows(IllegalArgumentException.class,
                () -> sec.calculate(Double.NaN));
    }

    @Test
    public void positiveInfinityStubsTest() {
        sec = new Sec(ACCURACY);
        sec.setCos(TrigonometryMocks.getCosMock());
        sec.getCos().setSin(TrigonometryMocks.getSinMock());
        double expected = Double.NaN;
        double actual = sec.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        sec = new Sec(ACCURACY);
        sec.setCos(TrigonometryMocks.getCosMock());
        sec.getCos().setSin(TrigonometryMocks.getSinMock());
        double expected = Double.NaN;
        double actual = sec.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
