package trigonometry;

import functions.Function;

public class Cot extends Function {
    private final Sin sinFunction = new Sin(getPrecision());
    private final Cos cosFunction = new Cos(getPrecision());

    protected Cot(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        return cosFunction.calculate(x) / sinFunction.calculate(x);
    }
}
