public class Main {

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;

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
