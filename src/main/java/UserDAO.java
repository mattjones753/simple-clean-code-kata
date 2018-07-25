import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private List<User> users = new ArrayList<>();

    private static UserDAO instance;

    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User u) {
        this.users.add(u);
    }

    public void clearUsers() {
        this.users.clear();
    }
}
