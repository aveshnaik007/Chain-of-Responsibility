package guiHelp_CompositeAndChain;

import java.util.ArrayList;
import java.util.List;

public class WindowContainer extends Component{

	List<Component> children = new ArrayList<Component>();
	
	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("Window Container");
	}
	
	public void add(Component c) {
		children.add(c);
		c.parent=this;
	}
	
}
