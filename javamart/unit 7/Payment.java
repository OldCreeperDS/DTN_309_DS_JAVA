//Сафронов Дмитрий ДТН-309-0 7 задача
import java.util.Objects;
import java.util.Scanner;

public class Payment {
    private String fullName;
    private int day;
    private int month;
    private int year;
    private int amount; // в копейках

    public Payment(String fullName, int day, int month, int year, int amount) {
        this.fullName = fullName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.amount = amount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // equals, hashCode, toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        src2.Payment payment = (src2.Payment) o;
        return day == payment.day &&
                month == payment.month &&
                year == payment.year &&
                amount == payment.amount &&
                Objects.equals(fullName, payment.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, day, month, year, amount);
    }

    @Override
    public String toString() {
        return String.format("Платеж: %s, Дата: %02d.%02d.%d, Сумма: %d коп.",
                fullName, day, month, year, amount);
    }


    public static src2.Payment createFromScanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные платежа:");
        System.out.print("ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("День: ");
        int day = scanner.nextInt();

        System.out.print("Месяц: ");
        int month = scanner.nextInt();

        System.out.print("Год: ");
        int year = scanner.nextInt();

        System.out.print("Сумма (в копейках): ");
        int amount = scanner.nextInt();

        return new src2.Payment(fullName, day, month, year, amount);
    }

    public static void main(String[] args) {
        src2.Payment payment = src2.Payment.createFromScanner();
        System.out.println("\nСоздан платеж:");
        System.out.println(payment);

    }
}
