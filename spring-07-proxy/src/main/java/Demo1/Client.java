package Demo1;
//客户找中介代理租房
public class Client {
    public static void main(String[] args) {
//        房东出租房子
        Host host = new Host();
//       中介帮助房东出租房子
        Proxy proxy = new Proxy(host);
//        客户找中介
        proxy.rent();
    }
}
