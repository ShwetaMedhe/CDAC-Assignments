import java.util.Scanner;

public class Array1D {

    public static void acceptData(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter data:");
            arr[i] = sc.nextInt();
        }
    }

    public static void displayData(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ": " + arr[i] + ",  ");
        }
        System.out.println("\n----------------------------------------------");
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int adddata(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int searchByValue(int[] arr, int f) {
        for (int i = 0; i < arr.length; i++) {
            if (f == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] findAllOccurences(int[] arr, int num) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = -1;
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                temp[cnt++] = i;
            }
        }
        return cnt > 0 ? temp : null;
    }

    public static int findNthMax(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int pos = findMaxpos(arr, i);
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        return arr[n - 1];
    }

    private static int findMaxpos(int[] arr, int start) {
        int pos = start;
        int max = arr[pos];
        for (int i = start + 1; i < arr.length; i++) {
            if (max < arr[i]) {
                pos = i;
                max = arr[i];
            }
        }
        return pos;
    }

    public static int findNthMin(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int pos = findMinPos(arr, i);
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        return arr[n - 1];
    }

    public static int findMinPos(int[] arr, int start) {
        int pos = start;
        int min = arr[pos];
        for (int i = start + 1; i < arr.length; i++) {
            if (min > arr[i]) {
                pos = i;
                min = arr[i];
            }
        }
        return pos;
    }

    public static int[] findPrime(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        int[] prime = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                prime[index] = arr[i];
                index++;
            }
        }
        return prime;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int sumOfOddDigits(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            while (num > 0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
                    sum += digit;
                }
                num /= 10;
            }
        }
        return sum;
    }

    public static void factorialsBelowSeven(int[] arr) {
        for (int num : arr) {
            if (num >= 0 && num < 7) {
                System.out.println("Factorial of " + num + " is " + factorial(num));
            }
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int findNthMaxInPrime(int[] arr, int n) {
        int[] primes = findPrime(arr);
        if (n > primes.length) {
            System.out.println("Not enough prime numbers.");
            return -1;
        }
        return findNthMax(primes, n);
    }

    public static int findNthMinInPrime(int[] arr, int n) {
        int[] primes = findPrime(arr);
        if (n > primes.length) {
            System.out.println("Not enough prime numbers.");
            return -1;
        }
        return findNthMin(primes, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        acceptData(arr);
        displayData(arr);

        int choice;
        do {
            System.out.println("1. Search a number\n2. Find max\n3. Find min");
            System.out.println("4. Add all numbers\n5. Find all occurrences\n6. Find nth maximum");
            System.out.println("7. Find nth minimum\n8. Prime Array\n9. Sum of odd digits");
            System.out.println("10. Factorials of numbers < 7\n11. Nth max in prime array\n12. Nth min in prime array\n13. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to search:");
                    int num = sc.nextInt();
                    int pos = searchByValue(arr, num);
                    System.out.println(pos != -1 ? num + " found at position: " + pos : "Not found");
                    break;
                case 2:
                    System.out.println("Maximum number: " + findMax(arr));
                    break;
                case 3:
                    System.out.println("Minimum number: " + findMin(arr));
                    break;
                case 4:
                    System.out.println("Sum of all numbers: " + adddata(arr));
                    break;
                case 5:
                    System.out.println("Enter data to search:");
                    num = sc.nextInt();
                    int[] arrpos = findAllOccurences(arr, num);
                    if (arrpos != null) {
                        System.out.println("All positions are:");
                        displayData(arrpos);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 6:
                    System.out.println("Enter n:");
                    int n = sc.nextInt();
                    System.out.println(n + "th maximum value: " + findNthMax(arr, n));
                    break;
                case 7:
                    System.out.println("Enter n:");
                    n = sc.nextInt();
                    System.out.println(n + "th minimum value: " + findNthMin(arr, n));
                    break;
                case 8:
                    int[] primearray = findPrime(arr);
                    System.out.println("Prime numbers:");
                    for (int i = 0; i < primearray.length; i++) {
                        System.out.print(primearray[i] + " ");
                    }
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Sum of odd digits: " + sumOfOddDigits(arr));
                    break;
                case 10:
                    factorialsBelowSeven(arr);
                    break;
                case 11:
                    System.out.println("Enter n:");
                    n = sc.nextInt();
                    int nthMaxPrime = findNthMaxInPrime(arr, n);
                    if (nthMaxPrime != -1)
                        System.out.println(n + "th max in prime array: " + nthMaxPrime);
                    break;
                case 12:
                    System.out.println("Enter n:");
                    n = sc.nextInt();
                    int nthMinPrime = findNthMinInPrime(arr, n);
                    if (nthMinPrime != -1)
                        System.out.println(n + "th min in prime array: " + nthMinPrime);
                    break;
                case 13:
                    System.out.println("Thank you for visiting...");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 13);
    }
}
