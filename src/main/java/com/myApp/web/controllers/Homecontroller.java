/**
 * @Author MY
 * @version: 1.0
 * @project: springBootDefaultTemplate
 * @description : Spring Template project.
 *
 * @file: Homecontroller.java
 * @Date : Jul 12, 2018:2018:3:49:54 PM
 * @Updates : Jul 12, 2018:2018:3:49:54 PM
 **/
package com.myApp.web.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.myApp.repositories.ExpenseEntityRepository;

// TODO: Auto-generated Javadoc
/*** The Class Homecontroller. */

@Controller
public class Homecontroller implements WebMvcConfigurer {

	/** The excep repo. */
	@Autowired
	private ExpenseEntityRepository	excepRepo;

	/** The message source. */
	@Autowired
	private MessageSource			messageSource;

	/**
	 * Home.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@RequestMapping("/login")
	public String login(Model model) {
		model.addAttribute("login", "Login");
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("exceps", excepRepo.findAll());
		return "home";
	}

	@RequestMapping(value = "/addExpense", method = RequestMethod.GET)
	public String addExpense(Model model) {
		model.addAttribute("addExpense", "AddExpense");
		return "addExpense";
	}

	@RequestMapping(value = "/findAllExpense", method = RequestMethod.GET)
	public String findByAccNum(Model model, @RequestParam String allExp) {
		model.addAttribute("allExpenses", excepRepo.findAllExpense(new BigDecimal(allExp)));
		return "home";
	}

	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleException(NullPointerException ex) {
		ModelAndView model = new ModelAndView("error");
		model.addObject("exception", ex);
		return model;
	}

}
