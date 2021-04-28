import functions.FunctionsSystem;
import instruments.CsvLogger;
import log.LogFunction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import trigonometry.TrigonometryFunction;
import trigonometryTests.TrigonometryMocks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class TrigonometryFunctionsCosSinStubsTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.0001;

    private FunctionsSystem functionsSystem;

    @AfterAll
    public void logInCSV() {
        functionsSystem = new FunctionsSystem(ACCURACY, new TrigonometryFunction(ACCURACY), new LogFunction(ACCURACY));
        CsvLogger csvLogger = new CsvLogger("trig_func1.csv", -5.1, 4.9, 0.2);
        csvLogger.log(functionsSystem);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void trigonometryFunctionTest(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        trigonometryFunction.setCsc(TrigonometryMocks.getCscMock());
        trigonometryFunction.setCot(TrigonometryMocks.getCotMock());
        trigonometryFunction.setSec(TrigonometryMocks.getSecMock());
        trigonometryFunction.setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setTan(TrigonometryMocks.getTanMock());
        trigonometryFunction.setSin(TrigonometryMocks.getSinMock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, SystemMocks.getLogFunctionMock());
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscTest(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        trigonometryFunction.getCsc().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.setCot(TrigonometryMocks.getCotMock());
        trigonometryFunction.setSec(TrigonometryMocks.getSecMock());
        trigonometryFunction.setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setTan(TrigonometryMocks.getTanMock());
        trigonometryFunction.setSin(TrigonometryMocks.getSinMock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, SystemMocks.getLogFunctionMock());
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotTest(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        trigonometryFunction.getCsc().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getCot().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getCot().setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setSec(TrigonometryMocks.getSecMock());
        trigonometryFunction.setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setTan(TrigonometryMocks.getTanMock());
        trigonometryFunction.setSin(TrigonometryMocks.getSinMock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, SystemMocks.getLogFunctionMock());
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotSecTest(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        trigonometryFunction.getCsc().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getCot().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getCot().setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.getSec().setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setTan(TrigonometryMocks.getTanMock());
        trigonometryFunction.setSin(TrigonometryMocks.getSinMock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, SystemMocks.getLogFunctionMock());
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/functions_system_test_data.csv")
    public void systemCscCotSecTanTest(float x, float expected) {
        TrigonometryFunction trigonometryFunction = new TrigonometryFunction(ACCURACY);
        trigonometryFunction.getCsc().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getCot().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getCot().setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.getSec().setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.getTan().setSin(TrigonometryMocks.getSinMock());
        trigonometryFunction.getTan().setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setCos(TrigonometryMocks.getCosMock());
        trigonometryFunction.setSin(TrigonometryMocks.getSinMock());
        functionsSystem = new FunctionsSystem(ACCURACY, trigonometryFunction, SystemMocks.getLogFunctionMock());
        double actual = functionsSystem.calculate(x);
        double delta = Math.abs(expected) > 100 / DELTA ? Math.abs(expected) / 1 / DELTA : DELTA;
        assertEquals(expected, actual, delta);
    }
}
