public class SearchDemo {

    public static void main(String[] args) {

        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(102, "Watch", "Accessories"),
            new Product(104, "Bag", "Fashion")
        };

        Product result1 = LinearSearch.search(products, 103);

        System.out.println("Linear Search Result:");
        System.out.println(result1);

        Product[] sortedProducts = {
            new Product(101, "Phone", "Electronics"),
            new Product(102, "Watch", "Accessories"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Bag", "Fashion"),
            new Product(105, "Laptop", "Electronics")
        };

        Product result2 = BinarySearch.search(sortedProducts, 103);

        System.out.println("\nBinary Search Result:");
        System.out.println(result2);
    }
}