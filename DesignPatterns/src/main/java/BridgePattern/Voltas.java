package BridgePattern;

class Voltas extends TV {
	  Remote remoteType;
	  Voltas(Remote r) {
	    super(r);
	    this.remoteType = r;
	  }
	  
	  public void on(){
	    System.out.print("Voltas TV ON: ");
	    remoteType.on();
	  }
	    
	  public void off(){
	    System.out.print("Voltas TV OFF: ");
	    remoteType.off();
	  }
	  public void volumeUp() {
		  System.out.print("Voltas TV VOLUp: ");
		  remoteType.volumeUp(); 
	  }
	  public void volumeDown() {
		  System.out.print("Voltas TV VOLDown: ");
		  remoteType.volumeDown(); 
	  }
}