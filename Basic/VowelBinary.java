public class VowelBinary {

    public static String convert(String str){
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            // Check if vowel
            if("aeiou".indexOf(ch) != -1){
                result += "0";
            }else{
                result +=1;
            }
        }
        return result;
    }


    // Driver code
    public static void main(String[] args) {
        String input = "helloworld";
        System.out.println(convert(input));
    }
    
}
