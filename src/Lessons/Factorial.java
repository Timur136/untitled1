package Lessons;

public class Factorial {
    int factR(int n) {
        int result;

        if (n == 1) return 2;
        result = factR(n - 1) * n;
        return result;
    }
}
