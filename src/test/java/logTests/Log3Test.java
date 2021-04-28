package logTests;

import log.Log3;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;


@TestInstance(value=PER_CLASS)
public class Log3Test {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private Log3 log3;

    @AfterAll
    public void logInCSV() {
        log3 = new Log3(ACCURACY);
        instruments.CsvLogger csvLogger = new instruments.CsvLogger("log3.csv", 1, 5, 0.1);
        csvLogger.log(log3);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/log3_test_data.csv")
    public void tableValuesStubsTest(float x, float expected) {
        log3 = new Log3(ACCURACY);
        log3.setLn(LogMocks.getLnMock());
        double actual = log3.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void nanStubsTest() {
        log3 = new Log3(ACCURACY);
        log3.setLn(LogMocks.getLnMock());
        double expected = Double.NaN;
        double actual = log3.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void positiveInfinityStubsTest() {
        log3 = new Log3(ACCURACY);
        log3.setLn(LogMocks.getLnMock());
        double expected = Double.NaN;;
        double actual = log3.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void negativeInfinityStubsTest() {
        log3 = new Log3(ACCURACY);
        log3.setLn(LogMocks.getLnMock());
        double expected = Double.NaN;
        double actual = log3.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
