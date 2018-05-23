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
public class ProjectPatternStrategyDucks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Duck artificialDuck = new ArtificialDuck();
        artificialDuck.doFly();
        artificialDuck.doVoice();
        
        artificialDuck.setFlyInterface(new FlyCauseHaveWings());
        
         artificialDuck.doFly();
        artificialDuck.doVoice();
        
    }
    
}
