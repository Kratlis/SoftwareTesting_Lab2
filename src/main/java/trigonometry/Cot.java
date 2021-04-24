package trigonometry;

import functions.Function;

public class Cot extends Function {
    private Sin sinFunction = new Sin(getPrecision());
    private Cos cosFunction = new Cos(getPrecision());

    public Cot(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        return cosFunction.calculate(x) / sinFunction.calculate(x);
    }

    public void setSin(Sin sinFunction) {
        this.sinFunction = sinFunction;
    }

    public void setCos(Cos cosFunction) {
        this.cosFunction = cosFunction;
    }
}
