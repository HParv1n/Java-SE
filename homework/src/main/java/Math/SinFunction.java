package Math;

import Math.inter.MathFunction;

public class SinFunction implements MathFunction {


    @Override
    public String getName() {
        return "Sinus";
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
