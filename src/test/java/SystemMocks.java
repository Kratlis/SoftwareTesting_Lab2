import log.LogFunction;
import org.mockito.AdditionalMatchers;
import trigonometry.TrigonometryFunction;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SystemMocks {

    public static LogFunction getLogFunctionMock() {
        LogFunction logFunction = mock(LogFunction.class);

        when(logFunction.calculate(AdditionalMatchers.eq(0.2, 0.1))).thenReturn(72.8924);
        when(logFunction.calculate(AdditionalMatchers.eq(0.5, 0.1))).thenReturn(0.002968);
        when(logFunction.calculate(AdditionalMatchers.eq(0.8, 0.1))).thenReturn(0.0000000037);
        when(logFunction.calculate(AdditionalMatchers.eq(1.0, 0.1))).thenReturn(0.0);
        when(logFunction.calculate(AdditionalMatchers.eq(1.2, 0.1))).thenReturn(0.0000000003);
        when(logFunction.calculate(AdditionalMatchers.eq(1.5, 0.1))).thenReturn(0.00000476);

        return logFunction;
    }

    public static TrigonometryFunction getTrigonometryFunctionMock() {
        TrigonometryFunction trigonometryFunction = mock(TrigonometryFunction.class);

        when(trigonometryFunction.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(0.0);
        when(trigonometryFunction.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(-0.5463);
        when(trigonometryFunction.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(-0.85451);
        when(trigonometryFunction.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(-1.5574);
        when(trigonometryFunction.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(-0.85451);
        when(trigonometryFunction.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(-0.5463);
        when(trigonometryFunction.calculate(AdditionalMatchers.eq(0.0, 0.1))).thenReturn(0.0);

        return trigonometryFunction;
    }

}
