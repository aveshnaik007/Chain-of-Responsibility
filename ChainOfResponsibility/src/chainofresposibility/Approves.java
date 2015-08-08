package chainofresposibility;

public abstract class Approves {

	Approves superior;
	
	abstract public void sanctionMoney(Purchage p);
	
	public Approves getSuperior() {
		return superior;
	}

	public void setSuperior(Approves superior) {
		this.superior = superior;
	}
}
