package com.software3.hors.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class BasicAction extends ActionSupport {

	public List<String> strs2List(String... text) {
		ArrayList<String> textList = new ArrayList<String>();
		for (int i = 0; i < text.length; i++) {
			textList.add(text[i]);
		}
		return textList;
	}
	
}
