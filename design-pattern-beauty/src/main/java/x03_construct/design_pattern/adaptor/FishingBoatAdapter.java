package x03_construct.design_pattern.adaptor;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public class FishingBoatAdapter implements RowingBoat{

    private FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        this.fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
