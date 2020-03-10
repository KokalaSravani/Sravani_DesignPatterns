package TemplatePattern;

public class ImplementPattern {

	public static void main(String[] args) {
	
		System.out.println("--Data Processing of MicrosoftFile--");
		MicrosoftFile ms = new MicrosoftFile();
		ms.readProcessAndSaveData();
		System.out.println();
		System.out.println("--Data Processing of TEXTFile--");
		TextFile t = new TextFile();
		t.readProcessAndSaveData();

	}

}