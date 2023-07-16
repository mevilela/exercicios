package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;


public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.println("Common, used or imported? (c/u/i)");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("price: ");
            double price = sc.nextDouble();
            if (ch == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            } else if (ch == 'u') {
                System.out.print("Manufacture Date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, date);
                list.add(product);
            } else {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }

        }
            System.out.println();
            System.out.println("PRICE TAGS");
            for (Product product : list) {
                System.out.println(product.priceTag());
            }

        sc.close();
    }
}