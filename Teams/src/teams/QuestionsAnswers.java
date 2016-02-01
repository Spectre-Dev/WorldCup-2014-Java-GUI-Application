/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package teams;

import java.io.Serializable;

/**
 *QuestionsAnswers.java
 * @author Richie Mangan
 * X13114514
 */
public class QuestionsAnswers implements Serializable {
    private String question,answer, keyword;
    private int mark;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getMark() {
        return mark;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }    
    
}
