package webservices;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldImplService extends Service {

    public HelloWorldImplService() throws MalformedURLException {
        super(
                new URL("http://localhost:8080/ws/hello?wsdl"),
                new QName("http://localhost:9999/ws/hello", "HelloWorldImplService")
        );
    }

    public HelloWorldImplService(URL wsdlDocumentLocation, QName serviceName) {
        super(wsdlDocumentLocation, serviceName);
    }
}
