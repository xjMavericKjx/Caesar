package caesar;

public class Vijener {
    private static char[][] matrix = new char[26][26];
    public static char[][] GetMatrix(){
        setMatrix(Caesar_1.GetAlphabet());
        return matrix;
    }
    private static void setMatrix(String alphabet){
        for(int i = 0;  i < alphabet.length(); i++){
            for(int j = 0; j < alphabet.length(); j++){
                matrix[i][j] = alphabet.charAt(j);
            }
            alphabet = Caesar_1.encrypt(alphabet,1);
        }
    }
    public static void printMatrix(){
        GetMatrix();
        for(int i = 0; i<26; i++){
            for(int j = 0; j<26; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static char getCharInMatrix(int i,int j){
        return matrix[i][j];
    }
    public static String encrypt(String encryptText, String keyWord){
        String endText = "";
        for(int i = 0; i < encryptText.length(); i++){
            endText += getCharInMatrix(Caesar_1.findCharPosition(encryptText.charAt(i))
                                        ,Caesar_1.findCharPosition(keyWord.charAt(i%keyWord.length()))+1);
        }
        return endText;
    }
    public static String decrypt(String decryptText, String keyWord){
        String endText = "";
        for(int i = 0; i < decryptText.length(); i++){
            endText += getCharInMatrix(Caesar_1.findCharPosition(decryptText.charAt(i))
                       ,Caesar_1.GetAlphabet().length() - Caesar_1.findCharPosition(keyWord.charAt(i%keyWord.length()))-1);
        }
        return endText;
    }
}
