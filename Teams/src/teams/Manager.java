/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: Manager.java
 */
public class Manager extends TeamMember{
    private String teamsManaged;
    private int gamesInCharge;
    
    public Manager(String name, int age, String role, String teamsManaged, int gamesInCharge){
        super(name, age, role);
        this.teamsManaged = teamsManaged;
        this.gamesInCharge = gamesInCharge;
    }

    public String getTeamsManaged() {
        return teamsManaged;
    }

    public void setTeamsManaged(String teamsManaged) {
        this.teamsManaged = teamsManaged;
    }

    public int getGamesInCharge() {
        return gamesInCharge;
    }

    public void setGamesInCharge(int gamesInCharge) {
        this.gamesInCharge = gamesInCharge;
    }
   
    @Override
    public String getDetails(){
        return super.getDetails()+"\nTeams Managed: "+teamsManaged+"\nGames in Charge: "+gamesInCharge;
    }
}
