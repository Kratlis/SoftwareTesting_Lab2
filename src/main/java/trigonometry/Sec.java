package trigonometry;

import functions.Function;

public class Sec extends Function {
    private Cos cosFunction = new Cos(getPrecision());

    public Sec(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        return 1 / cosFunction.calculate(x);
    }

    public void setCos(Cos cosFunction) {
        this.cosFunction = cosFunction;
    }

    public Cos getCos() {
        return cosFunction;
    }
}
