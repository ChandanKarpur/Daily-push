class StringRotation {
    public static void main(String[] args) {
        String s1 = "chandan";
        String s2 = "andanch";

        if (isRotation(s1,s2)) {
            System.out.println("Yes, s2 is a rotation of s1");
        } else {
            System.out.println("No, s2 is not a rotation of s1");
        }
    }

    static boolean isRotation(String s1, String s2) {
        // Check length first
        if (s1.length() != s2.length()) {
            return false;
        }

        // Concatenate s1 with itself
        String temp = s1 + s1;

        // Check if s2 is substring of temp
        return temp.contains(s2);
    }
}

