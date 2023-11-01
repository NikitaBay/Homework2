public class Universe {
    public static void main(String[] args) {
        long AgeUniverse = 13000000000L;    // лет
        int AgeHuman = 100000;              // лет
        long OldUniverse = AgeUniverse/AgeHuman;

        System.out.println("Возраст Вселенной: " + AgeUniverse);
        System.out.println("Возраст человека как вида: " + AgeHuman);
        System.out.println("Вселенная старше человека как вида на: " + OldUniverse);
    }
}
