package com.app;


class Ballon {
        public void startBlowing() {
                System.out.println("BLOW IN");
        }
        public void startBlowingOFF() {
                System.out.println("BLOW OUT");
        }
}

class Contoller {
        private Client UpCommand, DownCommand;
        public Contoller( Client Up, Client Down) {
                UpCommand = Up; // concrete Command registers itself with the invoker 
                DownCommand = Down;
        }
        void flipUp( ) { // invoker calls back concrete Command, which executes the Command on the receiver 
                        UpCommand . execute ( ) ;                           
        }
        void flipDown( ) {
                        DownCommand . execute ( );
        }
}

class FanOnCommand implements Client {
        private Ballon myFan;
        public FanOnCommand ( Ballon F) {
                myFan  =  F;
        }
        public void execute( ) {
                myFan . startBlowing( );
        }
}
class FanOffCommand implements Client {
        private Ballon myFan;
        public FanOffCommand ( Ballon F) {
                myFan  =  F;
        }
        public void execute( ) {
                myFan . startBlowingOFF( );
        }
}


public interface Client {
        public abstract void execute ( );
}