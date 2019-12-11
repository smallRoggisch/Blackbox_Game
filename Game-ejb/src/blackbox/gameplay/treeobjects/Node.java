package blackbox.gameplay.treeobjects;

import java.util.LinkedList;

public class Node {
    long nodeID;
    NodeMessage messageToClient;
    LinkedList<Answer> possibleAnswers;
}
