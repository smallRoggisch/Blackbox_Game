package blackbox.gameplay.treeobjects;

import javax.persistence.*;

@Entity
public class NodeMessage {
    private static long nodeMessageIdCounter = 0;
    @Id
    private long nodeMessageID;
    @Column
    private Messagetype type;
    @Column
    private String message;
    @Column
    private int timeout;

    public NodeMessage(Messagetype type, String message, int timeout)
    {
        this.nodeMessageID = nodeMessageIdCounter++;
        this.type = type;
        this.message = message;
        this.timeout = timeout;
    }

    public NodeMessage(Messagetype type, String message)
    {
        this.nodeMessageID = nodeMessageIdCounter++;
        this.type = type;
        this.message = message;
        this.timeout = 0;
    }
}
