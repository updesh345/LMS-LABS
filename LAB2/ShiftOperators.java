public class ShiftOperators {
    public static void main(String[] args) {
        // Declare and assign an integer variable
        int number = 8; // You can change this value for testing

        // Perform left shifts
        int leftShiftBy1 = number << 1;
        int leftShiftBy2 = number << 2;

        // Perform right shifts
        int rightShiftBy1 = number >> 1;
        int rightShiftBy2 = number >> 2;

        // Print results
        System.out.println("Original number: " + number);
        System.out.println("After left shift by 1 place: " + leftShiftBy1);
        System.out.println("After left shift by 2 places: " + leftShiftBy2);
        System.out.println("After right shift by 1 place: " + rightShiftBy1);
        System.out.println("After right shift by 2 places: " + rightShiftBy2);
    }
}
