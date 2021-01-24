import java.util.Scanner;


public class JudgeDate {
    
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入年份: ");
        int year = sc1.nextInt();
        System.out.println("请输入月份: ");
        int month = sc2.nextInt();
        System.out.println("请输入日期: ");
        int day = sc3.nextInt();
        int count = 0;
        switch (month -1) {
        case 12 :
            count += 31;
        case 11:
            count +=30;
        case 10:
            count +=31;
        case 9:
            count += 30;
        case 8:
            count += 31;
        case 7:
            count += 31;
        case 6:
            count += 30;
        case 5:
            count += 31;
        case 4:
            count += 30;
        case 3:
            count += 31;
        case 2:
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                count += 29;
            }else{
                count += 28;
            }
        case 1:
            count += 31;
        }
        count += day;
        System.out.printf("输入日期是%s年的" + count + "天", year);
        sc1.close();
        sc2.close();
        sc3.close();
   

    }

}
