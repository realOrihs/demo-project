package kolyganov.demoproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class IndexController {
    @GetMapping("/")
    public Map<String, Object> index() {
        Map<String, Object> model = new HashMap<>();
        model.put("key1", 15);
        model.put("key2", 200);
        model.put("key3", "строка");
        return model;
    }

    @GetMapping(value = "/check")
    public String check(String ans, String ans2, Map<String, Object> model){
        log.info("{}, {}", ans, ans2);
        if (ans.equals("4") && ans2.equals("10")){
            return "success";
        } else {
            model.put("right1",4);
            model.put("right2",10);
            model.put("user1",ans);
            model.put("user2",ans2);
            return "error";
        }
    }
}
