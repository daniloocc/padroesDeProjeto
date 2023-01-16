package com.adapter.principle;

public class AdapterPlug implements Plug {

	@Override
	public int recharge() {
		HighVoltagePlug bigplug = new HighVoltagePlug();
		int v = bigplug.recharge();
		v = v - 64;
		return v;
	}

}
