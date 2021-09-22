package com.app;
public class TestCommand {
	public static void main(String[] args) {

		Ballon  testLight = new Ballon( );
		Ballon testFan = new Ballon( );
		FanOnCommand foc = new FanOnCommand(testFan);
		FanOffCommand ffc = new FanOffCommand(testFan);
		Contoller cntr = new Contoller( foc,ffc);
		cntr.flipUp( );
		cntr.flipDown( ); 
	}
}               