package no.satyam.ocp.chap1;

/**
   Line C 
 * @author satyam
 */
public class EnumDemo {

    public static void main(String[] args) {
        for (Seasons season : Seasons.values()) {
            System.out.println("season " + season.ordinal() + " " + season.name());
            //prints the same with the following line of code
            //System.out.println("season " + season.ordinal() + " " + season);
        }

        Seasons season = Seasons.SUMMER;
        switch (season) {
            //OBS. Seasons.WINTER does not work here
            case WINTER:
                System.out.println("Go to ski");
                break;
            case SUMMER:
                System.out.println("Go to swim");
                break;
        }

        Integer summerOrder = Seasons.SUMMER.ordinal();
        switch (summerOrder) {
            case 1:
                System.out.println("Go to ski");
                break;
            case 2:
                System.out.println("Go to swim");
                break;
        }
    }
}

//OBS. declaration as public enum Seasons is not allowed here. Such declaration is only allowed if the enum is defined in a seperate file.
enum Seasons {
    WINTER, SPRING, SUMMER, AUTUM
}
