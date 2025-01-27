/* A Shopping Cart Project Which is based on basic concepts of java, This Mini Projrct Is Command line.
   This program will be menu driven which works on the input of the user.
   Requirements:-
   1. Items List with offers applied.
   2. A Menu Which Consist:-
        a. Updating Items(Adding, Removing)
        b. View Cart
        c. Checkout
        d. A Formatted Bill(date, time, item list with price, quantaties, total, discount applied)

Item List:
1.Smartphone
Price: ₹15,000
Description: 6.5-inch display, 128GB storage, dual SIM.
2.Laptop
Price: ₹55,000
Description: 15.6-inch screen, 8GB RAM, 512GB SSD.
3.Tablet
Price: ₹25,000
Description: 10-inch display, 64GB storage, WiFi + Cellular.
4.Smartwatch
Price: ₹5,000
Description: Tracks fitness, heart rate, and notifications.
5.Bluetooth Headphones
Price: ₹3,000
Description: Noise cancellation, 20-hour battery life.
6.Wireless Earbuds
Price: ₹2,500
Description: Compact design, 10-hour playback.
7.Smart TV
Price: ₹30,000
Description: 43-inch LED, 4K Ultra HD, Android OS.
8.Gaming Console
Price: ₹40,000
Description: 1TB storage, supports 4K gaming.
9.Home Theatre System
Price: ₹18,000
Description: 5.1 surround sound, Bluetooth support.
10.Digital Camera
Price: ₹28,000
Description: 24.1MP DSLR, WiFi enabled.
11.Bluetooth Speaker
Price: ₹2,000
Description: Portable, 10W sound output.
12.Power Bank
Price: ₹1,200
Description: 10,000mAh capacity, dual USB output.
13.External Hard Drive
Price: ₹4,000
Description: 1TB capacity, USB 3.0.
14.Printer
Price: ₹8,000
Description: All-in-one printer with wireless printing.
15.WiFi Router
Price: ₹1,500
Description: Dual-band, supports up to 50 devices.
16.USB Flash Drive
Price: ₹500
Description: 64GB capacity, USB 3.0.
17.Keyboard and Mouse Combo
Price: ₹1,800
Description: Wireless, ergonomic design.
18.Fitness Band
Price: ₹2,000
Description: Tracks steps, calories, and sleep.
19.Webcam
Price: ₹1,500
Description: 1080p HD resolution, plug-and-play.
20.Smart Plug
Price: ₹1,000
Description: Remote control via app, voice assistant compatible.

*/


import java.util.Scanner;

class Product{
    int product_no;
    String product_name;
    int product_price;
    String product_description;


    // this constructor is used to initialize the products
    public Product(int product_no, String product_name, int product_price, String product_description){     
        this.product_no = product_no;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_description = product_description;
    }


    // this method is used to display the items one by one
    public void displayProduct() {                      
        System.out.println("Product No: " + product_no);
        System.out.println("Name: " + product_name);
        System.out.println("Price: Rs." + product_price);
        System.out.println("Description: " + product_description);
        System.out.println("--------------------------");
    }
}



class Cart {
    private Product[] cartItems; // Array to store products in the cart
    private int[] quantities;    // Array to store quantities of each product
    private int cartSize;        // Tracks the number of items in the cart

    public Cart(int capacity) {
        cartItems = new Product[capacity];
        quantities = new int[capacity];
        cartSize = 0;
    }

