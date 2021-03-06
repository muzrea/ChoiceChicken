/**
 * Created by 苏晓风 on 2019/3/6.
 */
public class Chick extends Chicken {
    public Chick(int price) {
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
