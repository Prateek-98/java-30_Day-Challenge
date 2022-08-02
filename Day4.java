public class Day4 {
     static int hotDogs = 400;
     static int hotDogsPerPacket = 8;
    public static void main(String[] args) {
        int coumter = 0;
        int temp = hotDogs;
        while (temp > 0) {
            temp = temp - hotDogsPerPacket;
            coumter += 1;
        }
        System.out.println("Total no of Packages of HotDogs: " + coumter);
    }

}
