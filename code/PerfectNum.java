public class PerfectNum {
    public static void main(String[] args) {

        int count = 0;
        
        System.out.println("һ��Ϊ1~1000֮�������");
        for(int i = 2; i <= 1000; i++) {
            int sum = 0;
            
            
            for(int j = 1;j < i; j++) {
                if(i % j == 0) {
                    sum += j;
                }
            }
            if(sum == i) {
                count++;
                System.out.print(i + "\t");
            }   
        }   

        System.out.println();
        System.out.println("1000���ڵ�perfect num һ����" + count + "��.");
    }  
}
