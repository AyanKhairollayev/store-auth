package kz.khairollayev.storeauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/public")
    public String publicApi() {
        return "FROM PUBLIC";
    }

    @GetMapping("/api/private")
    public String privateApi() {
        return "FROM PRIVATE";
    }
}
