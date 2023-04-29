package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        Product product = new Product();

        System.out.printf("%nEntre com os dados do produto:%n");
        System.out.print("Nome: ");
        product.name = s.nextLine();

        System.out.print("Preço: ");
        product.price = s.nextDouble();

        System.out.print("Quantidade: ");
        product.quantity = s.nextInt();

        System.out.printf("%nDados do produto: %s, %n",product);

        System.out.print("Entre com a quantidade a ser adicionada ao estoque: ");
        product.addProducts(s.nextInt());

        System.out.printf("%nDados Atulizados: %s, %n",product);

        System.out.print("Entre com a quantidade a ser removida do estoque: ");
        product.removeProducts(s.nextInt());

        System.out.printf("%nDados Atulizados: %s", product);

        s.close();
    }
}
