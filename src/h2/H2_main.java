package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 10, j = 12, k = 13, min = 20, max = 20;

        min = i;

        if (j < min) {
            min = j;
        }

        if (k < min) {
            min = k;
        }

        max = i;

        if (j > max) {
            min = j;
        }

        if (k > max) {
            min = k;
        }

    }
}
