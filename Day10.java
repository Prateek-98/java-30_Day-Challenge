import java.util.Scanner;

public class Day10 {

    public static double  averageKilometres(int x, int y, int z ){
        double convertedDistance = x * 1.60934;
        return (convertedDistance / y) / z;
    }

//    Call of Above function to get the avg KMs per day.
    public static void main(String[] args) {
        Scanner enterValue = new Scanner(System.in);
        int totalDistance = enterValue.nextInt();
        int totalDays = enterValue.nextInt();
        int totalStopesPerDay = enterValue.nextInt();
        try{
            System.out.println("Average Kilometres between each stop : " + averageKilometres(totalDistance,totalDays,totalStopesPerDay));
        } catch (Exception e) {
            throw new ArithmeticException(e + "Invalid Mathematical values");
        }
    }


}
