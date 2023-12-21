public class Main {
    public static void main(String[] args) throws Exception {
        int list[] = { 1, 3, 5, 7, -9, 11, -1, -3 };

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("min deger : " + min);
        System.out.println("max deger : " + max);
    }
}
