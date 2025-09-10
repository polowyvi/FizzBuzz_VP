package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int countOfMultiples = 0;

        for (int i = 1; i < n; i++) {

            boolean multipleOf3 = i % a == 0;
            boolean multipleOf5 = i % b == 0;

            if (multipleOf3 || multipleOf5) {

                countOfMultiples++;
            }
        }
        return countOfMultiples;
    }}
