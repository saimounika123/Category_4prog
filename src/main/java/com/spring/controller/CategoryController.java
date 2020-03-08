package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.CategoryDAO;
import com.spring.domain.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categorydao;

	@RequestMapping("/")
	public ModelAndView createCategory() {
		ModelAndView mv = new ModelAndView("index");
		return mv;

	}

	@RequestMapping("/home")
	public ModelAndView categoryList(@ModelAttribute("category") Category category) {
		ModelAndView mv = new ModelAndView();
		CategoryDAO cdao = new CategoryDAO();
		Category cat = new Category();
		boolean res = categorydao.createCategory(cat);
		if (res) {
			mv.setViewName("home");
			mv.addObject(categorydao.listCategories());
			return mv;

		} else
			mv.setViewName("index");
		return mv;
	}
}