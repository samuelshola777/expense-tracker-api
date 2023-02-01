package comPairlearningExpenseTrackerApi.user.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/Api/User")
public class UserController {


    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> userMap){

        String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");

        return firstName+ " \n  "+ lastName + " \n" + email + " \n"+ password;

    }

}
