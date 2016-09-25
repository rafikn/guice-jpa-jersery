package nz.org.rafikn.app.dto;

/**
 * Created by rafik on 25/09/16.
 */
public class CoffeeFlavourDto {

    private int id;
    private int sweetness;
    private int bitterness;
    private int aroma;
    private int strength;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSweetness() {
        return sweetness;
    }

    public void setSweetness(int sweetness) {
        this.sweetness = sweetness;
    }

    public int getBitterness() {
        return bitterness;
    }

    public void setBitterness(int bitterness) {
        this.bitterness = bitterness;
    }

    public int getAroma() {
        return aroma;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
