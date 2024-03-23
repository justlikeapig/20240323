package org.kklt.model;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public MyService() {
    }

    protected String sayHello(String param) {

        return "hello" + param;
    }
}
