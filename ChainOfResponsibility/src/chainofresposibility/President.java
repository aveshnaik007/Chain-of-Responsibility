package chainofresposibility;

public class President extends Approves{

	@Override
	public void sanctionMoney(Purchage p) {
		// TODO Auto-generated method stub
		if(p.getAmout()<35000)
			System.out.println("Money is sanction by President");
		else
			System.out.println("Requires Boad meating");
	}

}
