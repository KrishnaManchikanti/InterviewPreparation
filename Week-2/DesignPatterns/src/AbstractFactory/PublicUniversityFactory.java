package AbstractFactory;

public class PublicUniversityFactory extends UniversityFactory {
    @Override
    public AdmitCard getAdmitCard(String Course) {
        return null;
    }

    @Override
    public FeeCalculator getFeeCalculator(String Course) {
        return null;
    }
}
