package com.adapter.cases;

public class TestAdapter {
	
	public static void main(String[] args) {
		String[] data = {
			"Happy String Family",
			"Easy Learning Java",
			"Easy Learning Phyton",
			"Easy Learning HTML",
			"Easy Learning JavaScript"
		};
		
		ListView listView = new ListView();
		listView.setAdapter(new ArrayAdapter(data));
		listView.show();
		
		System.out.println("--------------------------");
		listView.setAdapter(new BaseAdapter(data));
		listView.show();
		
		
	}

}
