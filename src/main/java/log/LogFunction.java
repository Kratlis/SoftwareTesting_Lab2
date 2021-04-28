package log;

import functions.Function;

public class LogFunction extends Function {

    private Ln ln;
    private Log3 log3;
    private Log5 log5;
    private Log10 log10;

    public LogFunction(double precision) {
        super(precision);

        ln = new Ln(precision);
        log3 = new Log3(precision);
        log5 = new Log5(precision);
        log10 = new Log10(precision);
    }

    @Override
    public Double calculate(double x) {
        return Math.pow((((ln.calculate(x) + log3.calculate(x)) - log3.calculate(x)) * (log5.calculate(x) * ln.calculate(x))), 2)
                * Math.pow((ln.calculate(x) * ((log10.calculate(x) + log10.calculate(x)) * log3.calculate(x))), 2);
    }

    public void setLn(Ln ln) {
        this.ln = ln;
    }

    public void setLog3(Log3 log3) {
        this.log3 = log3;
    }

    public void setLog5(Log5 log5) {
        this.log5 = log5;
    }

    public void setLog10(Log10 log10) {
        this.log10 = log10;
    }

    public Log3 getLog3() {
        return log3;
    }

    public Log5 getLog5() {
        return log5;
    }

    public Log10 getLog10() {
        return log10;
    }
}
