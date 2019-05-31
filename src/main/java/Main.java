import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int counter = 0;
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(100);
        }

        for (int i = 0; i < (2 * tab.length); i++) {

            System.out.print(tab[counter] + " ");
            if (i < tab.length) {
                counter++;
                if (counter == tab.length) {
                    counter--;
                }

            } else {
                counter--;
            }
        }
    }
}
