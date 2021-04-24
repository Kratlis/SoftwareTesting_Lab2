package functions;

public class FunctionsSystem extends Function {

    private final Function trigonometryFunction;
    private final Function logFunction;

    public FunctionsSystem(double precision, Function trigonometryFunction, Function logFunction) {
        super(precision);

        this.trigonometryFunction = trigonometryFunction;
        this.logFunction = logFunction;
    }

    @Override
    public Double calculate(double x) {
        if (x <= 0) {
            return trigonometryFunction.calculate(x);
        } else {
            return logFunction.calculate(x);
        }
    }

}
