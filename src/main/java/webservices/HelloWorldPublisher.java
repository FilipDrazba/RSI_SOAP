package webservices;

import pl.edu.pb.wi.fd.HelloWorld;
import pl.edu.pb.wi.fd.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
        System.out.println("Web serwis czeka na klienta...");
    }
}
