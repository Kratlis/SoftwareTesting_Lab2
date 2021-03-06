import functions.FunctionsSystem;
import instruments.CsvLogger;
import log.LogFunction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.TrigonometryFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class SystemTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private FunctionsSystem functionsSystem;

    @AfterAll
    public void logInCSV() {
        functionsSystem = new FunctionsSystem(ACCURACY, new TrigonometryFunction(ACCURACY), new LogFunction(ACCURACY));
        CsvLogger csvLogger = new CsvLogger("system_test.csv", -5.1, 4.9, 0.2);
        csvLogger.log(functionsSystem);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemTest(float x, float expected) {
        functionsSystem = new FunctionsSystem(ACCURACY, SystemMocks.getTrigonometryFunctionMock(), SystemMocks.getLogFunctionMock());
        double actual = functionsSystem.calculate(x);
        assertEquals(expected, actual, DELTA);
    }

}
