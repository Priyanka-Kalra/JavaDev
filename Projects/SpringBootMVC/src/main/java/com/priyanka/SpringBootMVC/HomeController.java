package com.priyanka.SpringBootMVC;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @RequestMapping("/add")
//    public String home(HttpServletRequest req, HttpSession session) {
//
//        int n1= Integer.parseInt(req.getParameter("nums1"));
//        int n2= Integer.parseInt(req.getParameter("nums2"));
//
//        session.setAttribute("result",n1+n2);
//
//        return "index";
//
//    }

//    @RequestMapping("/add")
//    public String home(@RequestParam("nums1") int n1,@RequestParam("nums2") int n2, HttpSession session, Model model) {
//
//        model.addAttribute("result",n1+n2+3);
//        return "index";
//
//    }

    @RequestMapping("/add")
    public ModelAndView home(@RequestParam("nums1") int n1, @RequestParam("nums2") int n2, HttpSession session, ModelAndView mv) {


        mv.addObject("result", n1 + n2 + 3);//model object
        mv.setViewName("index");//setting view

        return mv;

    }

    //    public ModelAndView alien(@ModelAttribute Alien alien, ModelAndView mv) {//modelAttribute is optional to use
    @RequestMapping("/alien")
    public ModelAndView alien(Alien alien, ModelAndView mv) {//modelAttribute is optional to use

//        Alien alien=new Alien(); Model attribute will create object alien and assign values from param
        mv.addObject("alien", alien);//model object
        mv.setViewName("index");//setting view

        return mv;

    }
}
