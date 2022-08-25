package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public static void main(String[] args) {
        tellTheSeason(0);
    }
    public static void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            default -> System.out.println("Wrong month number");
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }
}
