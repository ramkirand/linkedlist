package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Node;
import com.repository.LinkedListRepository;
import com.service.LinkedListService;

@Component
public class LinkedListServiceImpl implements LinkedListService {
	private Node head;
	@Autowired
	private LinkedListRepository linkedListRepository;

	public LinkedListServiceImpl() {
		head = null;
	}

	public String add(int x) {
		Node temp = new Node();
		temp.setData(x);
		temp.setNext(head);
		head = temp;
		linkedListRepository.save(temp);
		return x + ", added sccessfullyto the list";
	}

	public String display() {
		StringBuilder sb = new StringBuilder();
		Node ptr = head;
		while (ptr != null) {
			sb.append(ptr.getData()).append(" ");
			ptr = ptr.getNext();
		}
		return sb.toString();
	}

}
