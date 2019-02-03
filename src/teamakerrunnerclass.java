
public class teamakerrunnerclass {
public static void main(String[] args) {
	Cup teacup = new Cup();
	TeaBag teabag = new TeaBag(TeaBag.GREEN);
	teabag.getFlavor();
	Kettle kettle = new Kettle();
	kettle.boil();
teacup.makeTea(teabag, kettle.getWater());
	
}
}
