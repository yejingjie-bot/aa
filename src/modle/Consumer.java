public class Consumer {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Goods shopping(Supermarket s ,String goodsName){
        return s.sellGoods(goodsName);
    }
}
