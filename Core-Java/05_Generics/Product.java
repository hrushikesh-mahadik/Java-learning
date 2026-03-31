public class Product<T, V> {
    
    T items;
    V prices;

    Product(T item, V prices){
        this.items = items;
        this.prices = prices;
    }

    public T getItems(){
        return this.items;
    }
    public V getPrices(){
        return this.prices;
    }
}
