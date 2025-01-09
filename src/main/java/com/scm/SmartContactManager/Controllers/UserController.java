package com.scm.SmartContactManager.Controllers;

import com.scm.SmartContactManager.Components.UserRegistrationForm;
import com.scm.SmartContactManager.Services.UserService;
import com.scm.SmartContactManager.Services.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public String signup(Model model){
        UserRegistrationForm userForm = new UserRegistrationForm();
        userForm.setProfilePic("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2Fblack-default-profile-picture--85638830413249479%2F&psig=AOvVaw3H5NPru8qq_tH0_YbfaQbj&ust=1736498713623000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMiuxPqf6IoDFQAAAAAdAAAAABAE");
        model.addAttribute("userForm", userForm);
        return "signup";
    }


    @PostMapping("/registerUser")
    public String registerUser(@RequestBody UserRegistrationForm userForm){
        System.out.println("userForm - " + userForm);
        return "redirect:/signup";
    }
}
