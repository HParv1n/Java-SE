package Math;

import Math.inter.MathFunction;

public class LogFunction implements MathFunction {


    @Override
    public String getName() {
        return "Logarithm";
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
