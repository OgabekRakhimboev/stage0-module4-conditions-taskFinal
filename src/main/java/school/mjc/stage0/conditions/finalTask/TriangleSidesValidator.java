package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public static void main(String[] args) {
        validate(1, 4, 4);
    }
    public static void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide == 0 || secondSide == 0 || thirdSide == 0){
            System.out.println("it's not a triangle");
        } else if (firstSide+secondSide>thirdSide && secondSide+thirdSide>firstSide && firstSide+thirdSide>secondSide){
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }
}
