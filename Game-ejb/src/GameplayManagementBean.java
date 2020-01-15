import blackbox.gameplay.common.*;
import blackbox.gameplay.treeobjects.*;
import com.sun.imageio.plugins.jpeg.JPEGMetadata;

import java.util.LinkedList;
import java.util.List;

public class GameplayManagementBean implements GameplayManagementRemote {
PathCalculatorLocal pathCalculator;
StatisticCalculatorLocal statisticCalculator;
StatisticScenarioPath currentPath;
    @Override
    public void receiveMsgFromClient(String pMsg) {
        Node lastNode=pathCalculator.getNodeWithID(currentPath.getLastNode());
        List<Answer> answerList=lastNode.getAnswerList();
        for(Answer answer:answerList){
            if(answer.hasMessage(pMsg)){
                receiveMsgFromClient(answer.getAnswerID());
                return;
            }
        }
    }

    @Override
    public void receiveMsgFromClient(long pID) {
        long lastNode=currentPath.getLastNode();
        Node currentNode=pathCalculator.getFollowingNode(lastNode,pID);
        currentPath.add(currentNode.getID());
        if(currentNode.isEnd()) {
            statisticCalculator.completeCurrentGamepath(currentPath);
            sendMsgToClient("Ende erreicht",Messagetype.Text);
        }
        else {
            statisticCalculator.updateCurrentGamepath(currentPath);
            for(NodeMessage msg:currentNode.getMessageToClientList()){
                msg.startTimeout();
                sendMsgToClient(msg.getMessageString(),msg.getMessgetype());
            }
            sendAnswersToClient(currentNode.getAnswerList());
        }

}

    private void sendMsgToClient(String pMsg, Messagetype ptype){

        //TODO
    }
    private void sendAnswersToClient(List<Answer> pAnswers){
        //TODO
    }
}
