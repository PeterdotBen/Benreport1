import java.util.Arrays;

/*
    ����� �Զ����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ��
    ���� 1.5 ���� ���磬�������� 10��������� 8 ��Ԫ��ʱ������������ݣ�
    ������ 10 �� 15��
*/
public class ExpandArrays {

    public static void main(String[] args) {
        int[] arr = new int [10];
        for(int i =0; i<arr.length && i < 20; i++) {
            System.out.println("��ǰԪ��Ϊ" + i + "��");
            if((i+1)*1.0/arr.length > 0.8) {
                System.out.println("The arrary has over 80%");
                int[] newArr = new int[(int) (arr.length *1.5)];
                System.arraycopy(arr,0,newArr,0,arr.length);
                arr = newArr;
            }
            System.out.printf("��ӵ�%d��Ԫ�ص�ǰ���鳤��Ϊ%d:%s\n", i+1,arr.length,Arrays.toString(arr));

        }
    }

}



// import java.util.Arrays;

// public class ArraysAdd {
    
//     public static void main(String[] args) {
        
//         int[] arr = new int[10];
//         for(int i = 0; i< arr.length;i++) {
//             System.out.println("��ǰԪ��Ϊ" + i +"��");
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
