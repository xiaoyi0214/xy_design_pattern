package x03_construct.design_pattern.adaptor;

/**
 * @author XiaoYi
 * Created on 2022/11/6.
 */
public class Captain {

    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }


    public static void main(String[] args) {
        new Captain(new FishingBoatAdapter()).row();
    }
}
