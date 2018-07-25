import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private static ProductDAO instance;
    private List<Product> products = new ArrayList<>();

    public static ProductDAO getInstance() {
        if (instance == null) {
            instance = new ProductDAO();
        }
        return instance;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product p){
        this.products.add(p);
    }

    public void clearProducts() {
        this.products.clear();
    }
}
