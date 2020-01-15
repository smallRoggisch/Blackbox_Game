package blackbox.gameplay.treeobjects;

import javax.persistence.*;

/**
 *
 */
public class Answer {
    private static long answerIdCounter = 0;
    @Id
    private long answerID;
    @Column
    private String answerMessage;
    @Column
    private Node answerNode;

    public Answer(String answerMessage, Node answerNode)
    {
        this.answerID = answerIdCounter++;
        this.answerMessage = answerMessage;
        this.answerNode = answerNode;
    }
    public long getAnswerID() {
        return answerID;
    }

    public boolean hasMessage(String pMsg) {
        return answerMessage.equals(pMsg);
    }
}
