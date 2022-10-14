package filestask;

import java.io.FileReader;
import java.time.ZoneId;
import java.util.Properties;
import java.util.Scanner;

public class FileTestRunner {
static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
	FileWriterOne helper = new FileWriterOne();
	FileTestRunner runnerObj = new FileTestRunner();
	Experiment5 exp5Helper = new Experiment5(" u");
	Experiment6 exp6Helper = new Experiment6("shyam",22);
	ClockTask clockHelper = new ClockTask();
	
	String carryon = "";
	do{
		System.out.println("ENTER THE QUESTION NO :: ");
		 int question = scan.nextInt();
			

	try{
	switch (question){
	case 1:{
		System.out.println("enter the name of the file");
		String name= scan.next();
		System.out.println("enter the directory you want to make");
		String direc = scan.next();
	System.out.println("no. of line you want to enter ::");
		int input = scan.nextInt();
		scan.nextLine();
		String output ="";
		String[] given= new String[input];
	for(int i = 0;i<input;i++) {
		System.out.println("write the line no:"+i+"-");
		given[i]= scan.nextLine();
		output += given[i]+"\n";
	}
	helper.writeIntoFile(name,direc,output);
	break; 
	}
	case 2:{
		System.out.println("enter the name of the file");
		String name= scan.next();
		System.out.println("enter the directory you want to make");
		String direc = scan.next();
		Properties newProp=new Properties(); 
		System.out.println("no. of properties you want to enter ::");
		int input = scan.nextInt();
		scan.nextLine();
		String[] key= new String[input];
		String[] value= new String[input];
		String valueInput ="";
		String keyInput="";
	for(int i = 0;i<input;i++) {
		System.out.println("write the key no:"+i+"-");
		key[i]= scan.nextLine();
		keyInput = key[i];
		System.out.println("write the valyue no:"+i+"-");
		value[i]=scan.nextLine();
		valueInput = value[i];
		helper.getProperty(newProp,keyInput, valueInput);
}
	helper.writePropIntoFile(name,direc,newProp);
	break;
	}
	case 3:{
		FileReader file = new FileReader("/home/inc9/myDir/prop.txt");
		Properties newProp=new Properties();
		newProp.load(file);
		System.out.println(newProp);
	break;
	}
	case 5:{
		System.out.println(exp5Helper);
		break;
	}
	case 6:{
		System.out.println(exp6Helper);
break;
	}
	case 7:{
		Experiment6 objNew = new Experiment6();
		String input = "Shyam";
		int entry = 22;
		objNew.setNumber(entry);
		objNew.setGiven(input);
		System.out.println( objNew.getNumber());		
		
		System.out.println(objNew.getGiven());
		break;
	}
	case 9:{
		for (Colours print : Colours.values()) {
			int value = print.getCode();
			System.out.println("The colour code of "+print+" is "+value);
			System.out.println("the index of "+print+":"+print.ordinal());
	}
		break;
	}
	case 10:{
		Singleton singletonHelper1 = Singleton.getInstance();
		Singleton singletonHelper2 = Singleton.getInstance();
		Singleton singletonHelper3 = Singleton.getInstance();
		System.out.println(singletonHelper1.hashCode());
		System.out.println(singletonHelper3.hashCode());
		System.out.println(singletonHelper2.hashCode());
		break;
	}
	case 11:{
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("the current date and time over "+zone+" is:");
		clockHelper.getCurrentTime();
		System.out.println("current time in millis :");
		clockHelper.getTimeInMilli();
		System.out.println("enter the zone id you want the time of:");
		String inputZone = scan.next();
		clockHelper.getZoneTime(inputZone);
		System.out.println("enter the zone id you want the weekday of:");
		String inputZoneWeek = scan.next();
		System.out.println("the weekday is:");
		clockHelper.getCurrentWeek(inputZoneWeek);
		System.out.println("enter the zone id you want the month of:");
		String inputZoneMonth = scan.next();
		System.out.println("the month is:");
		clockHelper.getCurrentMonth(inputZoneMonth);
		System.out.println("enter the zone id you want the year of:");
		String inputZoneYear = scan.next();
		System.out.println("the year is:");
		clockHelper.getCurrentYear(inputZoneYear);
	
	}
	}
	}
	catch (Exception ex){
	System.out.println(ex.getMessage());
	}
	System.out.print("Do you want to continuation yes/no ::" );
	carryon = scan.next(); 
	} 

	while (carryon.equals("yes"));
}
}
