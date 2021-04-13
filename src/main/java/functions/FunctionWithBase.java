package functions;

public abstract class FunctionWithBase extends Function {

    private final int base;

    public FunctionWithBase(double precision, int base) {
        super(precision);
        this.base = base;
    }

    public int getBase() {
        return base;
    }

}
