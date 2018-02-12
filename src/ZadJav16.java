import java.util.Random;

public class ZadJav16 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }

        int i = 0;
        int j = tab.length - 1;
        for (; ; )
            if (i < tab.length) {
                System.out.print(" " + tab[i]);
                i++;
            } else if (j >= 0) {
                System.out.print(" " + tab[j]);
                j--;
            }
    }
}