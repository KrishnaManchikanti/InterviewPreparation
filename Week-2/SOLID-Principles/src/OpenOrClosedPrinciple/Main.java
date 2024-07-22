package OpenOrClosedPrinciple;
//Definition:
//Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        AddOperation addOp = new AddOperation();
        SubtractOperation subOp = new SubtractOperation();
        int answerAdd = cal.CalculatorNumber(1,2,addOp);
        int answerSub = cal.CalculatorNumber(1,2,subOp);
        System.out.println(answerAdd +" "+ answerSub);

    }
}
