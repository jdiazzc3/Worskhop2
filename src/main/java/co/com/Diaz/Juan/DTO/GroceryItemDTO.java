package co.com.Diaz.Juan.DTO;

public class GroceryItemDTO {
    private String name;
    private int quantity;
    private String category;

    public GroceryItemDTO() {
    }

    public GroceryItemDTO(String name, int quantity, String category) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}