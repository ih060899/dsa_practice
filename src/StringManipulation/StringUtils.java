package StringManipulation;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;

        var count = 0;
        var vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray()) {
//            if (vowels.indexOf(ch) != -1)
            if (vowels.contains(Character.toString(ch))) {
                count++;
            }
        }
         return count;
    }
}
