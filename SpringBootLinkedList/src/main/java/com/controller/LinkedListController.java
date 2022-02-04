package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Node;
import com.service.LinkedListService;

@RestController
@RequestMapping("/")
public class LinkedListController {

	@Autowired
	private LinkedListService linkedListService;

	@PostMapping("/add")
	public String addNodeToList(@RequestBody Node node) {
		linkedListService.add(node.getData());
		return "Add Success";
	}
	
	@GetMapping("/display")
	public String  displayList() {
		return linkedListService.display();
	}
}
