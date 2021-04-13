package trigonometry;

import functions.Function;

public class Tan extends Function {
    private final Sin sinFunction = new Sin(getPrecision());
    private final Cos cosFunction = new Cos(getPrecision());

    protected Tan(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        return sinFunction.calculate(x) / cosFunction.calculate(x);
    }
}
