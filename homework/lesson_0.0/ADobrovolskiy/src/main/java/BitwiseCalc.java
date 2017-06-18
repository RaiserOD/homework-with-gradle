public class BitwiseCalc {

public static String and(String binaryLeft, String binaryRight) {
    String result = "";
    for(int i = 0; i < binaryLeft.length(); i++)
     {
       char chLeft = (char) binaryLeft.charAt(i);
       char chRight = (char) binaryRight.charAt(i);
         if (chLeft == '1' && chRight == '1')
            {
             result = result + "1";
            }
         else {
              result = result + "0";
              }
     }

 return result;

}

public static String or(String binaryLeft, String binaryRight) {
  String result = "";
  for(int i = 0; i < binaryLeft.length(); i++) {
    char chLeft = (char) binaryLeft.charAt(i);
    char chRight = (char) binaryRight.charAt(i);
     if (chLeft == '0' && chRight == '0')
     {
        result = result + "0";
     }

     else { result = result + "1"; }

   }
  return  result;

}

public static String xor(String binaryLeft, String binaryRight) {
  String result = "";
  for(int i = 0; i < binaryLeft.length(); i++) {
    char chLeft = (char) binaryLeft.charAt(i);
    char chRight = (char) binaryRight.charAt(i);
     if (chLeft != chRight)
     {
        result = result + "1";
     }

     else { result = result + "0"; }

     }
  return  result;

}

public static String not(String binary) {
         String result = "";
         for(int i = 0; i < binary.length(); i++) {
           char chBinary = (char) binary.charAt(i);
            if (chBinary == '1')
            {
               result = result + "0";
            }

            else { result = result + "1"; }
        }
      return  result;
    }

}
