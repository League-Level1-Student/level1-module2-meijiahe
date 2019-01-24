package extra;

public class Person {
String name;
String superpower;

String getname() {
	return name;
}
String getsuperpower() {
	return superpower;
}
void setname(String name) {
	this.name=name;
}
void setsuperpower(String superpower) {
	this.superpower=superpower;
}
public String toString() { 
	return name+" has mad "+superpower+" skills";
}
}