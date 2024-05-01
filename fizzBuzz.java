public class fizzBuzz {
    public static void main(String[] args) {
        int num = 100;

        for (int i = 1; i <= num; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Buzz " + i);
            }
        }
    }
}
