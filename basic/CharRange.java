public class CharRange {
    public static void main(String[] args) {
        // Printing the range of char in numeric form
        System.out.println("Char range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        // Printing the range of char in Unicode
        System.out.println("Char range in Unicode: " + "\\u" + String.format("%04X", (int) Character.MIN_VALUE) + " to \\u" + String.format("%04X", (int) Character.MAX_VALUE));
    }
}
