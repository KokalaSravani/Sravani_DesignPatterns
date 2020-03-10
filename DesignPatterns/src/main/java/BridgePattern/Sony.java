package BridgePattern;

class Sony extends TV {
	  Remote remoteType;
	  Sony(Remote r) {
	    super(r);
	    this.remoteType = r;
	  }
	  
	  public void on(){
	    System.out.print("Sony TV ON: ");
	    remoteType.on();
	  }
	    
	  public void off(){
	    System.out.print("Sony TV OFF: ");
	    remoteType.off();
	  }
	  public void volumeUp() {
		  System.out.print("Sony TV VOLUp: ");
		  remoteType.volumeUp(); 
	  }
	  public void volumeDown() {
		  System.out.print("Sony TV VOLDown: ");
		  remoteType.volumeDown(); 
	  }
	}