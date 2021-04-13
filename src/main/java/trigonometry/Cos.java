package trigonometry;

import functions.Function;

public class Cos extends Function {
    private Sin sinFunction = new Sin(getPrecision());

    public Cos(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) throws IllegalArgumentException {
        return sinFunction.calculate(x + Math.PI / 2);
    }

    public void setSin(Sin sin) {
        this.sinFunction = sin;
    }
}
