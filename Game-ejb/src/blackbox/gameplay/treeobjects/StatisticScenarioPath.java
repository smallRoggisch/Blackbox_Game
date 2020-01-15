package blackbox.gameplay.treeobjects;

import java.util.LinkedList;

public class StatisticScenarioPath {
    long gameID;
    LinkedList<Long> path;
    long userID;

    public void add(Long pNode) {
        path.add(pNode);
    }

    public long getLastNode() {
        return path.getLast();
    }
}
