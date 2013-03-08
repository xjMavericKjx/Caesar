package caesar;

public class Caesar_1 {
    private static String alphabet = "abcdefghijklmonpqrstuvwxyz";

    public static String encrypt(String encryptText, int shift){
        return crypt(encryptText,shift);
    }

    public static String decrypt(String encryptText, int shift){
        return crypt(encryptText,-shift);
    }

    public static int findCharPosition(char ch){
        int positionNumber =0;
        for(int i = 0; i<alphabet.length(); i++){
            if (ch == alphabet.charAt(i)) {
                positionNumber = i;
                break;
            } else {
                positionNumber = 0;
            }
        }
        return positionNumber;
    }

    private static String crypt(String encryptText, int shift){
        String endString = "";
        int encryptStringLength = encryptText.length();
        for (int i = 0; i < encryptStringLength; i++){
            endString += cryptChar(encryptText.charAt(i),shift);
        }
        return endString;
    }
    public static String GetAlphabet(){
            return alphabet;
    }
    public static char cryptChar(char ch, int shift){
        char endChar = ' ';
        int alphabetsLength = alphabet.length();
        for(int j = 0; j < alphabetsLength; j++){
            if(ch == alphabet.charAt(j)){
                int temp = j + shift + alphabetsLength;
                while(temp >= alphabetsLength) {
                    temp -= alphabetsLength;
                }
                endChar = alphabet.charAt(temp);
            }
        }
        return endChar;
    }
}
