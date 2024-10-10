public class Main {
    public static void main(String[] args) {
        // Builder Pattern: Crie uma reserva e adicione serviços complementares
        Reservation standardRoom = new StandardRoom();

        Reservation classicRoom = new ClassicRoom();

        System.out.println(standardRoom.toString());
        System.out.println(classicRoom.toString());

        // Strategy Pattern: Aplicação das estratégias de preço
        double basePrice = 200.0;
        Booking standardBooking = 
        standardBooking.setPricingStrategy(200);
            
        Booking seasonalBooking = 
        seasonalBooking.setPricingStrategy(250);
            
        Booking demandBooking = 
        demandBooking.setPricingStrategy(300);
        
        System.out.println("Standard pricing: $" + standardBooking.?));
        System.out.println("Seasonal pricing: $" + seasonalBooking.?);
        System.out.println("Demand pricing: $" + demandBooking.?);

        // Processo legado de aplicação de preço
        LegacyPricing legacyPayment = 
        PricingAdapter adapterPricing = 
        Booking legacyBooking = 
        legacyBooking.setPricingStrategy(?);
        System.out.println("Legacy pricing: $" + legacyBooking.?);
    }
}
