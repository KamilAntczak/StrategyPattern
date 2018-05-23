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
public class FlyCauseHaveWings implements FlyInterface{

    @Override
    public void fly() {
       System.out.println("Look Im Flying");
    }
    
}
