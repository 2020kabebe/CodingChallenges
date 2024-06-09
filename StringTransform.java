public class StringTransform {
    public static String transformString(String s) {
        int n = s.length();

        if (n % 15 == 0) {
            // Divisible by both 3 and 5
            StringBuilder reversed = new StringBuilder(s).reverse();
            StringBuilder result = new StringBuilder();
            for (char c : reversed.toString().toCharArray()) {
                result.append((int) c).append(" ");
            }
            return result.toString().trim();
        } else if (n % 5 == 0) {
            // Divisible by 5
            StringBuilder result = new StringBuilder();
            for (char c : s.toCharArray()) {
                result.append((int) c).append(" ");
            }
            return result.toString().trim();
        } else if (n % 3 == 0) {
            // Divisible by 3
            return new StringBuilder(s).reverse().toString();
        } else {
            // Not divisible by 3, 5, or 15
            return s;
        }
    }

    public static void main(String[] args) {
        System.out.println(transformString("Hamburger"));  // Output: regrubmaH
        System.out.println(transformString("Pizza"));  // Output: 80 105 122 122 97
        System.out.println(transformString("Chocolate Chip Cookie"));  // Output: eikooCpihCetalocohC
    }
}