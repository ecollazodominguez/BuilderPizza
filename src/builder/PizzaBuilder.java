/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


public class PizzaBuilder {

    //Añadimos todos los parámetros de la clase Pizza
    
    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;

    public PizzaBuilder() {
        
    }

    //Creamos un constructor con los parámetros obligatorios
    
    public PizzaBuilder(float grHarina, float mlAgua) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
    }
    
    
    //Los sets devuelven un objeto PizzaBuilder

    public PizzaBuilder setGrHarina(float grHarina) {
        this.grHarina = grHarina;
        return this;
    }

    public PizzaBuilder setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    //Creamos el método que devolverá un objeto Pizza con los parámetros que tenga el objeto PizzaBuilder.
   
    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, grTomate, grQueso, tipoQueso, grPinha);
    }
    
}
