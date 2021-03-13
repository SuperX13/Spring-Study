public class UserTwo {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public UserTwo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserTwo{" +
                "name='" + name + '\'' +
                '}';
    }
}
