public class SieveOfEratosthenes {
    public static int find20thPrime() {
        int count = 0;  // Count of prime numbers found
        int limit = 1000000;  // A sufficiently large limit to find the 20th prime

        // Create a boolean array "prime[0..limit]" and initialize all entries as true.
        // A value in prime[i] will finally be false if i is Not a prime, else true.
        boolean[] prime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++)
            prime[i] = true;

        for (int p = 2; p * p <= limit; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p]) {
                count++;
                if (count == 20)
                    return p;

                // Update all multiples of p
                for (int i = p * p; i <= limit; i += p)
                    prime[i] = false;
            }
        }

        // If we reach here, then there are less than 20 primes in the range, so return -1
        return -1;
    }

    public static void main(String[] args) {
        int twentiethPrime = find20thPrime();

        if (twentiethPrime != -1)
            System.out.println("The 20th prime number is: " + twentiethPrime);
        else
            System.out.println("Less than 20 primes found in the specified range.");
    }
}
