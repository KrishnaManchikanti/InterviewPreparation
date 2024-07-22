package AbstractFactory;

public class MISFeeCalculator extends FeeCalculator {
    @Override
    public int CalculateFee() {
        return 100000;
    }
}
