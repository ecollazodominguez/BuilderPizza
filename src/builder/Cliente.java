/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author ecollazodominguez
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza miPizzaHawaiana;
        miPizzaHawaiana = new PizzaBuilder(500,350)
                .setGrPinha(100)
                .createPizza();
        System.out.println(miPizzaHawaiana.toString());
    }
    
}
