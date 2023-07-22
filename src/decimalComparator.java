public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Scaled = int (num1 * 1000);
        int num2Scaled = int (num2 * 1000);

        return num1Scaled == num2Scaled;
    }

    public static void main(String[] args) {
        double num1 = -3.1756;
        double num2 = -3.175;
        boolean result1 = areEqualByThreeDecimalPlaces(num1, num2);
        System.out.println("Comparing " + num1 + " and " + num2 + ": " + result1);

        double num3 = 3.175;
        double num4 = 3.176;
        boolean result2 = areEqualByThreeDecimalPlaces(num3, num4);
        System.out.println("Comparing " + num3 + " and " + num4 + ": " + result2);

        double num5 = 3.0;
        double num6 = 3.0;
        boolean result3 = areEqualByThreeDecimalPlaces(num5, num6);
        System.out.println("Comparing " + num5 + " and " + num6 + ": " + result3);

        double num7 = -3.123;
        double num8 = 3.123;
        boolean result4 = areEqualByThreeDecimalPlaces(num7, num8);
        System.out.println("Comparing " + num7 + " and " + num8 + ": " + result4);
    }
}