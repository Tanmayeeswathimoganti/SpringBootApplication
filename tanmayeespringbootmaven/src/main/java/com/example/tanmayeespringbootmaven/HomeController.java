package com.example.tanmayeespringbootmaven;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("home")
    public ModelAndView home(Alien alien) {


        ModelAndView mv = new ModelAndView();
//        System.out.println("hi " + alien.aname);
        mv.addObject("obj", alien);
        mv.setViewName("home");
        return mv;
    }

}


//accept the request
//in servlet http servlet request

//request dispatcher where two servlets can access same request object

//HttpServletRequest req, HttpServletResponse res

//data we are adding to session is getting to a dispatch a servlet
//here servlet is the view
//so basically we had the data which is model and dispatching it the view
//so we had modelAndView
//instead of using the session and everything we can use the ModeAndView to connect the modelAndView

//HttpSession session = req.getSession();
//String name = req.getParameter("name");

//HttpSession session
//session.setAttribute("name", myName);
//return "home.jsp";

//by using the ModelAndView we can add any number of objects and we can also set the view name

