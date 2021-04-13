package log;

import functions.FunctionWithBase;

public class LogN extends FunctionWithBase {

    private Ln ln;

    public LogN(double precision, int base) {
        super(precision, base);
        ln = new Ln(precision);
    }

    @Override
    public Double calculate(double x) {
        return ln.calculate(x) / ln.calculate(getBase());
    }

    public void setLn(Ln ln) {
        this.ln = ln;
    }
}
