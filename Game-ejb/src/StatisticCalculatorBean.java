import blackbox.gameplay.common.*;
import gameplay.treeobjects.StatisticScenarioPath;

public class StatisticCalculatorBean implements StatisticCalculatorRemote, StatisticCalculatorLocal{

    @Override
    public void updateCurrentGamepath(StatisticScenarioPath path) {

    }

    @Override
    public boolean completeCurrentGamepath(StatisticScenarioPath path) {
        return false;
    }

    @Override
    public void getStatistics(long userId) {

    }
}
