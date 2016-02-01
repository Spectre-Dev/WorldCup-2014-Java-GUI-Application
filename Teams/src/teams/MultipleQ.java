/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunnngham
 * @student Number: x13114425
 * @File: MultipleQ.java
 */
public class MultipleQ extends BasicQ {
    private String option1, option2, option3;
    
    public MultipleQ(String name, String answer, String option1, String option2, String option3){
        super(name, answer);
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
    
}
