package co.com.Diaz.Juan.Service;

import co.com.Diaz.Juan.Entity.GroceryItem;
import co.com.Diaz.Juan.Repository.GroceryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ItemService {


    //boolean started=false;
    /*public void setGroceryItems(){
        if (this.started==false){
            this.groceryItems = new ArrayList();
            groceryItems.add(new GroceryItem("Whole", "Whole Wheat Biscuit", 5, "snacks"));
            groceryItems.add(new GroceryItem("Dried", "Dried Whole Red Chilli", 2, "spices"));
            groceryItems.add(new GroceryItem("Pearl", "Healthy Pearl Millet", 1, "millets"));
            groceryItems.add(new GroceryItem("Cheese", "Bonny Cheese Crackers Plain", 6, "snacks"));
            this.started=true;
        }
    }*/

    @Autowired
    GroceryRepository dao;

    public List<GroceryItem> getAll() {
        //setGroceryItems(); // Asegúrate de que los elementos están inicializados
        List<GroceryItem> groceryItems = dao.findAll();
        return groceryItems;
    }

    public String insert(GroceryItem groceryItem){
        //setGroceryItems();
        //groceryItems.add(new GroceryItem(groceryItem.getId(), groceryItem.getName(), groceryItem.getQuantity(), groceryItem.getCategory()));
        dao.save(groceryItem);
        return "---- ITEM GUARDADO EXITOSAMENTE ----";
    }

    public String update(GroceryItem groceryItem){
        //setGroceryItems();
        List<GroceryItem> groceryItemList = dao.findAll();

        for (GroceryItem grocery: groceryItemList) {
            if(grocery.getId().equals(groceryItem.getId())){
                dao.save(groceryItem);
                return "---- ITEM ACTUALIZADO ----";
            }
        }
        return "---ITEM NO ENCONTRADO---";
    }

    public String delete(String id) {
        //setGroceryItems();
        List<GroceryItem> groceryItemList = dao.findAll();

        for (GroceryItem grocery: groceryItemList) {
            if (grocery.getId().equals(id)) {
                dao.delete(grocery);
                return "---- ITEM BORRADO ----";
            }
        }
        return "---ITEM NO ENCONTRADO---";
    }

    public String updateData(String id, GroceryItem groceryItem){
        //setGroceryItems();
        List<GroceryItem> groceryItemList = dao.findAll();

        for (GroceryItem grocery: groceryItemList) {
            if (grocery.getId().equals(id)){
                if (groceryItem.getName()!= null){
                    grocery.setName(groceryItem.getName());
                    dao.save(grocery);
                }
                if (groceryItem.getCategory()!=null){
                    grocery.setCategory(groceryItem.getCategory());
                    dao.save(grocery);
                }
                return "---- ITEM ACTUALIZADO ----";
            }

        }
        return "---- ITEM  NO ENCONTRADO ----";
    }

    public String optionsUpdate(){
        return "OPTIONS: It insert a new grosery item, if the grosery item doesn't exist, it will create automatically";
    }


}
