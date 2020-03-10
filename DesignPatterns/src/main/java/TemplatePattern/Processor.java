package TemplatePattern;

public abstract class Processor {
	public void readProcessAndSaveData() {
		readData();
		processData();
		saveData();
	}
	public abstract void readData();
	public abstract void processData();
	public void saveData() {
		System.out.println("Save data into database!");
	}
	
}