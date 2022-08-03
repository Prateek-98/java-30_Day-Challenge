import java.util.Arrays;

public class Day5 {
    public static void main(String[] args) {
        int[] timeArr = {66,57,54,53,64,52,59};
        bubbly(timeArr);
        System.out.println(Arrays.toString(timeArr));
    }


    static void bubbly(int[] arr){
        boolean SwapCheck;
        for (int i = 0; i < arr.length ; i++) {
            SwapCheck = false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    SwapCheck = true;
                }
            }
            if (!SwapCheck){
                break;
            }
        }
    }
}
