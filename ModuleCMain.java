package modulec;

import modulea.ModuleACalculator;
import moduleb.ModuleBCalculator;

public class ModuleCMain {
    public static void main(String[] args) {
        ModuleACalculator calculatorA = new ModuleACalculator();
        ModuleBCalculator calculatorB = new ModuleBCalculator();

        int result1 = calculatorA.add(10, 5);
        int result2 = calculatorB.multiply(10, 5);
        int result3 = calculatorB.addAndMultiply(2, 3, 4);

        System.out.println("Addition Result: " + result1);
        System.out.println("Multiplication Result: " + result2);
        System.out.println("Addition and Multiplication Result: " + result3);
    }
}
