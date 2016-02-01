/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: StarPlayer.java
 */
public class StarPlayer extends TeamMember{
    private int appearances;
    private int goals;
    private String club;
    
    public StarPlayer(String name, int age, String role, int appearances, int goals, String club){
        super(name, age, role);
        this.appearances = appearances;
        this.goals = goals;
        this.club = club;
    }

    public int getAppearances() {
        return appearances;
    }

    public void setAppearances(int appearances) {
        this.appearances = appearances;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    
    @Override
    public String getDetails(){
        return super.getDetails()+"\nAppearances: "+appearances+"\nGoals: "+goals+"\nClub: "+club;
    }
}
