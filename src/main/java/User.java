public class User {
    private String name;
    private boolean isEmployee;

    User(String name, boolean isEmployee) {
        this.name = name;
        this.isEmployee = isEmployee;
    }

    public String name() {
        return name;
    }

    public boolean isEmployee() {
        return isEmployee;
    }
}
