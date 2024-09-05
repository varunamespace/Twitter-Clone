package pratice.twitter.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/demo")
public class DemoController {
    @GetMapping("/hello")
    public ResponseEntity<String> HelloUser(){
        return ResponseEntity.ok("hello");
    }
}
