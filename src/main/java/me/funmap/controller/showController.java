package me.funmap.controller;

import com.sun.deploy.net.HttpResponse;
import me.funmap.model.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class showController {


    @GetMapping("/show")
    public String showSomething(User user) throws Exception{
        int i = 0;
        return "show";
    }

}
