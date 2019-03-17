package no.satyam.ocp.chap1;

/**
 *
 * @author satyam
 */
public class EnumConstructorDemo {

    public static void main(String[] args) {
        for (TouristSeasons season : TouristSeasons.values()) {
            season.printVistorsLevel();
        }
    }
}

enum TouristSeasons {
    WINTER("low"), SUMMER("high");
    //its OK not to make it final as well.
    private final String visitors;

    private TouristSeasons(String visitors) {
        this.visitors = visitors;
    }

    private TouristSeasons(TouristSeasons seasons) {
        this.visitors = "";
        if (seasons.visitors != null) {
            System.out.println(seasons.name());
        }
    }

    public void printVistorsLevel() {
        System.out.println(this.name() + " : " + this.visitors);
    }

}
