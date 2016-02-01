/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 * This class will store all the required stats of Fifa World Cup referees and
 * will be called into an Array in the RefereeGUI class.
 * referees.java
 * @author Richie Mangan
 * X13114514
 */

public class Referee extends javax.swing.JFrame{
   
    //Variables
    private String refName, nationality, federation, photo;
    private int numGames;

    //Constructor
    public Referee() {
        refName = new String();
        nationality = new String();
        federation = new String();
        numGames = 0;
        photo = new String();
    }
        //setters and getters
     public void setRefName(String name) {
        refName = name;
    }
     
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setNumGames(int numGames) {
        this.numGames = numGames;
    }
    
    public void setFederation(String federation) {
        this.federation = federation;
    }
    public String getRefName() {
        return (refName);
    }
    
    public String getNationality() {
        return nationality;
    }
    public int getNumGames() {
        return numGames;
    }
    public String getFederation() {
        return federation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
}