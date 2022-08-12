package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import entity.Employee;

public class WriteToFile{
	String path = "F:/Eclipse/Experiment 15/data/Sample.dat";
	File file = new File(path);
	FileWriter writer = null;
	

	public void writing(Employee employee) throws IOException {
		writer = new FileWriter(file, true);
		writer.write(employee.toString());
		writer.close();
	}
	
	public void emptyFile() throws IOException{
		writer = new FileWriter(file);
		writer.close();
	}
}
	
