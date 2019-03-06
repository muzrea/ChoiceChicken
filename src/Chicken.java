/**
 * Created by 苏晓风 on 2019/3/6.
 */
public abstract class Chicken {
    public static int price;

    public Chicken(int price) {
        this.price = price;
    }

    public abstract int getMaxNumber(int sum);
}
