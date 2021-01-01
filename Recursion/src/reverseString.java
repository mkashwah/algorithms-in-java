/**
 * This class implements a reverse string method using recursion
 * @author M. Kashwah
 */
public class reverseString {

    /**
     * This method uses recursion to reverse a string
     * @param str String to be reversed
     * @return Reversed String
     */
    public String reverse(String str){
        String revStr = new String();
        if(str.length() == 0){
            return "";
        } else{
           return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
        }
    }

}
