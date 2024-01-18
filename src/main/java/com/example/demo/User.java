package com.example.demo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Data1> data;

	public List<Data1> getData() {
		return data;
	}

	public void setData(List<Data1> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "User [data=" + data + "]";
	}

}
