import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception {

        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP Address: " + IP.getHostAddress());
    }
}