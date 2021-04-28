import functions.FunctionsSystem;
import instruments.CsvLogger;
import log.LogFunction;
import logTests.LogMocks;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.TrigonometryFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class LogFunctionsWithoutStubsTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private FunctionsSystem functionsSystem;

    @AfterAll
    public void logInCSV() {
        functionsSystem = new FunctionsSystem(ACCURACY, new TrigonometryFunction(ACCURACY), new LogFunction(ACCURACY));
        CsvLogger csvLogger = new CsvLogger("log_func2.csv", -4, 3, 0.1);
        csvLogger.log(functionsSystem);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotSecTanCosSinLog3Test(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        LogFunction logFunction = new LogFunction(ACCURACY);
        logFunction.setLn(LogMocks.getLnMock());
        logFunction.setLog5(LogMocks.getLog5Mock());
        logFunction.setLog10(LogMocks.getLog10Mock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, logFunction);
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotSecTanCosSinLog3Log5Test(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        LogFunction logFunction = new LogFunction(ACCURACY);
        logFunction.setLn(LogMocks.getLnMock());
        logFunction.setLog10(LogMocks.getLog10Mock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, logFunction);
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotSecTanCosSinLog3Log5Log10Test(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        LogFunction logFunction = new LogFunction(ACCURACY);
        logFunction.setLn(LogMocks.getLnMock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, logFunction);
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotSecTanCosSinLog3Log5Log10LnTest(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        LogFunction logFunction = new LogFunction(ACCURACY);
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, logFunction);
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);
    }
}
