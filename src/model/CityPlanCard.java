package model;

import java.util.List;

public class CityPlanCard {
    public List<Integer> estateSizes;
    public int higherPoints;
    public int lowerPoints;

    public int level;

    private CityPlanCard(List<Integer> estateSizes, int higherPoints, int lowerPoints, int level) {
        this.estateSizes = estateSizes;
        this.higherPoints = higherPoints;
        this.lowerPoints = lowerPoints;
        this.level = level;
    }

    public static CityPlanCard create(List<Integer> estateSizes, int firstPlacePoints, int secondPlacePoints, int level) {
        return new CityPlanCard(estateSizes, firstPlacePoints, secondPlacePoints, level);
    }
}
