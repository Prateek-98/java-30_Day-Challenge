public class Day7 {
    public static int multiply(int x, int y){
        int prod;
        if((x | y) != 0){
        prod = x*y;
    } else {
        prod = x*y;
    }
        return prod;
    }
    public static void main(String[] args) {
        int totalPeopleADay = 1200000;
        int totalDaysOfYear = -365;
        System.out.println(multiply(totalPeopleADay,totalDaysOfYear));
    }
}
