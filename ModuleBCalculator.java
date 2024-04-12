package moduleb;

import modulea.ModuleACalculator;

public class ModuleBCalculator {
    private ModuleACalculator moduleACalculator;

    public ModuleBCalculator() {
        this.moduleACalculator = new ModuleACalculator();
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int addAndMultiply(int a, int b, int c) {
        return multiply(moduleACalculator.add(a, b), c);
    }
}
