package Lesson7.View;

import Lesson7.Controller.CalculatorController;

public class Main {
    public static void main(String[] args) {
        CalculatorInput calculatorInput = new CalculatorInput();
        CalculatorController calculatorController = new CalculatorController(calculatorInput);
        calculatorController.realizeCalculate();
    }
}
