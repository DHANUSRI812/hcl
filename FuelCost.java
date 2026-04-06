class FuelCost{
    public static void main(String[] args){
        int distance=100;
        int mileage=10;
        int fuelCostPerLitre=100;
        int totalCost=(distance/mileage)*fuelCostPerLitre;
        System.out.println("Total fuel cost: " + totalCost);
}
}