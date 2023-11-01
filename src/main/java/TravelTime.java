public class TravelTime {
    public static void main(String[] args) {
        final int distanceToOffice = 4;     // км
        double AverageTaxiSpeed = 51.35;    // км/ч
        double TesterTravelTime = distanceToOffice / AverageTaxiSpeed;      // часов
        double DecelerationFactor = 1.56;
        double EveningTimeToHome = TesterTravelTime * DecelerationFactor;   // часов

        System.out.println("Расстояние от дома до офиса (км): " + distanceToOffice);
        System.out.println("Средняя скорость такси (км/ч): " + AverageTaxiSpeed);
        System.out.println("Время от дома до офиса (часов): " + TesterTravelTime);
        System.out.println("Коэффициент замедления транспорта вечером: " + DecelerationFactor);
        System.out.println("Время от офиса до дома вечером (часов): " + EveningTimeToHome);
    }
}
