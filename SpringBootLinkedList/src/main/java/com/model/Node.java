package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Node implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	@Column(name = "DATA")
	private int data;

	@Column(name = "NEXT")
	private Node next;

	public Node(Integer id, int data, Node next) {
		this.id = id;
		this.data = data;
		this.next = next;
	}

	public Node() {
		this.next = null;
		this.data = 0;
	}

}
