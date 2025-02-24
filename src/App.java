public class App {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public String storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;

    private String orderID;
    private double orderTotal;

     
    public void takeOrder(String orderID, double total, String selectedSides, String selectedDrinks) {
        this.orderID = orderID;
        this.orderTotal = total;
        this.sides = selectedSides;
        this.drinks = selectedDrinks;

        makePizza();
        printReceipt();
    }

    public void makePizza() {
        System.out.println("🍕 Making pizza with: " + pizzaIngredients);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("⚠️ Pizza preparation interrupted!");
        }
        System.out.println("✅ Pizza is ready!");
    }

    private void printReceipt() {
        System.out.println("\n======== Slice-o-Heaven ========");
        System.out.println("📍 " + storeName);
        System.out.println("📌 " + storeAddress);
        System.out.println("📧 " + storeEmail);
        System.out.println("📞 " + storePhone);
        System.out.println("-------------------------------");
        System.out.println("🆔 Order ID: " + orderID);
        System.out.println("🍟 Sides: " + sides);
        System.out.println("🥤 Drinks: " + drinks);
        System.out.println("💵 Total: $" + orderTotal);
        System.out.println("===============================");
    }
}