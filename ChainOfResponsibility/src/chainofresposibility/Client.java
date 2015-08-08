package chainofresposibility;

public class Client {
	
	public static void main(String arg[]) {
	
	Secretary s = new Secretary();
	VicePresident vp = new VicePresident();
	President p = new President();
	
	s.setSuperior(vp);
	vp.setSuperior(p);
	
	Purchage pc = new Purchage();
	pc.setPurchageNum(1110);
	pc.setAmout(26000);
	
	s.sanctionMoney(pc);
	
	}
}
