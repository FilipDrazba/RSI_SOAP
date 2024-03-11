package pl.edu.pb.wi.fd;

//Service Implementation

import javax.jws.WebService;

@WebService(endpointInterface = "pl.edu.pb.wi.fd.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String getHelloWorldAsString(String name) {
        return "Witaj świecie JAX-WS: " + name;
    }
}
