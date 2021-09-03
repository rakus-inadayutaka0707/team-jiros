package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.service.ShowItemDetailService;

/**
 * 商品詳細情報を操作するコントローラークラス.
 * 
 * @author kojiro0706
 *
 */
@Controller
@RequestMapping("/show-item-detail")
public class ShowItemDetailController {

	@Autowired
	private ShowItemDetailService showItemDetailService ;
	
	/**
	 * 商品詳細画面を出力する.
	 * 
	 * @param id　商品ID
	 * @param model リクエストスコープ
	 * @return 商品情報
	 */
	@RequestMapping("")
	public String showItemDetail(Integer id,Model model) {
		Item item = showItemDetailService.showItemDetail(id);
		model.addAttribute("item",item);
		
		return "item_detail";
	}
	
}
