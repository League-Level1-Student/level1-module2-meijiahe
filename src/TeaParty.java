public class TeaParty {
	       public String welcome(String name, boolean isWoman, boolean isKnighted) {
	       
	    if (isKnighted==true&&isWoman==true) {
	return "Hello Lady "+name;
}
	       else if (isKnighted==true&&isWoman==false) {
	return "Hello Sir "+name;
}
	       else if (isKnighted==false&&isWoman==true) {
	return "Hello Ms. "+name;
}
	       else  {
	return "Hello Mr. "+name;
}
}
	}


