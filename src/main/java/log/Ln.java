package log;

import functions.Function;

public class Ln extends Function {

    public Ln(double precision) {
        super(precision);
    }

    @Override
    public Double calculate(double x) {
        if (Double.isNaN(x) || x < 0.0) {
            return Double.NaN;
        } else if (x == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else if (x == 0.0) {
            return Double.NEGATIVE_INFINITY;
        }

        if (x == 1.0) {
            return 0.0;
        }
        double arg = (x - 1) / (x + 1);
        double sum = 0.0;
        double pow = arg;
        for (int i = 1; i < 100; i += 2) {
            sum += pow / i;
            pow *= arg * arg;
        }
        return 2 * sum;

    }

}
