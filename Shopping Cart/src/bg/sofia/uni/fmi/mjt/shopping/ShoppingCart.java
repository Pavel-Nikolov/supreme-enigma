package bg.sofia.uni.fmi.mjt.shopping;

import bg.sofia.uni.fmi.mjt.shopping.item.Item;
import java.util.Collection;

public interface ShoppingCart {

  
    Collection<Item> getUniqueItems();

  
    Collection<Item> getSortedItems();

    void addItem(Item item);

  
    void removeItem(Item item);

    
    double getTotal();
}