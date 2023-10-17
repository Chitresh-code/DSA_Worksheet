package DSA_Worksheet.DSA_Codesheet.Java;

public class Erastosthenes {
    public static void main(String[] args) {
        erastothenes(20);

    }

    static void erastothenes(int n) {
        boolean prime[] = new boolean[n + 1];   //making boolean array
        for (int i = 0; i <= n; i++) {
            prime[i] = true;        //initializing all the elements true
        }


        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {               //using isPrime function from another class.
                System.out.println(i);      //printing numbers
                for (int j = i * i; j <= n; j = j + i) {     //making multiples(not prime numbers)
                    prime[j] = false;                        //false
                }
            }
        }

    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i*i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

