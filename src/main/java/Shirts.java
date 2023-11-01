public class Shirts {
    public static void main(String[] args) {
        final int shirtPrice = 3500;
        int SelectedShirts = 2;
        int forDiscount = 5;
        int AddShirts = forDiscount - SelectedShirts;
        int PriceSelectedShirts = shirtPrice * SelectedShirts;
        int PriceAddShirts = shirtPrice * AddShirts;
        double discount = 0.5;
        double DiscountedShirtPrices = shirtPrice * forDiscount * discount;
        double DiscountedOneShirtPrices = shirtPrice * discount;
        double SavingMoney = shirtPrice * forDiscount - DiscountedShirtPrices;
        double FreeShirts = ((PriceSelectedShirts + PriceAddShirts) - DiscountedShirtPrices) / shirtPrice;

        System.out.println("Цена одной рубашки: " + shirtPrice);
        System.out.println("Выбрано рубашек: " + SelectedShirts);
        System.out.println("Рубашек нужно, чтобы получить скидку: " + forDiscount);
        System.out.println("Рубашек нужно добавить для получения скидки: " + AddShirts);
        System.out.println("Цена выбранных рубашек без скидки: " + PriceSelectedShirts);
        System.out.println("Цена рубашек, которые надо докупить (без скидки): " + PriceAddShirts);
        System.out.println("Процент скидки: " + discount);
        System.out.println("Цена всех рубашек со скидкой: " + DiscountedShirtPrices);
        System.out.println("Цена одной рубашки со скидкой: " + DiscountedOneShirtPrices);
        System.out.println("Количество сэкономленных денег: " + SavingMoney);
        System.out.println("Количество халявных рубашек: " + FreeShirts);
    }
}
