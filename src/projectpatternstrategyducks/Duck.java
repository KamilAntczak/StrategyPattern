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
public abstract class Duck {

    FlyInterface flyinterface;
    KwaKwaInterface kwakwaInterface;

    public Duck(){
        
    }
        public void swim(){
            System.out.println("Im Swimming");
        }
        
        public void doFly(){
            flyinterface.fly();
        }
        
        public void doVoice(){
            kwakwaInterface.giveVoice();
        }
        
        public void setFlyInterface(FlyInterface f){
            flyinterface = f;
        }
        
        public void setKwaKwaInterface(KwaKwaInterface k){
            
        }

    

}
