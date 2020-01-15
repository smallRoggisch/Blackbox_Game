package gameplay.treeobjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

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
    public Messagetype getMessgetype() {
        return type;
    }

    public String getMessageString() {
        return message;
    }

    public void startTimeout() {
        Date endDate=new Date(new Date().getTime()+timeout);
        while(new Date().before(endDate)){
        }
        return;
    }
}
