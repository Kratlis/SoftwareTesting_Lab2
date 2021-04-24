package trigonometry;

import functions.Function;

public class Tan extends Function {
    private Sin sinFunction = new Sin(getPrecision());
    private Cos cosFunction = new Cos(getPrecision());

    public Tan(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        return sinFunction.calculate(x) / cosFunction.calculate(x);
    }

    public void setSin(Sin sinFunction) {
        this.sinFunction = sinFunction;
    }

    public void setCos(Cos cosFunction) {
        this.cosFunction = cosFunction;
    }
}
