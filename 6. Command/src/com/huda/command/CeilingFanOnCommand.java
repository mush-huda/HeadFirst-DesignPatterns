package com.huda.command;

import com.huda.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.on();
	}
	
	public void undo() {
		ceilingFan.off();
	}
}
