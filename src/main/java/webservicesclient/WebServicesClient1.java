package webservicesclient;

import pl.edu.pb.wi.fd.HelloWorld;
import webservices.HelloWorldImplService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class WebServicesClient1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://fd.wi.pb.edu.pl/", "HelloWorldImplService");

        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);

        String zapytanie = "To ja - KLIENT 2";
        String response = hello.getHelloWorldAsString(zapytanie);
        System.out.println("Klient wystat: " + zapytanie);
        System.out.println("Klient otrzymat: " + response);
    }
}
