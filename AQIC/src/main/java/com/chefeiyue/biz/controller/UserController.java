package com.chefeiyue.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chefeiyue.biz.service.UserService;
import com.chefeiyue.db.model.User;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userServiceImpl;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {
		
		userServiceImpl.addUser(user);
		
		return "redirct:list/" + user.getId();
	}
	
	@RequestMapping(value="/list/{id}", method=RequestMethod.GET)
	public String listUser(@PathVariable Integer id, Model model) {
		
		User user = userServiceImpl.getUserById(id);
		model.addAttribute(user);
		return "result";
	}
 	
}
