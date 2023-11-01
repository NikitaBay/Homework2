public class Glass {
    public static void main(String[] args) {
        final int glassVolume = 200;    // мл
        double FillingGlass = 0.3999;    // %
        double WaterVolume = glassVolume * FillingGlass;

        System.out.println("Объем стакана: " + glassVolume);
        System.out.println("Стакан заполнен на (%): " + FillingGlass);
        System.out.println("Объем воды в стакане (мл): " + WaterVolume);
    }
}
