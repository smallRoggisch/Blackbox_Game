package blackbox.gameplay.treeobjects;

import javax.persistence.*;

/**
 *
 */
@Entity
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
}
