package com.company;

import flowers.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /**
         * состовляющая букета
         */
        ArrayList<FlwDescription> flowers = new ArrayList<>();

        flowers.add(new Aster(6));
        flowers.add(new Chamomile(3));
        flowers.add(new Gerbera(5));
        flowers.add(new Bluebell(2));
        flowers.add(new Hyacinth(7));

        printFlowers(flowers);

    }

    /**
     выводит пользователю список цветов и сумму букета
     * @param flowers
     */
    public static void printFlowers (ArrayList<FlwDescription> flowers) {

        int price = 0;

        System.out.print("Your bouquet consists of");

        for (FlwDescription flower : flowers) {
            System.out.print(" " + flower.getName());
            price += flower.getPrice();
        }
        System.out.println("!");
        System.out.print(CheckPrice(price));
    }
    private static String CheckPrice(int price){

        /**
         * проверяет не отдан ли букет даром
         * и в положительном случае обращается к исключению
         */
        if (price <= 0) {
            try {
                throw new FLwException("ERROR! The sum of the bouquet cannot be equal to 0!");
            } catch (FLwException e) {
               return e.getMessage();
            }
        }else {
            return  "And the price will be " + price + " dollars.";
        }

    }


}


