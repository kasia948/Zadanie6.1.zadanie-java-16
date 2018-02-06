import java.util.Arrays;
import java.util.Random;

public class ZadJav16 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }

        System.out.print(Arrays.toString(tab));
        for (int j = tab.length-1; j >=0 ; j--) {
            System.out.print(" "+tab[j]);
        }
    }
}