package filestask;

public class Experiment6 {
int number;
String given;
public Experiment6(String input,int num) {
	this.given=input;
	this.number=num;
}
public Experiment6() {
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getGiven() {
	return given;
}
public void setGiven(String given) {
	this.given = given;
}
 public String toString() {//swami resolved
return given+number;	
}
}
