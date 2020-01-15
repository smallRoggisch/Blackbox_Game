package blackbox.gameplay.common;

import gameplay.treeobjects.Node;

public interface PathCalculatorLocal {

    Node getFollowingNode(long lastNode, long pID);

    Node getNodeWithID(long lastNode);
}
