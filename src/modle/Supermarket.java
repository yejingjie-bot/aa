public class Supermarket {
    private String name;
    private Goods[] store;

    public String getName(){
        return name;
    }

    public  void  setName(String name){
        this.name = name;
    }

    public Goods[] getStore(){
        return store;
    }

    public void setStore(Goods[] store){
        this.store = store;
    }

    public Goods sellGoods(String nane){
        for (int i = 0; i < store.length; i++) {
            if (store[i].getName() == name){
                return store[i];
            }
        }
        return null;
    }


}
