/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: TeamMember.java
 */
public class TeamMember {
    //declare variables
    protected String name;
    protected int age;
    protected String role;
    
    public TeamMember(){
        name = new String();
        age = 0;
        role = new String();
    }
    
    public TeamMember(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public String getDetails() {
        return "Name: " + name + "\nAge: " + age + "\nRole: " + role;
    }
    
}
