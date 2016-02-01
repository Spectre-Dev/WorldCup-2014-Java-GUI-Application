/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: TeamInformation.java
 */
public class TeamInformation {
    private String managerPic;
    private String managerName;
    private int managerAge;
    private String managerNation;
    private String captainPic;
    private String captainName;
    private int captainAge;
    private String captainClub;
    private String starPic;
    private String starName;
    private int starAge;
    private String starClub;
    
    public TeamInformation(){
        managerPic = new String();
        managerName = new String();
        managerAge = 0;
        managerNation = new String();
        captainPic = new String();
        captainName = new String();
        captainAge = 0;
        captainClub = new String();
        starPic = new String();
        starName = new String();
        starAge = 0;
        starClub = new String();
    }

    public String getManagerPic() {
        return managerPic;
    }

    public void setManagerPic(String managerPic) {
        this.managerPic = managerPic;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(int managerAge) {
        this.managerAge = managerAge;
    }

    public String getManagerNation() {
        return managerNation;
    }

    public void setManagerNation(String managerNation) {
        this.managerNation = managerNation;
    }

    public String getCaptainPic() {
        return captainPic;
    }

    public void setCaptainPic(String captainPic) {
        this.captainPic = captainPic;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public int getCaptainAge() {
        return captainAge;
    }

    public void setCaptainAge(int captainAge) {
        this.captainAge = captainAge;
    }

    public String getCaptainClub() {
        return captainClub;
    }

    public void setCaptainClub(String captainClub) {
        this.captainClub = captainClub;
    }

    public String getStarPic() {
        return starPic;
    }

    public void setStarPic(String starPic) {
        this.starPic = starPic;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public int getStarAge() {
        return starAge;
    }

    public void setStarAge(int starAge) {
        this.starAge = starAge;
    }

    public String getStarClub() {
        return starClub;
    }

    public void setStarClub(String starClub) {
        this.starClub = starClub;
    }
    
}
