package introducao_orientacao_objetos.entities.produtos;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double TotalValueInStock(){
        return price * quantity;
    }

    public String showProduct(){
        return String.format("%s, $ %.2f, %d units, Total: $ %.2f%n", this.name, this.price, this.quantity, this.TotalValueInStock());
    }

    public void AddProducts(int addQuantity){
        this.quantity+=addQuantity;
    }

    public void RemoveProducts(int removeQuantity){
        this.quantity-=removeQuantity;
    }

}
