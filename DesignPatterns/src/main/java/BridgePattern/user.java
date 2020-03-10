package BridgePattern;

public class user {
	  public static void main(String[] args) {
		Remote r = new Remote();
	    TV sonytv = new Sony(r);
	    sonytv.on();
	    sonytv.volumeUp();
	    sonytv.volumeDown();
	    sonytv.off();
	    System.out.println();
	    
	    
	    TV onidatv = new Onida(r);
	    onidatv.on();
	    onidatv.volumeUp();
	    onidatv.volumeDown();
	    onidatv.off();
	    System.out.println();
	    
	    TV voltastv = new Voltas(r);
	    voltastv.on();
	    voltastv.volumeUp();
	    voltastv.volumeDown();
	    voltastv.off();
	    
	  }
	}