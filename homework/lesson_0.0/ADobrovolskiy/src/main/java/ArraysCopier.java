//import java.util.Arrays;
public class ArraysCopier {
    int[] arr;

    ArraysCopier(int[]array) {
      this.arr = array;
    }

    public int[] copyOf(int newLength) {   // возвращает новый массив указанной длины.
       //int l = arr.length;
       int[] result1 = new int[newLength];

       if (arr.length >= newLength) {
         for (int i = 0; i < result1.length; i++) {
            result1[i] = arr[i];
         }

       } else if (arr.length < newLength ) {
             for (int i = 0; i < arr.length; i++) {
                 result1[i] = arr[i];
             }
             for (int i = arr.length; i < result1.length; i++) {
                 result1[i] = 0;
             }
       }

      return result1;
    }

    public int[] copyOfRange(int from, int to) {  // возвращает новый массив начиная с элемента from до элемента to
      int[] result2 = new int[0];
      int cntLeng = 1;
      for (int i = from; i < to-1; i++) {
          cntLeng++;
      }

      if (from < to) {
           result2 = new int[cntLeng];
            for (int i = 0; i < result2.length; i++) {
                result2[i] = arr[from+i];
          }
      }

      if (from > to) {
         result2 = null;
      }

      return result2;
    }

    public int[] fill(int value) {
      int[] result3 = new int [arr.length];             // возвращает новый массив заполненный значением параметра value
        for (int i = 0; i < result3.length; i++) {
          result3[i] = value;
        }
      return result3;
    }

}
