//Сафронов Дмитрий ДТН-309-0 6 задача
import java.util.regex.*;
import java.util.Scanner;
public class unit6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сколько Васе лет в шестнацетиричной системе в виде 0xNNNNNNNN:");
        String input = sc.nextLine();
        sc.close();
        String output = replaceHexWithDecimal(input);
        System.out.println("Васе " + output +" лет");
    }
    public static String replaceHexWithDecimal(String input) {
        Pattern pattern = Pattern.compile("0x[0-9a-fA-F]{8}");
        Matcher matcher = pattern.matcher(input);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String hexStr = matcher.group();
            long decimalValue = Long.parseLong(hexStr.substring(2), 16);
            matcher.appendReplacement(result, String.valueOf(decimalValue));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
