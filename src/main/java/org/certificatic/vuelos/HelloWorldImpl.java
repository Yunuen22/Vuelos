
package org.certificatic.vuelos;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.vuelos.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

