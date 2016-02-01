/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;


/**
 *
 * @author: Ian Cunningham
 * @student Number: x13114425
 * @File: Captain.java
 */
public class Captain extends StarPlayer{
    private int appsAsCaptain;
    private String appointedCaptain;
    
    public Captain(String name, int age, String role, int appearances, int goals, String club, int appsAsCaptain, String appointedCaptain){
        super(name, age, role, appearances, goals, club);
        this.appsAsCaptain = appsAsCaptain;
        this.appointedCaptain = appointedCaptain;
    }

    public int getAppsAsCaptain() {
        return appsAsCaptain;
    }

    public void setAppsAsCaptain(int appsAsCaptain) {
        this.appsAsCaptain = appsAsCaptain;
    }

    public String getAppointedCaptain() {
        return appointedCaptain;
    }

    public void setAppointedCaptain(String appointedCaptain) {
        this.appointedCaptain = appointedCaptain;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"\nAppearances as Captain: "+appsAsCaptain+"\nDate Appointed as Captain: "+appointedCaptain;
    }
    
}
