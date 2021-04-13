package trigonometry;

import functions.Function;

public class Csc extends Function {
    private Sin sinFunction = new Sin(getPrecision());


    public Csc(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        return 1 / sinFunction.calculate(x);
    }

    public void setSin(Sin sin) {
        sinFunction = sin;
    }
}
