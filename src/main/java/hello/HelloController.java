package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Value("${spring.message}")
    String message;

    @RequestMapping("/hello")
    public String index() {
        return "Hi marc and  " + message;
    }

}