import java.util.Arrays;

/*
    编程题 自定义数组扩容规则，当已存储元素数量达到总容量的 80%时，
    扩容 1.5 倍。 例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，
    容量从 10 变 15。
*/
public class ExpandArrays {

    public static void main(String[] args) {
        int[] arr = new int [10];
        for(int i =0; i<arr.length && i < 20; i++) {
            System.out.println("当前元素为" + i + "个");
            if((i+1)*1.0/arr.length > 0.8) {
                System.out.println("The arrary has over 80%");
                int[] newArr = new int[(int) (arr.length *1.5)];
                System.arraycopy(arr,0,newArr,0,arr.length);
                arr = newArr;
            }
            System.out.printf("添加第%d个元素当前数组长度为%d:%s\n", i+1,arr.length,Arrays.toString(arr));

        }
    }

}



// import java.util.Arrays;

// public class ArraysAdd {
    
//     public static void main(String[] args) {
        
//         int[] arr = new int[10];
//         for(int i = 0; i< arr.length;i++) {
//             System.out.println("当前元素为" + i +"个");
//             if((i+1) * 1.0 / arr.length > 0.8) {
//                 System.out.println("The arrary has over 80%, this will expend 1.5 time");
//                 int[] newArr = new int[(int) (arr.length * 1.5)];
//                 System.arraycopy(arr, 0, newArr, 0, arr.length);
//                 arr = newArr;

//             }
//             arr[i] = i + 1;
//             System.out.printf(("Add%delement, the length of element is %d:%s\n"), i+1, arr.length, Arrays.toString(arr));
//         }
//     }
// }
