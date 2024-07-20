package OpenOrClosedPrinciple;

// now if we want to introduce divison, we have to modify calculator which violates Open/closed Principle
public class BadCalculator {
    public int calculateNumber(int number1, int number2, String type) {
        int result = 0;
        switch (type) {
            case "sum":
                result = number1 + number2;
            case "sub":
                result = number1 - number2;
        }
        return result;
    }
}
