package com.adapter.cases;

public class ListView {

	private Adapter adapter;

	public void setAdapter(Adapter adapter) {
		this.adapter = adapter;
	}
	
	public void show() {
		String[] data = adapter.createUI();
		for (String string : data) {
			System.out.println(string);
		}
	}

}
