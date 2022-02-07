
package com.mblinn.oo.command;

import com.mblin.oo.command.Command;

public class RecordingStubCommand implements Command {

	public boolean wasExecuted = false;
	
	@Override
	public void execute() {
		wasExecuted = true;
	}

}
