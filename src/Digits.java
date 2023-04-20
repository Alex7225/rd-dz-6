package src;

public class Digits {
    int[] arrDigit = new int[] {4, 7, 10, 9, 1, 6, 2, 5, 8};

    public int calc()
    {
        int sum = 0;

        for (int j : arrDigit) {
            if (j % 2 == 0) {
                sum = sum + j;
            }

        }
        return sum;
    }
}