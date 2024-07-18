public class vowe {
    public static void main(String[] args) {
        String str = "anudip";
        int vowels = 0;
        int consonants = 0;

        // Convert the string to lowercase to handle both cases
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowel count: " + vowels);
        System.out.println("Consonant count: " + consonants);
    }
}
