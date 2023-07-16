package chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChatController {

    @GetMapping("/")
    public String index() {
        System.out.println("request recieved.");
        return "index";
    }

    @PostMapping("/join")
    public String joinChat(@RequestParam("username") String username, Model model) {
        model.addAttribute("username", username);
        return "chat";
    }
}
