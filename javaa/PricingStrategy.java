interface PricingStrategy {
  double calculatePrice(double basePrice);
}

class StandardPricing implements PricingStrategy {
  @Override
  public double calculatePrice(double basePrice) {
      return basePrice;
  }
}

class SeasonalPricing implements PricingStrategy {
  @Override
  public double calculatePrice(double basePrice) {
      return basePrice * 1.25;  // 25% increase during peak season
  }
}

class DemandPricing implements PricingStrategy {
  @Override
  public double calculatePrice(double basePrice) {
      return basePrice * 1.50;  // 50% increase during high demand
  }
}
