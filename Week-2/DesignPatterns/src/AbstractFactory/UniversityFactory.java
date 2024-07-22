package AbstractFactory;

public abstract class UniversityFactory {
    private static final int cutoff = 120;

    public static UniversityFactory getUniversityFactory(int score){
        if(score > cutoff){
            return new LeagueUniversityFactory();
        }else {
            return new PublicUniversityFactory();
        }
    }

    public abstract AdmitCard getAdmitCard(String Course);
    public abstract FeeCalculator getFeeCalculator(String Course);

}
