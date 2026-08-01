package basicmaths;
import java.util.Scanner;

public class CountAllDigits {
   public CountAllDigits() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = 0;
      if (var2 == 0) {
         var3 = 1;
      } else {
         while(var2 > 0) {
            ++var3;
            var2 /= 10;
         }
      }

      System.out.println(var3);
      var1.close();
   }
}
