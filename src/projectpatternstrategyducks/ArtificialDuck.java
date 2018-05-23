/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpatternstrategyducks;

/**
 *
 * @author Kamil
 */
public class ArtificialDuck extends Duck{
    
    public ArtificialDuck(){
        flyinterface = new CantFlyCauseDontHaveWings();
        kwakwaInterface = new NoKwaKwa();
    }
    
    public void show(){
        System.out.println("Im only artificial duck, sorry");
    }
}
