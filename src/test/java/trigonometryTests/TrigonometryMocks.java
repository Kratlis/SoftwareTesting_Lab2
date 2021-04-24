package trigonometryTests;

import org.mockito.AdditionalMatchers;
import trigonometry.*;

import static java.lang.Double.*;
import static java.lang.Math.PI;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigonometryMocks {

    public static Cos getCosMock() {
        Cos cos = mock(Cos.class);

        when(cos.calculate(AdditionalMatchers.eq(0.0, 0.1))).thenReturn(1.0);
        when(cos.calculate(AdditionalMatchers.eq(0.5235988, 0.1))).thenReturn(0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(0.7853982, 0.1))).thenReturn(0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(1.0471976, 0.1))).thenReturn(0.5);
        when(cos.calculate(AdditionalMatchers.eq(1.5707963, 0.1))).thenReturn(0.00000002679);
        when(cos.calculate(AdditionalMatchers.eq(2.0943951, 0.1))).thenReturn(-0.5);
        when(cos.calculate(AdditionalMatchers.eq(2.3561945, 0.1))).thenReturn(-0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(2.6179939, 0.1))).thenReturn(-0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(3.1415927, 0.1))).thenReturn(-1.0);
        when(cos.calculate(AdditionalMatchers.eq(3.6651914, 0.1))).thenReturn(-0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(3.9269908, 0.1))).thenReturn(-0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(4.1887902, 0.1))).thenReturn(-0.5);
        when(cos.calculate(AdditionalMatchers.eq(4.7123890, 0.1))).thenReturn(0.0);
        when(cos.calculate(AdditionalMatchers.eq(5.2359878, 0.1))).thenReturn(0.5);
        when(cos.calculate(AdditionalMatchers.eq(5.4977871, 0.1))).thenReturn(0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(5.7595865, 0.1))).thenReturn(0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(6.2831853, 0.1))).thenReturn(1.0);
        when(cos.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(-1.0471976, 0.1))).thenReturn(0.5);
        when(cos.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(0.0);
        when(cos.calculate(AdditionalMatchers.eq(-2.0943951, 0.1))).thenReturn(-0.5);
        when(cos.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(-0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(-0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(-1.0);
        when(cos.calculate(AdditionalMatchers.eq(-3.6651914, 0.1))).thenReturn(-0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(-3.9269908, 0.1))).thenReturn(-0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(-4.1887902, 0.1))).thenReturn(-0.5);
        when(cos.calculate(AdditionalMatchers.eq(-4.7123890, 0.1))).thenReturn(0.0);
        when(cos.calculate(AdditionalMatchers.eq(-5.2359878, 0.1))).thenReturn(0.5);
        when(cos.calculate(AdditionalMatchers.eq(-5.4977871, 0.1))).thenReturn(0.7071068);
        when(cos.calculate(AdditionalMatchers.eq(-5.7595865, 0.1))).thenReturn(0.8660254);
        when(cos.calculate(AdditionalMatchers.eq(-6.2831853, 0.1))).thenReturn(1.0);
        when(cos.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cos.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cos.calculate(NaN)).thenThrow(IllegalArgumentException.class);

        return cos;
    }

    public static Sin getSinMock() {
        Sin sin = mock(Sin.class);

        when(sin.calculate(AdditionalMatchers.eq(0.0, 0.1))).thenReturn(0.0);
        when(sin.calculate(AdditionalMatchers.eq(0.5235988, 0.1))).thenReturn(0.5);
        when(sin.calculate(AdditionalMatchers.eq(0.7853982, 0.1))).thenReturn(0.7071);
        when(sin.calculate(AdditionalMatchers.eq(1.0471976, 0.1))).thenReturn(0.866);
        when(sin.calculate(AdditionalMatchers.eq(1.5707963, 0.1))).thenReturn(1.0);
        when(sin.calculate(AdditionalMatchers.eq(2.0943951, 0.1))).thenReturn(0.866);
        when(sin.calculate(AdditionalMatchers.eq(2.3561945, 0.1))).thenReturn(0.7071);
        when(sin.calculate(AdditionalMatchers.eq(2.6179939, 0.1))).thenReturn(0.49999998);
        when(sin.calculate(AdditionalMatchers.eq(3.1415927, 0.1))).thenReturn(-0.00000004641);
        when(sin.calculate(AdditionalMatchers.eq(3.6651914, 0.1))).thenReturn(-0.49999997);
        when(sin.calculate(AdditionalMatchers.eq(3.9269908, 0.1))).thenReturn(-0.7071);
        when(sin.calculate(AdditionalMatchers.eq(4.1887902, 0.1))).thenReturn(-0.866);
        when(sin.calculate(AdditionalMatchers.eq(4.7123890, 0.1))).thenReturn(-1.0);
        when(sin.calculate(AdditionalMatchers.eq(5.2359878, 0.1))).thenReturn(-0.866);
        when(sin.calculate(AdditionalMatchers.eq(5.4977871, 0.1))).thenReturn(-0.7071);
        when(sin.calculate(AdditionalMatchers.eq(5.7595865, 0.1))).thenReturn(-0.5);
        when(sin.calculate(AdditionalMatchers.eq(6.2831853, 0.1))).thenReturn(0.0);

        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 0.5235988, 0.1))).thenReturn(0.5);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 0.7853982, 0.1))).thenReturn(0.7071);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 1.0471976, 0.1))).thenReturn(0.866);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 1.5707963, 0.1))).thenReturn(1.0);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 2.0943951, 0.1))).thenReturn(0.866);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 2.3561945, 0.1))).thenReturn(0.7071);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 2.6179939, 0.1))).thenReturn(0.49999998);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 3.1415927, 0.1))).thenReturn(0.0);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 3.6651914, 0.1))).thenReturn(-0.49999997);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 3.9269908, 0.1))).thenReturn(-0.7071);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 4.1887902, 0.1))).thenReturn(-0.866);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 4.7123890, 0.1))).thenReturn(-1.0);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 5.2359878, 0.1))).thenReturn(-0.866);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 5.4977871, 0.1))).thenReturn(-0.7071);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 5.7595865, 0.1))).thenReturn(-0.5);
        when(sin.calculate(AdditionalMatchers.eq(2 * PI + 6.2831853, 0.1))).thenReturn(0.0);

        when(sin.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(-0.5);
        when(sin.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(-0.7071);
        when(sin.calculate(AdditionalMatchers.eq(-1.0471976, 0.1))).thenReturn(-0.866);
        when(sin.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(-1.0);
        when(sin.calculate(AdditionalMatchers.eq(-2.0943951, 0.1))).thenReturn(-0.866);
        when(sin.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(-0.7071);
        when(sin.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(-0.49999997);
        when(sin.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(0.0);
        when(sin.calculate(AdditionalMatchers.eq(-3.6651914, 0.1))).thenReturn(0.49999998);
        when(sin.calculate(AdditionalMatchers.eq(-3.9269908, 0.1))).thenReturn(0.7071);
        when(sin.calculate(AdditionalMatchers.eq(-4.1887902, 0.1))).thenReturn(0.866);
        when(sin.calculate(AdditionalMatchers.eq(-4.7123890, 0.1))).thenReturn(1.0);
        when(sin.calculate(AdditionalMatchers.eq(-5.2359878, 0.1))).thenReturn(0.866);
        when(sin.calculate(AdditionalMatchers.eq(-5.4977871, 0.1))).thenReturn(0.7071);
        when(sin.calculate(AdditionalMatchers.eq(-5.7595865, 0.1))).thenReturn(0.5);
        when(sin.calculate(AdditionalMatchers.eq(-6.2831853, 0.1))).thenReturn(0.0);
        when(sin.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(sin.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(sin.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return sin;
    }

    public static Csc getCscMock() {
        Csc csc = mock(Csc.class);

        when(csc.calculate(AdditionalMatchers.eq(0.5235988, 0.1))).thenReturn(2.0);
        when(csc.calculate(AdditionalMatchers.eq(0.7853982, 0.1))).thenReturn(1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(1.0471976, 0.1))).thenReturn(1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(1.5707963, 0.1))).thenReturn(1.0);
        when(csc.calculate(AdditionalMatchers.eq(2.0943951, 0.1))).thenReturn(1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(2.3561945, 0.1))).thenReturn(1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(2.6179939, 0.1))).thenReturn(2.0);
        when(csc.calculate(AdditionalMatchers.eq(3.1415927, 0.1))).thenReturn(-21546984.376);
        when(csc.calculate(AdditionalMatchers.eq(3.6651914, 0.1))).thenReturn(-2.0);
        when(csc.calculate(AdditionalMatchers.eq(3.9269908, 0.1))).thenReturn(-1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(4.1887902, 0.1))).thenReturn(-1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(4.7123890, 0.1))).thenReturn(-1.0);
        when(csc.calculate(AdditionalMatchers.eq(5.2359878, 0.1))).thenReturn(-1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(5.4977871, 0.1))).thenReturn(-1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(5.7595865, 0.1))).thenReturn(-2.0);
        when(csc.calculate(AdditionalMatchers.eq(6.2831853, 0.1))).thenReturn(0.137209);
        when(csc.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(-2.0);
        when(csc.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(-1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(-1.0471976, 0.1))).thenReturn(-1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(-1.0);
        when(csc.calculate(AdditionalMatchers.eq(-2.0943951, 0.1))).thenReturn(-1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(-1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(-2.0);
        when(csc.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(21546984.376);
        when(csc.calculate(AdditionalMatchers.eq(-3.6651914, 0.1))).thenReturn(2.0);
        when(csc.calculate(AdditionalMatchers.eq(-3.9269908, 0.1))).thenReturn(1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(-4.1887902, 0.1))).thenReturn(1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(-4.7123890, 0.1))).thenReturn(1.0);
        when(csc.calculate(AdditionalMatchers.eq(-5.2359878, 0.1))).thenReturn(1.1547005);
        when(csc.calculate(AdditionalMatchers.eq(-5.4977871, 0.1))).thenReturn(1.4142136);
        when(csc.calculate(AdditionalMatchers.eq(-5.7595865, 0.1))).thenReturn(2.0);
        when(csc.calculate(AdditionalMatchers.eq(-6.2831853, 0.1))).thenReturn(139283787.89);
        when(csc.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return csc;
    }

    public static Sec getSecMock() {
        Sec sec = mock(Sec.class);

        when(sec.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(1.1547);
        when(sec.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(1.4142136);
        when(sec.calculate(AdditionalMatchers.eq(-1.0471976, 0.1))).thenReturn(2.0);
        when(sec.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(37320539.59);
        when(sec.calculate(AdditionalMatchers.eq(-2.0943951, 0.1))).thenReturn(-2.0);
        when(sec.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(-1.4142136);
        when(sec.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(-1.1547);
        when(sec.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(-1.0);
        when(sec.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(sec.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(sec.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return sec;
    }

    public static Cot getCotMock() {
        Cot cot = mock(Cot.class);

        when(cot.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(-1.732054);
        when(cot.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(-1.0);
        when(cot.calculate(AdditionalMatchers.eq(-1.0471976, 0.1))).thenReturn(-0.57735);
        when(cot.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(0.0);
        when(cot.calculate(AdditionalMatchers.eq(-2.0943951, 0.1))).thenReturn(0.57735);
        when(cot.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(1.0);
        when(cot.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(1.732054);
        when(cot.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(-21546984.376);
        when(cot.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(cot.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(cot.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return cot;
    }

    public static Tan getTanMock() {
        Tan tan = mock(Tan.class);

        when(tan.calculate(AdditionalMatchers.eq(0.0, 0.1))).thenReturn(0.0);
        when(tan.calculate(AdditionalMatchers.eq(-0.5235988, 0.1))).thenReturn(-0.57735);
        when(tan.calculate(AdditionalMatchers.eq(-0.7853982, 0.1))).thenReturn(-1.0);
        when(tan.calculate(AdditionalMatchers.eq(-1.0471976, 0.1))).thenReturn(-1.73205);
        when(tan.calculate(AdditionalMatchers.eq(-1.5707963, 0.1))).thenReturn(-37320539.5867);
        when(tan.calculate(AdditionalMatchers.eq(-2.0943951, 0.1))).thenReturn(1.73205);
        when(tan.calculate(AdditionalMatchers.eq(-2.3561945, 0.1))).thenReturn(1.0);
        when(tan.calculate(AdditionalMatchers.eq(-2.6179939, 0.1))).thenReturn(0.57735);
        when(tan.calculate(AdditionalMatchers.eq(-3.1415927, 0.1))).thenReturn(0.0);
        when(tan.calculate(Double.POSITIVE_INFINITY)).thenReturn(NaN);
        when(tan.calculate(Double.NEGATIVE_INFINITY)).thenReturn(NaN);
        when(tan.calculate(NaN)).thenThrow(IllegalArgumentException.class);
        return tan;
    }
}
