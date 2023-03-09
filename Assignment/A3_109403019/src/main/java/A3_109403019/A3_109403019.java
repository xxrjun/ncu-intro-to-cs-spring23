//Assignment 2
//Name: 鄒翔宇
//ID: 109403019
//Course: 2023-CE1002

package A3_109403019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
          Initialize store object.
         */
        store s = new store();


        int operation = 0;
        Scanner sc = new Scanner(System.in);
        while (operation != 5) {
            System.out.println("1.add goods 2.sell 3.show all item in store 4.show income 5.exit:");
            operation = sc.nextInt();

            switch (operation) {
                case 1: // add goods
                    System.out.println("please input goods info id/name/price/amount:");
                    String addId = sc.next();
                    String addName = sc.next();
                    int addPrice = sc.nextInt();
                    int addAmount = sc.nextInt();

                    goods newGood = new goods();
                    newGood.id = addId;
                    newGood.setName(addName);
                    newGood.setPrice(addPrice);
                    newGood.amount = addAmount;

                    s.addItem(newGood);

                    break;

                case 2: // sell
                    System.out.println("please input goods id and the sell amount:");
                    String sellId = sc.next();
                    int sellAmount = sc.nextInt();
                    s.sell(sellId, sellAmount);
                    break;

                case 3: // show all items in store
                    s.showAll();
                    break;

                case 4: // show income
                    s.showIncome();
                    break;

                case 5: // exit
                    break;
            }
        }

        sc.close();
    }
}
