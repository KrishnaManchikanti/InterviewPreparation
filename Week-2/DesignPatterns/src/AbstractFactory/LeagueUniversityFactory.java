package AbstractFactory;

public class LeagueUniversityFactory extends UniversityFactory {

    @Override
    public AdmitCard getAdmitCard(String Course) {
        return switch (Course) {
            case "Math" -> new MISAdmitCard();
            case "Science" -> new SISAdmitCard();
            default -> null;
        };
    }

    @Override
    public FeeCalculator getFeeCalculator(String Course) {
        return switch (Course){
            case "Math" -> new MISFeeCalculator();
            case "Science" -> new SISFeeCalculator();
            default -> null;
        };
    }
}
