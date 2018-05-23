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
public class NoKwaKwa implements KwaKwaInterface {
    
    @Override
    public void giveVoice(){
        System.out.println("I dont  give sound");
    }
}
