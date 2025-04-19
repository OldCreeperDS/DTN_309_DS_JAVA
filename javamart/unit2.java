//Сафронов Дмитрий ДТН-309-0 2 задача
import java.util.Scanner;
public class unit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String sfirst = sc.nextLine();
        System.out.println("Введите строку:");
        String ssecond = sc.nextLine();
        if(ssecond == null || ssecond.isEmpty()){
            System.out.println("Ошибка, данное действие не возможно");
        } else {
            int count = sfirst.length() - sfirst.replace(String.valueOf(ssecond), "").length();
            System.out.println("Значение " + ssecond + " повтореяеться:" + count + " раз");
            sc.close();
        }
    }
}

