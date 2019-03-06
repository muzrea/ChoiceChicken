/**
 * Created by 苏晓风 on 2019/3/5.
 */
public class BuyChicken {
    public static void main(String[] args) {
        Rooster rooster = new Rooster(5);
        Hens hens = new Hens(3);
        Chick chick = new Chick(1 / 3);
        rooster.setPrice(5);
        hens.setPrice(3);
        int roosterMaxNumber = rooster.getMaxNumber(100);
        int hensMaxNumber = hens.getMaxNumber(100);
        int roosterNumber;
        int hensNumber;
        int chickenNumber;
        for (roosterNumber = 0; roosterNumber < roosterMaxNumber; roosterNumber++) {
            for (hensNumber = 0; hensNumber < hensMaxNumber; hensNumber++) {
                chickenNumber = 100 - roosterNumber - hensNumber;
                if (chickenNumber > 0 && roosterNumber * 14 + hensNumber * 8 == 200) {
                    if (chickenNumber % 3 == 0) {
                        System.out.println("可以买" + roosterNumber + "只公鸡," + hensNumber + "只母鸡，" + chickenNumber + "只小鸡。");
                    }
                }
            }
        }
    }
}
