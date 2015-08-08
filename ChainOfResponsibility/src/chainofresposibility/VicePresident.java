package chainofresposibility;

public class VicePresident extends Approves{

	
	@Override
	public void sanctionMoney(Purchage p) {
		// TODO Auto-generated method stub
		if(p.getAmout()<25000)
			System.out.println("Money is sanction by VicePresident");
		else{
			System.out.println("President cannot approve");
			this.superior.sanctionMoney(p);
		}
	}

}