    // This Is to add products to the cart 
    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < cartSize; i++) {
            if (cartItems[i].product_no == product.product_no) {
                quantities[i] += quantity;
                System.out.println(quantity + " more of " + product.product_name + " added to the cart.");
                return;
            }
        }
        if (cartSize < cartItems.length) {
            cartItems[cartSize] = product;
            quantities[cartSize] = quantity;
            cartSize++;
            System.out.println(quantity + " x " + product.product_name + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    // This is to remove product from the cart
    public void removeProduct(int productNo, int quantity) {
        for (int i = 0; i < cartSize; i++) {
            if (cartItems[i].product_no == productNo) {
                if (quantities[i] <= quantity) {
                    System.out.println(cartItems[i].product_name + " completely removed from the cart.");
                    // Shift products
                    for (int j = i; j < cartSize - 1; j++) {
                        cartItems[j] = cartItems[j + 1];
                        quantities[j] = quantities[j + 1];
                    }
                    cartItems[cartSize - 1] = null;
                    quantities[cartSize - 1] = 0;
                    cartSize--;
                } else {
                    quantities[i] -= quantity;
                    System.out.println(quantity + " of " + cartItems[i].product_name + " removed from the cart.");
                }
                return;
            }
        }
        System.out.println("Product not found in cart. Try again");
    }

    // This is used to view cart items 
    public void viewCart() {
        if (cartSize == 0) {
            System.out.println("Cart is empty please add items.");
        } else {
            System.out.println("\nItems in Cart:");
            for (int i = 0; i < cartSize; i++) {
                Product p = cartItems[i];
                System.out.println(p.product_name + " - " + quantities[i] + " x Rs." + p.product_price);
            }
        }
    }

    // This is used show the formatted bills
    public void checkout() {
        if (cartSize == 0) {
            System.out.println("Cart is empty. Add items to checkout. Or You Can Just Exit The Cart");
            return;
        }

        int total = 0;
        System.out.println("\n--- Checkout ---\n");
        System.out.println("Item\t\t\t\tQuantity\tPrice\t\tTotal");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < cartSize; i++) {
            Product p = cartItems[i];
            int price = quantities[i] * p.product_price;
            // Format the output to align the columns
            System.out.printf("%-25s\t%-8d\tRs.%-8d\tRs.%-8d\n", p.product_name, quantities[i], p.product_price, price);
            total += price;
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("Subtotal: Rs." + total);

        // Apply discount
        double discount = 0.0;
        if (total > 50000) {
            discount = total * 0.15;
        } else if (total > 30000) {
            discount = total * 0.10;
        } else if (total > 20000) {
            discount = total * 0.05;
        }

        if (discount > 0) {
            System.out.printf("Discount: Rs.%.2f\n", discount);
        }
        total -= discount;

        System.out.println("Grand Total: Rs." + total);
        System.out.println("\nThank you for shopping, Please Come Again\n");
        cartSize = 0; // Clears the cart after checkout
    }
}

class Shopping_Cart {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Product[] products = {
            new Product(1, "Smartphone", 15000, "6.5-inch display, 128GB storage, dual SIM."),
            new Product(2, "Laptop", 55000, "15.6-inch screen, 8GB RAM, 512GB SSD."),
            new Product(3, "Tablet", 25000, "10-inch display, 64GB storage, WiFi + Cellular."),
            new Product(4, "Smartwatch", 5000, "Tracks fitness, heart rate, and notifications."),
            new Product(5, "Bluetooth Headphones", 3000, "Noise cancellation, 20-hour battery life."),
            new Product(6, "Wireless Earbuds", 2500, "Compact design, 10-hour playback."),
            new Product(7, "Smart TV", 30000, "43-inch LED, 4K Ultra HD, Android OS."),
            new Product(8, "Gaming Console", 40000, "1TB storage, supports 4K gaming."),
            new Product(9, "Home Theatre System", 18000, "5.1 surround sound, Bluetooth support."),
            new Product(10, "Digital Camera", 28000, "24.1MP DSLR, WiFi enabled."),
            new Product(11, "Bluetooth Speaker", 2000, "Portable, 10W sound output."),
            new Product(12, "Power Bank", 1200, "10,000mAh capacity, dual USB output."),
            new Product(13, "External Hard Drive", 4000, "1TB capacity, USB 3.0."),
            new Product(14, "Printer", 8000, "All-in-one printer with wireless printing."),
            new Product(15, "WiFi Router", 1500, "Dual-band, supports up to 50 devices."),
            new Product(16, "USB Flash Drive", 500, "64GB capacity, USB 3.0."),
            new Product(17, "Keyboard and Mouse Combo", 1800, "Wireless, ergonomic design."),
            new Product(18, "Fitness Band", 2000, "Tracks steps, calories, and sleep."),
            new Product(19, "Webcam", 1500, "1080p HD resolution, plug-and-play."),
            new Product(20, "Smart Plug", 1000, "Remote control via app, voice assistant compatible.")
        };

        // Display all products
        for (int i = 0; i < products.length; i++) {
            products[i].displayProduct();
        }

        Cart cart = new Cart(20); // Initialize cart with capacity 20
        int choice = 0;

        do {
            System.out.print("\n\n1. Add Item To The Cart ");
            System.out.print("\n2. Remove Item From The Cart ");
            System.out.print("\n3. View Cart ");
            System.out.print("\n4. Checkout ");
            System.out.print("\n5. Exit ");
            System.out.print("\nEnter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product No to Add: ");
                    int productNo = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    if (productNo > 0 && productNo <= products.length) {
                        cart.addProduct(products[productNo - 1], quantity);
                    } else {
                        System.out.println("Invalid Product Number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Product No to Remove: ");
                    int removeProductNo = sc.nextInt();
                    System.out.print("Enter Quantity to Remove: ");
                    int removeQuantity = sc.nextInt();
                    cart.removeProduct(removeProductNo, removeQuantity);
                    break;

                case 3:
                    cart.viewCart();
                    break;

                case 4:
                    cart.checkout();
                    break;

                case 5:
                    System.out.println("Exiting. Thank you Please Visit Again...");
                    break;

                default:
                    System.out.println("Invalid Choice. Try Again.");
            }
        } while (choice != 5);
    }
}
