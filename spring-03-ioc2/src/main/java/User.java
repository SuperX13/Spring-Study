public class User {
    private String name;

    public User(){
        System.out.println("我是无参构造");
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
