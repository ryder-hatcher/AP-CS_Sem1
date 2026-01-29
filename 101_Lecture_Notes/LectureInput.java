import java.util.Scanner;

class LectureInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        double rice = 1.50;
        double curry = 5.50;
        double ramen = 10.50;
        
        System.out.println("🍙Welcome to 日本のコンビニ🍙");
        System.out.println("These are our options!");
        System.out.println("Rice 🍚: $" + rice);
        System.out.println("Curry 🍛: $" + curry);
        System.out.println("Ramen 🍜: $" + ramen);
        System.out.println();
        
        System.out.print("What's your name? ");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.print("How many portions of rice would you like? ");
        int quantity1 = sc.nextInt();
         
        System.out.print("How many portions of curry would you like? ");
        int quantity2 = sc.nextInt();
         
        System.out.print("How many portions of ramen would you like? ");
        int quantity3 = sc.nextInt();
        
        
        double subtotal = (rice * quantity1) + (curry * quantity2) + (ramen * quantity3);
        
        System.out.print("How much would you like to tip? ");
        double tipPercentage = sc.nextDouble(); 
        

        double tipAmount = subtotal * (tipPercentage / 100);
        double grandTotal = subtotal + tipAmount;
        
        System.out.println(" Order Summary "); 
        System.out.println("Customer: " + name);
        System.out.println("Rice 🍚: " + quantity1 + "  $" + rice + " = $" + (rice * quantity1));
        System.out.println("Curry 🍛: " + quantity2 + "  $" + curry + " = $" + (curry * quantity2));
        System.out.println("Ramen 🍜: " + quantity3 + "  $" + ramen + " = $" + (ramen * quantity3));
        System.out.println("Subtotal: $" + subtotal);
        System.out.println(" Tip" + tipPercentage + "%");
        System.out.println("Thank you for your order!");
        
    }
}