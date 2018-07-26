import java.text.NumberFormat;
import java.util.List;

@SuppressWarnings("ALL")
public class ProductPriceCalculator {
    /**
     * @param s
     * @param u
     * @return product price
     */
    public double productPrice(String s, String u) {
        //get all users
        List<User> us = UserDAO.getInstance().getAllUsers();
        //loop through users
        for (int j = 0; j < us.size(); j++) {
            if (us.get(j).name().equals(u)) {
                // if user is employee
                if (us.get(j).name().equals(u) && us.get(j).isEmployee()) {
                    //get the products
                    List<Product> b = ProductDAO.getInstance().getAllProducts();
                    //loop throught products
                    for (int i = 1; i <= b.size(); i++) {
                        Product p = b.get(i-1);
                        //ignore if
                        if (!p.name().equals(s)) {
                             continue;
                        }
                        else {
                            p.updatePrc(p.prc() - (p.prc() * 0.05));
                        }
                    }
                }
            }
        }
        List<Product> x = ProductDAO.getInstance().getAllProducts();
        for (int i = 0; i < x.size(); i++) {
            Product p = x.get(i);
            if (p.name().equals(s)) {
                return p.prc();
            }
        }
        return 0;
    }
    /**
     * @param s
     * @param u
     * @return formatted product price
     */
    public String formattedPrice(String s, String u) {
        List<Product> x = ProductDAO.getInstance().getAllProducts();
        for (int i = 0; i < x.size(); i++) {
            Product p = x.get(i);
            if (p.name().equals(s)) {

                double amt = p.prc();
                NumberFormat currencyFormatter =
                        NumberFormat.getCurrencyInstance();
                return currencyFormatter.format(amt);
            }
        }
        return "";
    }
}
