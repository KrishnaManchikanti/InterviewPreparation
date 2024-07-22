package AbstractFactory;

public class ClientCode {
    public static void main(String[] args) {
        int score = 140;

        UniversityFactory abstractUniversityFactory = UniversityFactory.getUniversityFactory(score);
        AdmitCard admitCard = abstractUniversityFactory.getAdmitCard("Math");
        System.out.println(admitCard.getClass());

        FeeCalculator feeCalculator = abstractUniversityFactory.getFeeCalculator("Math");
        System.out.println(feeCalculator.CalculateFee());
    }
}
