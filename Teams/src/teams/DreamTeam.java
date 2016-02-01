/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.io.Serializable;

/**
 *
 * @author: Ian Cunningham
 * @student Number: x13114425
 * @File: DreamTeam.java
 */
public class DreamTeam implements Serializable{
    private String name;
    private String goalkeeper;
    private String leftBack;
    private String rightBack;
    private String centerBack;
    private String centerBack2;
    private String leftMid;
    private String rightMid;
    private String centerMid;
    private String centerMid2;
    private String striker;
    private String striker2;
    
    public DreamTeam(){
        name = new String();
        goalkeeper = new String();
        leftBack = new String();
        rightBack = new String();
        centerBack = new String();
        centerBack2 = new String();
        leftMid = new String();
        rightMid = new String();
        centerMid = new String();
        centerMid2 = new String();
        striker = new String();
        striker2 = new String();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoalkeeper() {
        return goalkeeper;
    }

    public void setGoalkeeper(String goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    public String getLeftBack() {
        return leftBack;
    }

    public void setLeftBack(String leftBack) {
        this.leftBack = leftBack;
    }

    public String getRightBack() {
        return rightBack;
    }

    public void setRightBack(String rightBack) {
        this.rightBack = rightBack;
    }

    public String getCenterBack() {
        return centerBack;
    }

    public void setCenterBack(String centerBack) {
        this.centerBack = centerBack;
    }

    public String getCenterBack2() {
        return centerBack2;
    }

    public void setCenterBack2(String centerBack2) {
        this.centerBack2 = centerBack2;
    }

    public String getLeftMid() {
        return leftMid;
    }

    public void setLeftMid(String leftMid) {
        this.leftMid = leftMid;
    }

    public String getRightMid() {
        return rightMid;
    }

    public void setRightMid(String rightMid) {
        this.rightMid = rightMid;
    }

    public String getCenterMid() {
        return centerMid;
    }

    public void setCenterMid(String centerMid) {
        this.centerMid = centerMid;
    }

    public String getCenterMid2() {
        return centerMid2;
    }

    public void setCenterMid2(String centerMid2) {
        this.centerMid2 = centerMid2;
    }

    public String getStriker() {
        return striker;
    }

    public void setStriker(String striker) {
        this.striker = striker;
    }

    public String getStriker2() {
        return striker2;
    }

    public void setStriker2(String striker2) {
        this.striker2 = striker2;
    }
    
}
