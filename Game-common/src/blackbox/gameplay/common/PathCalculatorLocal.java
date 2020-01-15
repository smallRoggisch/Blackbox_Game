package blackbox.gameplay.common;

import blackbox.gameplay.treeobjects.Node;

public interface PathCalculatorLocal {

    Node getFollowingNode(long lastNode, long pID);

    Node getNodeWithID(long lastNode);
}
