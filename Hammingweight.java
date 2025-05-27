public class Hammingweight {

    // 1st method: using division and modulus
    int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }

    // 2nd method: using bitwise operator
    static int hammingWeightBitwise(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1; // unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        Hammingweight obj = new Hammingweight();

        int result1 = obj.hammingWeight(1839);
        System.out.println("Using division method: " + result1);

        int result2 = hammingWeightBitwise(5);
        System.out.println("Using bitwise method: " + result2);
    }
}
