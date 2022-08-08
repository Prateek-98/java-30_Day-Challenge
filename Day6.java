import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int freeBytes = value.nextByte();
        int usedBytes = value.nextByte();
        int deleteBytes = value.nextByte();
        int createBytes = value.nextByte();
        int tempFreeBytes = (freeBytes + usedBytes) - deleteBytes;
        int FreeBytes = tempFreeBytes - createBytes;
        System.out.println("Free bytes in floppy disk is: "+ FreeBytes);

    }

}
