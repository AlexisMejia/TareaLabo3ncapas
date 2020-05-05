package com.uca.capas.TareaLabo3ncapas.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.TareaLabo3ncapas.domain.Product;
import com.uca.capas.TareaLabo3ncapas.domain.validatePurchase;


@Controller
public class ProductController {
	private ArrayList<Product> list = Product.addProducts();
	private Product pro = new Product();
	private validatePurchase vp = new validatePurchase();
	
	
	
	@GetMapping("/comprarProducto")
	public ModelAndView getProduct(Product pro) {
		ModelAndView mav = new ModelAndView();
		
		for(Product pros : list) {
			System.out.println(pros.getNombre());
		}
		
		mav.setViewName("productos");
		mav.addObject("list", list);
		mav.addObject("products", new Product());
		
		return mav;
	}
	
	@PostMapping("/validar")
	public ModelAndView validate(Product pro) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("msg", list.get(pro.getId()).getNombre());
	
		if(pro.getCantidad() <= list.get(pro.getId()).getCantidad()) {
			mav.setViewName("compra");
		}else {
			mav.setViewName("error");
		}
		return mav;
	}
	


}
