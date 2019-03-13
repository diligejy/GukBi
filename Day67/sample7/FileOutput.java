package sample7;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutput implements Outputter {
	private String filePath;

	public FileOutput() {

	}

	// <bean id = "fo" class = "sample7.FileOutput>
	// <property name = "filepath" value = "data.txt"/>
	// </bean>
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void output(String message) throws IOException {
		FileWriter out = new FileWriter(filePath);
		out.write(message);
		out.close();
	}

}
