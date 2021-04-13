package functions;

public abstract class Function {

    public static final int MAX_ITERATIONS = 1000000;
    public static final double DELTA = 1e-4;

    private final double precision;

    protected Function(double precision) {
        this.precision = precision;
    }

    public double getPrecision() {
        return precision;
    }

    public abstract Double calculate(double x);

}
