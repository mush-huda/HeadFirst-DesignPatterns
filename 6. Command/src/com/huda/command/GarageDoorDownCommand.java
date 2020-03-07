package com.huda.command;

import com.huda.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command{
	
	GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}
	
	public void undo() {
		garageDoor.up();
	}
}
