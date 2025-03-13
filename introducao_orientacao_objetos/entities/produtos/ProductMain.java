package introducao_orientacao_objetos.entities.produtos;

import java.util.Locale;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int unity = sc.nextInt();

        Product product1 = new Product(name, price, unity);

        System.out.println("Product data: "+product1.showProduct());

        System.out.print("Enter the number of products to be added in stock: \n");
        unity = sc.nextInt();
        product1.AddProducts(unity);

        System.out.println("Updated data: "+product1.showProduct());

        System.out.print("Enter the number of products to be removed from stock: \n");
        unity = sc.nextInt();
        product1.RemoveProducts(unity);

        System.out.println("Updated data: "+product1.showProduct());


    }
}
