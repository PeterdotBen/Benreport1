import java.util.Arrays;
import java.util.Random;

/*
     实现双色球抽奖游戏中奖号码的生成
 */

public class Unionlotto {
    public static void main(String[] args) {
        
        Random rd = new Random();
        int [] red = new int[6];
        int num = 0;
        outer: for(int i = 0; i < red.length;i++) {
            num = rd.nextInt(33) +1;
            red[i] =num;
            for(int j = 0; j<red.length; j++) {
                if(red[j] == num) {
                    System.out.println("已有数字");
                    continue outer;
                }
            }
            red [i]= num;
            
        }
        int blue = rd.nextInt(16)+1;
        System.out.println("红色球号: " + Arrays.toString(red) + "\n蓝号: " + blue);




    }
}


// import java.util.Arrays;
// import java.util.Random;





// public class UnionLotto {
    
//     public static void main(String[] args) {
//         Random rd = new Random();
//         int [] red = new int [6];
//         int num = 0;
//         outer:for(int i=0; i < red.length;i++) {
//             num = rd.nextInt(33) +1;
//             red[i] = num;
//             for(int j=0; j< red.length; j++) {
//                 if(red[j] == num) {
//                     System.out.println("已有数字");
//                     continue outer;
//                 }
//             }
//             red[i] = num;
//             i++;

            

//         }
//         int blue = rd.nextInt(16) + 1;
//         System.out.println("红色球号: " + Arrays.toString(red) + "\n蓝号: " + blue);

//     }
// }
