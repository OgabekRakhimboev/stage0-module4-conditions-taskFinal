package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void main(String[] args) {
        printDays(2024, 2);
    }
    public static void printDays(int year, int month) {
        if (year > 0 && month > 0 && month < 13){
            switch (month){
                default:
                    System.out.println("wrong number!");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(31);
                    break;
                case 2:
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                System.out.println(29);
                            } else {
                                System.out.println(28);
                            }
                        } else {
                            System.out.println(29);
                        }
                    } else {
                        System.out.println(28);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;

            }
        }
        else {
            System.out.println("invalid date");
        }
    }
}
