import java.net.URL;
import java.io.InputStream;

public class URLExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://ekalyan.cgg.gov.in/studentLogin.do?mode=logout");
            
            System.out.println("Protocol: " + url.getProtocol());  // https
            System.out.println("Host: " + url.getHost());          // www.example.com
            System.out.println("Port: " + url.getPort());          // 80
            System.out.println("Path: " + url.getPath());          // /path/to/resource
            System.out.println("File: " + url.getFile());          // /path/to/resource?query=value
            System.out.println("Query: " + url.getQuery());        // query=value
            System.out.println("Ref: " + url.getRef());            // fragment
            
            // Open connection or stream
            InputStream stream = url.openStream();
            stream.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

