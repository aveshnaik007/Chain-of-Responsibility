package chainofresposibility;

public class Secretary extends Approves{

	
	@Override
	public void sanctionMoney(Purchage p) {
		if(p.getAmout()<15000)
			System.out.println("Money is sanction by Secretary");
		else {
			System.out.println("Secretary cannot approve");
			this.superior.sanctionMoney(p);
		}
	}

}
