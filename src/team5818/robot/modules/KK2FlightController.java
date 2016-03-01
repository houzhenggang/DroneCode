package team5818.robot.modules;

import java.util.concurrent.TimeUnit;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Handles all communication with the KK2.1 flight controller.
 */
public class KK2FlightController extends Subsystem implements Module {

	@Override
	public void initModule() {
		try {
		TimeUnit.SECONDS.wait(1);
		} catch(Exception e) {
			DriverStation.reportError("Could not timeout.", false);
		}
	}

	@Override
	protected void initDefaultCommand() {
	}

}
