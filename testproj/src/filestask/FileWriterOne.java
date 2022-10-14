package filestask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import createdexception.CustomException;

public class FileWriterOne {
	public void nullCheck(Object given) throws CustomException {
		if (Objects.isNull(given)) {
			throw new CustomException("list cannot be null");
		}
	}
	private File makeDirFile(String direc) {
		File dir = new File(direc);//"/home/inc9/myDir"
		dir.mkdir();
		return dir;
	}
public void writeIntoFile(String fileName,String direc,String input) throws CustomException {
	try(FileWriter newFile = new FileWriter(fileName)) {//swamiresolved   "/home/inc9/myDir/sample.txt"
		File dir = makeDirFile(direc); 
		input = input+"\n";
		newFile.write(input);
		//swami find where to close resolved
	} catch (IOException e) {
		throw new CustomException("IOException occurred",e);			
	}
}
public Properties getProperty(Properties newProp,String key,String value) throws CustomException {
	nullCheck(key);
	nullCheck(value);
	newProp.setProperty(key, value);//Swami resolved
	return newProp;
}
public void writePropIntoFile(String fileName,String direc,Properties prop) {
	try(FileWriter newFile = new FileWriter(direc+"/"+fileName)) {    //"/home/inc9/myDir/prop.txt"
		File dir = makeDirFile(direc);   //swami resolved      "/home/inc9/myDir"
		//swami
		prop.store(newFile, "inc list");

	} catch (IOException e) {
		e.printStackTrace();
	}
	//Swami  where is close??
}
}

