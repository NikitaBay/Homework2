public class NumberEmployees {
    public static void main(String[] args) {
        final int programmer = 10;
        final int tester1 = 2; // тестировщиков на код одного программиста
        final int support1 = 3; // специалистов поддержки на код одного программиста
        int allTester = programmer * tester1;
        int allSupport = programmer * support1;
        int allEmployees = programmer + allTester + allSupport;

        System.out.println("Количество программистов: " + programmer);
        System.out.println("Количество тестировщиков для теста кода от одного программиста: " + tester1);
        System.out.println("Количество специалистов поддержки по вопросам кода от одного программиста: " + support1);
        System.out.println("Количество тестировщиков: " + allTester);
        System.out.println("Количество специалистов поддержки: " + allSupport);
        System.out.println("Все сотрудники компании: " + allEmployees);
    }
}
