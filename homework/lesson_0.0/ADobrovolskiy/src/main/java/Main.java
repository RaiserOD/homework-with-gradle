 import java.util.Arrays;
 import java.util.Random;
 public class Main {
   public static void main(String[] args) {

     //Input data of Method AND (&&);
     System.out.println("");
     System.out.println("Method AND (&) result:");
     String leftAND = ("0101");
     String rightAND = ("0100");
     BitwiseCalc objAND = new BitwiseCalc();
     System.out.println(objAND.and(leftAND, rightAND));

     //Input data of Method OR (|)
     System.out.println("");
     System.out.println("Method OR (|) result:");
     String leftOR = "0101";
     String rightOR = "0100";
     BitwiseCalc objOR = new BitwiseCalc();
     System.out.println(objOR.or(leftOR, rightOR));

     //Input data of Method XOR (^)
     System.out.println("");
     System.out.println("Method XOR (|) result:");
     String leftXOR = "0101";
     String rightXOR = "0100";
     BitwiseCalc objXOR = new BitwiseCalc();
     System.out.println(objXOR.xor(leftXOR, rightXOR));

     //Input data of Method NOT (~)
     System.out.println("");
     System.out.println("Method NOT (~) result:");
     String binaryNOT = "0100";
     BitwiseCalc objNOT = new BitwiseCalc();
     System.out.println(objNOT.not(binaryNOT));


     System.out.println("_______");
     int[] inputArr = {1,2,3,4,5,6,7,8,9,0};
     ArraysCopier objConstr = new ArraysCopier(inputArr);
     System.out.println("Входной массив = " + Arrays.toString(inputArr));

     System.out.println("_______");
     int dimention = 15;
     int[] result1 = objConstr.copyOf(dimention);
     System.out.println("Массив CopyOf 15 = " + Arrays.toString(result1));


     System.out.println("_______");
     int start = 2;
     int end = 4;
     int[] result2 = objConstr.copyOfRange(start, end);
     System.out.println("Массив CopyOfRange " + start + " - " + end + " = " + Arrays.toString(result2));

     System.out.println("_______");
     int fillValue = 7;
     int[] result3 = objConstr.fill(fillValue);
     System.out.println("Массив Filling by 7 = " + Arrays.toString(result3));

 }
}
