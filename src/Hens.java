/**
 * Created by 苏晓风 on 2019/3/6.
 */
public class Hens extends Chicken {
    public Hens(int price) {
        super(price);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getMaxNumber(int sum) {
        return sum / this.price;
    }
}
