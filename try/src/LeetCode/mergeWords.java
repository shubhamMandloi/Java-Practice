package LeetCode;

public class mergeWords {

    public static String mergeWord(String word1, String word2) {
        StringBuffer result = new StringBuffer();
        if (word1.length() == word2.length()) {
            int i = 0;
            while (i < word2.length()){
                result.append(word1.charAt(i)).append(word2.charAt(i));
                i++;
            }

        } else if (word1.length() > word2.length()) {
            int i = 0;
            while (i < word2.length()){
                result.append(word1.charAt(i)).append(word2.charAt(i));
                i++;
            }
            result.append(word1.substring(i));
        } else{
            int i = 0;
            while (i < word1.length()){
                result.append(word1.charAt(i)).append(word2.charAt(i));
                i++;
            }
            result.append(word2.substring(i));
        }

       return result.toString();
    }

    public static void main(String[] args) {
        System.out.println( mergeWord("ABC", "XYZA"));
    }
}
