import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số tiền gửi: ");
        double money = scanner.nextDouble();
        System.out.println("nhập tháng gửi: ");
        int month = scanner.nextInt();

        while(month != 3 && month != 6 && month != 9 && month != 12) {
            System.out.println("chúng tôi chỉ hỗ tr gói 3-6-9-12, vui lòng nhập lại tháng gửi: ");
            month = scanner.nextInt();
        }

        System.out.println("tổng tiền đáo hạn sau "+month+" tháng là: "+calculator(month,money));
    }
    public static double calculator(int month, double money){
        double result = 0.0;
        double interest = 0.0;
        switch (month){
            case 3:
                interest = (double)3/100;
                result = money*month*interest/12;
                break;
            case 6:
                interest = (double)6/100;
                result = money*month*interest/12;
                break;
            case 9:
                interest = (double)8/100;
                result = money*month*interest/12;
                break;
            case 12:
                interest = (double)10/100;
                result = money*month*interest/12;
                break;
//            default:
//                System.out.println("ngân hàng ch hỗ trợ các gói 3-6-9-12, vui lòng nhập lại tháng: ");
//                Scanner scanner = new Scanner(System.in);
//                month = scanner.nextInt();
//                System.out.println("nhập số tiền gửi: ");
//                money = scanner.nextDouble();
//                calculator(month,money);
        }
        return result;
    }
}