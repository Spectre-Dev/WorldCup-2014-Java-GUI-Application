/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 * @author Dzulija Puspure
 * @author x13399691
 */
//variables
public class Game {
    private String prediction;
    private String name;
    
    public Game(){
        prediction = new String();
        name = new String();
    }
//setters and getters
    
    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
}
