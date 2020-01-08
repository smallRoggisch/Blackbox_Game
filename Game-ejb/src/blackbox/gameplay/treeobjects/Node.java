package blackbox.gameplay.treeobjects;

import javax.persistence.*;
import java.util.LinkedList;

@Entity
public class Node {
    private static long nodeIdCounter = 0;
    @Id
    private long nodeID;
    @Column
    private LinkedList<NodeMessage> messageToClient;
    @Column
    private LinkedList<Answer> possibleAnswers;

    public Node(LinkedList<NodeMessage> message, LinkedList<Answer> possibleAnswers)
    {
        this.nodeID = nodeIdCounter++;
        this.messageToClient = message;
        this.possibleAnswers = possibleAnswers;
    }


}
