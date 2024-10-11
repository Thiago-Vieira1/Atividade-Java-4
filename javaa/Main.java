public class Main {
    public static void main(String[] args) {
        // Builder Pattern: Crie uma reserva e adicione serviços complementares
        Reservation standardRoom = new StandardRoom()
            .setNights(3)
            .addBreakfast()
            .addWifi();

        Reservation classicRoom = new ClassicRoom()
            .setNights(5)
            .addBreakfast();

        System.out.println(standardRoom.toString());
        System.out.println(classicRoom.toString());

        // Strategy Pattern: Aplicação das estratégias de preço
        double basePrice = 200.0;
        Booking standardBooking = new Booking(basePrice);
        standardBooking.setPricingStrategy(new StandardPricing());
            
        Booking seasonalBooking = new Booking(basePrice);
        seasonalBooking.setPricingStrategy(new SeasonalPricing());
            
        Booking demandBooking = new Booking(basePrice);
        demandBooking.setPricingStrategy(new DemandPricing());
        
        System.out.println("Standard pricing: $" + standardBooking.applyPricing());
        System.out.println("Seasonal pricing: $" + seasonalBooking.applyPricing());
        System.out.println("Demand pricing: $" + demandBooking.applyPricing());

        // Processo legado de aplicação de preço
        LegacyPricing legacyPayment = new LegacyPricing();
        PricingAdapter adapterPricing = new PricingAdapter(legacyPayment);
        Booking legacyBooking = new Booking(basePrice);
        legacyBooking.setPricingStrategy(adapterPricing);
        System.out.println("Legacy pricing: $" + legacyBooking.applyPricing());
    }
}
