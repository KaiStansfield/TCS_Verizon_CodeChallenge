import java.util.List;
import java.util.ArrayList;

public class GenerateRandomNumbers{

     public static void main(String []args){
        generateRandomNumbers(50);
     }
     
     void generateRandomNumbers(int n) {
         if (n > 0) {
             List<Integer> list = new ArrayList<Integer>();
             for (int i = 1; i <= n; i++) {
                 list.add(i);
             }
             while (list.size() > 0) {
                 double intervalValue = 1.0/list.size();
                 double randomValue = Math.random();
                 int idx = (int)Math.floor(randomVal/floorValue);
                 System.out.println(list.get(idx));
                 list.remove(idx);
             }
         } else {
             System.out.println("number should be greater than 0");
         }
     }
}