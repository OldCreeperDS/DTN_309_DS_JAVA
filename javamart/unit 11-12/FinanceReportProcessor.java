//Сафронов Дмитрий ДТН-309-0 11-12 задача
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Payment {
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


    // Конструктор копирования
    public Payment(Payment other) {
        this(other.fullName, other.day, other.month, other.year, other.amount);
    }

    // Геттеры
    public String getFullName() { return fullName; }
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    public int getAmount() { return amount; }

    // Сеттеры
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }
    public void setAmount(int amount) { this.amount = amount; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
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
        int rubles = amount / 100;
        int kopecks = amount % 100;
        return String.format("Плательщик: %s, дата: %02d.%02d.%d, сумма: %d руб. %02d коп.",
                fullName, day, month, year, rubles, kopecks);
    }
}

class FinanceReport {
    private Payment[] payments;
    private String reporterName;
    private int reportDay;
    private int reportMonth;
    private int reportYear;

    public FinanceReport(Payment[] payments, String reporterName, int day, int month, int year) {
        this.payments = deepCopy(payments);
        this.reporterName = reporterName;
        this.reportDay = day;
        this.reportMonth = month;
        this.reportYear = year;
    }

    // Конструктор копирования
    public FinanceReport(FinanceReport other) {
        this(other.payments, other.reporterName, other.reportDay, other.reportMonth, other.reportYear);
    }

    private Payment[] deepCopy(Payment[] source) {
        Payment[] copy = new Payment[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = new Payment(source[i]);
        }
        return copy;
    }

    public int getPaymentCount() {
        return payments.length;
    }

    public Payment getPayment(int index) {
        if (index < 0 || index >= payments.length) {
            throw new IndexOutOfBoundsException("Invalid payment index: " + index);
        }
        return payments[index];
    }

    public void setPayment(int index, Payment payment) {
        if (index < 0 || index >= payments.length) {
            throw new IndexOutOfBoundsException("Invalid payment index: " + index);
        }
        payments[index] = new Payment(payment);
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getReportDate() {
        return String.format("%02d.%02d.%d", reportDay, reportMonth, reportYear);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("[Автор: %s, дата: %s, Платежи: [\n",
                reporterName, getReportDate()));

        for (Payment p : payments) {
            sb.append(p.toString()).append("\n");
        }

        sb.append("]]");
        return sb.toString();
    }
}

class FinanceReportProcessor {
    private static Scanner scanner = new Scanner(System.in);

    public static FinanceReport filterBySurnameInitial(FinanceReport report) {
        System.out.print("Введите начальную букву фамилии: ");
        char initial = scanner.nextLine().toLowerCase().charAt(0);

        List<Payment> filtered = new ArrayList<>();
        for (int i = 0; i < report.getPaymentCount(); i++) {
            Payment p = report.getPayment(i);
            String surname = p.getFullName().split(" ")[0].toLowerCase();
            if (!surname.isEmpty() && surname.charAt(0) == initial) {
                filtered.add(new Payment(p));
            }
        }

        return new FinanceReport(
                filtered.toArray(new Payment[0]),
                report.getReporterName() + " (фильтр по '" + initial + "')",
                report.getPaymentCount() > 0 ? report.getPayment(0).getDay() : 1,
                report.getPaymentCount() > 0 ? report.getPayment(0).getMonth() : 1,
                report.getPaymentCount() > 0 ? report.getPayment(0).getYear() : 2023
        );
    }

    public static FinanceReport filterByAmountLessThan(FinanceReport report) {
        System.out.print("Введите максимальную сумму в рублях: ");
        double maxAmount = scanner.nextDouble();
        scanner.nextLine();
        int maxKopecks = (int)(maxAmount * 100);

        List<Payment> filtered = new ArrayList<>();
        for (int i = 0; i < report.getPaymentCount(); i++) {
            Payment p = report.getPayment(i);
            if (p.getAmount() < maxKopecks) {
                filtered.add(new Payment(p));
            }
        }

        return new FinanceReport(
                filtered.toArray(new Payment[0]),
                report.getReporterName() + " (фильтр по сумме < " + maxAmount + ")",
                report.getPaymentCount() > 0 ? report.getPayment(0).getDay() : 1,
                report.getPaymentCount() > 0 ? report.getPayment(0).getMonth() : 1,
                report.getPaymentCount() > 0 ? report.getPayment(0).getYear() : 2023
        );
    }

    public static int getTotalAmountByDate(FinanceReport report) {
        System.out.print("Введите дату в формате dd.mm.yy: ");
        String dateStr = scanner.nextLine();

        String[] parts = dateStr.split("\\.");
        if (parts.length != 3) return 0;

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = 2000 + Integer.parseInt(parts[2]);

        int total = 0;
        for (int i = 0; i < report.getPaymentCount(); i++) {
            Payment p = report.getPayment(i);
            if (p.getDay() == day && p.getMonth() == month && p.getYear() == year) {
                total += p.getAmount();
            }
        }

        return total;
    }

    public static List<String> getMonthsWithoutPayments(FinanceReport report, int year) {
        Set<Integer> monthsWithPayments = new HashSet<>();
        for (int i = 0; i < report.getPaymentCount(); i++) {
            Payment p = report.getPayment(i);
            if (p.getYear() == year) {
                monthsWithPayments.add(p.getMonth());
            }
        }

        String[] monthNames = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (!monthsWithPayments.contains(i)) {
                result.add(monthNames[i-1]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Создаем тестовые данные
        Payment[] payments = {
                new Payment("Иванов Иван Иванович", 15, 1, 23, 15000), // 150 руб
                new Payment("Петров Петр Петрович", 20, 2, 23, 20075), // 200.75 руб
                new Payment("Сидоров Сидор Сидорович", 10, 1, 23, 5025), // 50.25 руб
                new Payment("Алексеев Алексей Алексеевич", 5, 4, 23, 30000) // 300 руб
        };

        FinanceReport report = new FinanceReport(payments, "Главный бухгалтер", 1, 6, 2023);

        // Меню для тестирования
        while (true) {
            System.out.println("\nМеню FinanceReportProcessor:");
            System.out.println("1. Фильтр по начальной букве фамилии");
            System.out.println("2. Фильтр по сумме платежа");
            System.out.println("3. Сумма платежей на дату");
            System.out.println("4. Месяцы без платежей в году");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    FinanceReport filteredByLetter = filterBySurnameInitial(report);
                    System.out.println("\nРезультат фильтрации:");
                    System.out.println(filteredByLetter);
                    break;

                case 2:
                    FinanceReport filteredByAmount = filterByAmountLessThan(report);
                    System.out.println("\nРезультат фильтрации:");
                    System.out.println(filteredByAmount);
                    break;

                case 3:
                    int total = getTotalAmountByDate(report);
                    System.out.println("\nСумма платежей: " + (total/100) + " руб. " + (total%100) + " коп.");
                    break;

                case 4:
                    System.out.print("Введите год для проверки (например, 23): ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    List<String> emptyMonths = getMonthsWithoutPayments(report, 2000 + year);
                    System.out.println("\nМесяцы без платежей:");
                    if (emptyMonths.isEmpty()) {
                        System.out.println("Все месяцы содержат платежи");
                    } else {
                        emptyMonths.forEach(System.out::println);
                    }
                    break;

                case 5:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}