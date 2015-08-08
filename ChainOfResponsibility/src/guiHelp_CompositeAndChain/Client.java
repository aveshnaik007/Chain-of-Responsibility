package guiHelp_CompositeAndChain;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowContainer wc = new WindowContainer();
		WindowContainer subWc = new WindowContainer();
		RadioButton rb = new RadioButton();
		ListBox lb = new ListBox();
		DropList dl = new DropList();
		
		subWc.add(rb);
		subWc.add(lb);
		subWc.add(dl);
		
		wc.add(subWc);
		
		rb.help();
		dl.help();
		lb.help();
		
	}

}
