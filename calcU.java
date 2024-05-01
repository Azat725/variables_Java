public class calcU {

    public static double calculateU(double x, double y, double z) {
        return ((x * (z + y) + 2.1 * z - 5.6 * y) / (x - z - 5.6)) * y + (z + 1.1) / (z - 2.0);
    }

    public static void main(String[] args) {
        double result = calculateU(22.3, 12.1, 13.1);
        System.out.println(result);
    }
}
