package trigonometry;

import functions.Function;

public class TrigonometryFunction extends Function {

    private Cos cos;
    private Sin sin;
    private Tan tan;
    private Cot cot;
    private Csc csc;
    private Sec sec;

    public TrigonometryFunction(double precision) {
        super(precision);

        cos = new Cos(precision);
        sin = new Sin(precision);
        tan = new Tan(precision);
        cot = new Cot(precision);
        csc = new Csc(precision);
        sec = new Sec(precision);
    }


    @Override
    public Double calculate(double x) {
        return ((Math.pow((((((((Math.pow(sin.calculate(x), 3) / sec.calculate(x)) - tan.calculate(x))
                + (sin.calculate(x) - csc.calculate(x))) / sec.calculate(x)) * sec.calculate(x))
                - (Math.pow((sin.calculate(x) - cot.calculate(x)), 2) * Math.pow(cot.calculate(x), 3)))
                * tan.calculate(x)), 3)

                - ((((cot.calculate(x) + sin.calculate(x)) - (sec.calculate(x) - cos.calculate(x)))
                * cos.calculate(x)) + ((sin.calculate(x)
                + ((sin.calculate(x) / cos.calculate(x)) / cot.calculate(x))) /
                ((cot.calculate(x) * tan.calculate(x)) * cos.calculate(x)))))

                * (Math.pow(((csc.calculate(x) + sec.calculate(x)) -
                ((tan.calculate(x) + Math.pow((sin.calculate(x) / sin.calculate(x)), 2)) +
                        (cos.calculate(x) - tan.calculate(x)))), 2)
                / ((tan.calculate(x) / (sec.calculate(x) - cot.calculate(x)))
                + (sin.calculate(x) * tan.calculate(x)))));
    }

    public void setCos(Cos cos) {
        this.cos = cos;
    }

    public void setCsc(Csc csc) {
        this.csc = csc;
    }

    public void setSin(Sin sin) {
        this.sin = sin;
    }

    public void setTan(Tan tan) {
        this.tan = tan;
    }

    public void setCot(Cot cot) {
        this.cot = cot;
    }

    public void setSec(Sec sec) {
        this.sec = sec;
    }
}
