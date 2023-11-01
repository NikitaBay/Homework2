public class MortgagePayment {
    public static void main(String[] args) {
        final int apartmentCost = 5000000;
        double InitialPayment = 0.415;       // %
        double SumInitialPayment = apartmentCost * InitialPayment;

        System.out.println("Стоимость квартиры: " + apartmentCost);
        System.out.println("Процент первоначального взноса: " + InitialPayment);
        System.out.println("Сумма первоначального взноса: " + SumInitialPayment);
    }
}
