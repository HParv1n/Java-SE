package Math;

import Math.inter.MathFunction;

public class CosFunction implements MathFunction {

    @Override
    public String getName() {
        return "Cosinus";
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
