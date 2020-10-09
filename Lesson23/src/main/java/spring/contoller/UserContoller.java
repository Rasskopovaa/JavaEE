package spring.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spring.service.UserService;


@Controller
public class UserContoller {
    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String registerUser(@RequestParam(value = "login", required = true) String login,
                               @RequestParam(value = "password", required = true) String password,
                               Model model) {
        userService.addUser(login, password);
        return "register";
    }


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegister(Model model) {
        return "register";
    }
}
