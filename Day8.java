

public class Day8 {
    public static void main(String[] args) {
        float howardWorkingHours = 8.0F;
        float peaseWorkingHours = 10.0F;
        float campbellWorkingHours = 9.0F;
        float graceWorkingHours = 8.0F;
        float macCarthyWorkingHours = 7.0F;
        float murphyWorkingHours = 12.0F;

//    Calculating Average working hours of each Nurse.
    try {
        float sumOfWorkingHours = (howardWorkingHours + peaseWorkingHours + campbellWorkingHours + macCarthyWorkingHours + murphyWorkingHours + graceWorkingHours);
        float averageWorkingHours = sumOfWorkingHours / 6.0f;

        System.out.println("Average Working Hours of each Nurse is : " + averageWorkingHours);
    } catch (Exception e) {
        throw new RuntimeException(e + "Invalid Calculation");
    }

    }
}
