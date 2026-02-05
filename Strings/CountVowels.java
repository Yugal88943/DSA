package Strings;
// Count vowels name in String
public class CountVowels {
    public static void main(String[] args) {
        String str = "Eleven";
        int count = 0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if("AEIOUaeiou".indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println("Vowels: "+ count);
    }
}
