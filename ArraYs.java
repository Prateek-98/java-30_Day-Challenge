import java.lang.reflect.Array;

public class ArraYs {
//    1st way of defining array in java....
    public static String text[] = {"Ram","Tom","topi","moti"};

//    2nd way of defining array.........


    public static void main(String[] args) {
        int numBers[] = new int[6];
        numBers[0] = 1;
        numBers[1] = 2;
        numBers[2] = 3;
        numBers[3] = 4;
        numBers[4] = 5;
        numBers[5] = 6;

        System.out.println(text[3]);

//        for (int i:numBers
//             ) {
//            System.out.println(i);
//        }


//        for (int j = 0;j< text.length;j++){
//            System.out.println();
//        }


//        for (String name:text){
//            System.out.println(name);
//        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numBers[j] + " ");

            }
            System.out.println();

        }

    }
}
