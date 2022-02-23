
public class Main {

    static Validation v = new Validation();

    static int exponentiationOfTen(int a, int n) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret *= 10;
        }
        return a * ret;
    }
    
    static int swapDigitPairs(int input){
        int lengthOfInput = v.checkLength(input);
        int[] digit = new int[lengthOfInput];

        for (int i = lengthOfInput - 1; i >= 0; i--) {
            digit[i] = input % 10;
            input /= 10;
        }

        if (lengthOfInput % 2 == 0) {
            for (int i = 0; i < lengthOfInput - 1; i += 2) {
                if (digit[i] != digit[i + 1]) {
                    int temp = digit[i];
                    digit[i] = digit[i + 1];
                    digit[i + 1] = temp;
                }
            }
        } else {
            for (int i = 1; i < lengthOfInput - 1; i += 2) {
                if (digit[i] != digit[i + 1]) {
                    int temp = digit[i];
                    digit[i] = digit[i + 1];
                    digit[i + 1] = temp;
                }
            }
        }

        int result = 0;
        int count = 0;
        for (int i = lengthOfInput - 1; i >= 0; i--) {
            result += exponentiationOfTen(digit[i], count);
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int input = v.checkInt(1, Integer.MAX_VALUE);
        System.out.println("After swap: ");
        System.out.println(swapDigitPairs(input));
    }
}
