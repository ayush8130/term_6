package com.niit.shopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shopbackend.dao.CategoryRepository;
import com.niit.shopbackend.model.Category;



@Controller
public class HomeController {
	@Autowired
	private Category category;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	
	@RequestMapping("/Login")
	public String LoginPage()
	{
		return "Login";
	}
	
	@RequestMapping("/Sigin")
	public String Siginpage()
	{
		return "Sigin";
	}

	
	@RequestMapping("/product")
	public String productpage()
	{
		return "product";
	}
	
	@RequestMapping("/Category")
	public String categoryPage(Model model)
	{  List<Category> allCategories= categoryRepository.getAllCategory();
		model.addAttribute("cat",category);
		model.addAttribute("categoryList",allCategories);
		return "Category";
		
	}
}	

