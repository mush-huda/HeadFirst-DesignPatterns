package com.huda.command;

import com.huda.receiver.Stereo;

public class StereoOffCommand implements Command{

	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
	}

}
