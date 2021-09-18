/*
 * package com.hsm.controller;
 * 
 * import org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.ModelAttribute; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * import com.hsm.model.Loginn;
 * 
 * @Controller public class MvcController {
 * 
 * @RequestMapping("home") public String show() {
 * 
 * 
 * return "Login"; }
 * 
 * 
 * @RequestMapping("loginurl") ModelAndView login(@RequestParam("userName")
 * String userName , @RequestParam("pwd") String pwd) { ModelAndView view=null;
 * if(userName.equals("ra") && pwd.equals("ra")) { view= new ModelAndView();
 *
 * view.setViewName("test"); view.addObject("userkey",userName); }
 * 
 * else { view= new ModelAndView("Login","errorkey","password is wrong");
 * //view.setViewName("Login");
 * //view.addObject("errorkey","password is wrong");
 * 
 * } return view; }
 * 
 * 
 * @RequestMapping("loginurl") ModelAndView login(@ModelAttribute Loginn login)
 * {
 * 
 * ModelAndView view=null; if(login.getUserName().equals("ra") &&
 * login.getPwd().equals("ra")) { view= new ModelAndView();
 * view.setViewName("test"); view.addObject("userkey",login.getUserName()); }
 * 
 * else { view= new ModelAndView("Login","errorkey","password is wrong");
 * //view.setViewName("Login");
 * //view.addObject("errorkey","password is wrong");
 * 
 * } return view; }
 * 
 * 
 * }
 * 
 * 
 */