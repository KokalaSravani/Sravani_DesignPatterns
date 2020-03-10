package BridgePattern;

class Onida extends TV {
	  Remote remoteType;
	  
	  Onida(Remote r) {
	    super(r);
	    this.remoteType = r;
	  }
	  
	  public void on(){
	    System.out.print("Onidac TV ON: ");
	    remoteType.on();
	  }
	    
	  public void off(){
	    System.out.print("Onida TV OFF: ");
	    remoteType.off();
	  }
	  public void volumeUp(){
		  System.out.print("Onida TV VOLUp: ");
		  remoteType.volumeUp();
	  }
	  public void volumeDown(){
		  System.out.print("Onida TV VOLDown: ");
		  remoteType.volumeDown();
	  }
	}