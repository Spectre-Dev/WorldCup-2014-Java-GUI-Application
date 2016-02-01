/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

/**
 *
 * @author: Ian Cunningham
 * @student Number: x13114425
 * @File: BasicQ.java
 */
public class BasicQ {
    private String question;
    private String answer;
    
    public BasicQ(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
