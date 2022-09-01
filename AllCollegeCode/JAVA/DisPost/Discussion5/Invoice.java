// Discussion 5: Using Polymorphism, instanceof, assert
// Invoice class implements Payable.

public class Invoice implements Payable {
   private String partNumber; 
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   // four-argument constructor
   public Invoice(String part, String description, int count, 
      double price) {
      partNumber = part;
      partDescription = description;
      setQuantity(count); // validate and store quantity
      setPricePerItem(price); // validate and store price per item
   }

   // set part number
   public void setPartNumber(String part) {
      partNumber = part; // should validate
   }

   // get part number
   public String getPartNumber() {
      return partNumber;
   }

   // set description
   public void setPartDescription(String description) {
      partDescription = description; // should validate
   }

   // get description
   public String getPartDescription() {
      return partDescription;
   }

   // set quantity
   public void setQuantity(int count) {
      quantity = (count < 0) ? 0 : count; // quantity cannot be negative
   }

   // get quantity
   public int getQuantity() {
      return quantity;
   }

   // set price per item
   public void setPricePerItem(double price) {
      pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
   }

   // get price per item
   public double getPricePerItem() {
      return pricePerItem;
   }

   // return String representation of Invoice object
   @Override
   public String toString() {
      return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
         "invoice", "part number", getPartNumber(), getPartDescription(), 
         "quantity", getQuantity(), "price per item", getPricePerItem());
   } 

   // method required to carry out contract with interface Payable
   @Override
   public double getPaymentAmount() {
      return getQuantity() * getPricePerItem(); // calculate total cost
   }
}
