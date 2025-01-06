class Pizza {
    private int price;
    private boolean veg;
    private int extraCheese = 50;
    private int extraToppings = 100;
    private int takeAwayCharges = 30;
    private int deliveryCharges = 10;
    private int totalDeliveryCharges;
    private int basePizzaPrice;

    private boolean takeAwayOpted;
    private boolean deliveryOpted;

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 350;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese added          :Rs." + extraCheese);
        this.price += extraCheese;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        System.out.println("Extra Toppings added        :Rs." + extraToppings);
        this.price += extraToppings;
    }

    public void takeAway() {
        if (!deliveryOpted) {
            takeAwayOpted = true;
            System.out.println("Opted for TakeAway  :Rs." + takeAwayCharges);
            this.price += takeAwayCharges;
        } else {
            System.out.println("Cannot opt for TakeAway, Already opted for delivery");
        }
    }

    public void deliveryCharges(int distanceInKms) {
        if (!takeAwayOpted) {
            deliveryOpted = true;
            totalDeliveryCharges = deliveryCharges * distanceInKms;
            System.out.println("Opted for Delivery          :Rs." + totalDeliveryCharges);
            this.price += totalDeliveryCharges;
        } else {
            System.out.println("Opted for Delivery, Cannot opt for TakeAway");
        }
    }

    public void getBill() {
        System.out.println("\n--------------------Bill Details--------------------");
        String bill = "";
        System.out.println("Pizza                             :Rs." + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added                :Rs." + extraCheese + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added              :Rs." + extraToppings + "\n";
        }
        if (takeAwayOpted && !deliveryOpted) {
            bill += "Take Away Charges included        :Rs." + takeAwayCharges + "\n";
        }
        if (deliveryOpted && !takeAwayOpted) {
            bill += "Delivery charges Added(" + deliveryCharges + " per km) :Rs." + totalDeliveryCharges + "\n";
        }
        bill += "Total Bill                        :Rs." + this.price + "\n";
        System.out.println(bill);
    }
}

class DeluxPizza extends Pizza {
    public DeluxPizza(boolean veg) {
        super(veg);

        super.addExtraCheese();
        super.addExtraToppings();
    }
}

public class PizzaBillGenerator {
    public static void main(String[] args) {
        // DeluxPizza dp = new DeluxPizza(false);
        // dp.deliveryCharges(3);

        // dp.getBill();

        Pizza pz = new Pizza(true);
        pz.addExtraCheese();
        pz.addExtraToppings();
        pz.deliveryCharges(6);
        pz.takeAway();
        pz.getBill();
    }
}