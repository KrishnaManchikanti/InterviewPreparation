package OpenOrClosedPrinciple;

public class Calculator {
    public int CalculatorNumber(int number1, int number2, Operation operation){
        return operation.perform(number1, number2);
    }
}
