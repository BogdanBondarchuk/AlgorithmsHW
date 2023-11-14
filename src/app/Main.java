package app;

 class Main {
         private final static String CURRENCY = "USD";

         public static void main(String[] args) {
             double[] price = {13.40, 49.99, 5.30, 36.00, 81.50, 3.00, 76.00};

             for (int i = 0; i < price.length; i++) {
                 for (int j = 1; j < (price.length - i); j++) {
                     if (price[j - 1] > price[j]) {
                         double temp = price[j - 1];
                         price[j - 1] = price[j];
                         price[j] = temp;
                     }
                 }
             }

             double totalSum = 0;
             for (double number : price) {
                 totalSum += number;
             }
             double averagePrice = totalSum / price.length;

             System.out.println("Sorted data:");

             for (int days = 1; days <= 7; days++) {
                 System.out.print("Day " + days + ") ");
                 System.out.print(price[days - 1] + " " + CURRENCY + " ");
                 System.out.println();
             }
             System.out.println("___________________");

             System.out.printf("Average Price for 7 days: %.2f %s%n", averagePrice, CURRENCY);
         }
     }



