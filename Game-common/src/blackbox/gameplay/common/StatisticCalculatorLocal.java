package blackbox.gameplay.common;

import gameplay.treeobjects.StatisticScenarioPath;

public interface StatisticCalculatorLocal {
    public void updateCurrentGamepath(StatisticScenarioPath path);
    public boolean completeCurrentGamepath(StatisticScenarioPath path);
}
