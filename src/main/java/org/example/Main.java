package org.example;

import org.example.models.Order;

public class Main {
    public static void main(String[] args) {

    Order pedido1 = new Order("Vestido", 255.50, true, "Mateus", "85996343862");
    System.out.print(pedido1.toString());


    }
}