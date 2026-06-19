import java.util.*;

class Item {

    int itemCode;
    String itemTitle;
    int stockCount;
    double unitCost;

    Item(int itemCode, String itemTitle,
         int stockCount, double unitCost) {

        this.itemCode = itemCode;
        this.itemTitle = itemTitle;
        this.stockCount = stockCount;
        this.unitCost = unitCost;
    }
}

public class WarehouseSystem {

    static HashMap<Integer, Item> records = new HashMap<>();

    static void insertItem(Item obj) {
        records.put(obj.itemCode, obj);
    }

    static void modifyItem(int code, int newStock) {
        if(records.containsKey(code))
            records.get(code).stockCount = newStock;
    }

    static void removeItem(int code) {
        records.remove(code);
    }

    public static void main(String[] args) {

        insertItem(new Item(101,"Monitor",20,12000));
        insertItem(new Item(102,"Printer",8,15000));

        modifyItem(101,25);

        removeItem(102);
    }
}