public class DyadicArray {                                                                      
    public static void main(String[] args) {
        String[][] arr1 = new String[17][17];
        for(int i = 0;i< arr1.length;i++) {
            for(int j = 0; j< arr1[0].length; j++) {
                
                if (i==0){
                    arr1[i][j] = String.format("%x", j);
                }else if(j==0) {
                    arr1[i][j] = String.format("%x", i);
                }else{
                    arr1[i][j] = "+";
                }

            }
        }
        arr1[0][0] =" ";
        for(int i = 0; i < arr1.length; i++) {
            for(int j =0; j< arr1[i].length;j++) {
                System.out.print(arr1[i][j] + " ");

            }
            System.out.println();
        }
    }

}

