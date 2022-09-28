public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int leastSignificantDigit = number % 10;
        int mostSignificantDigit = 0;


        do {
            number /= 10;
            mostSignificantDigit = number;

        } while (number / 10 != 0);

        return mostSignificantDigit + leastSignificantDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(2));
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(22));
        System.out.println(sumFirstAndLastDigit(1345));
        System.out.println(sumFirstAndLastDigit(25789));
    }
}
