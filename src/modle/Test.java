public class Test {
    public static void main(String[] args) {
    Goods g1 = new Goods("豆浆");
    Goods g2 = new Goods("豆浆机");
    Goods g3 = new Goods("黄豆");
    Goods g4 = new Goods("可乐");
    Goods g5 = new Goods("雪碧");

    Supermarket m = new Supermarket();
    m.setName("大润发");
    m.setStore(new Goods[]{g4,g5});



    }
}
