package panel;

import javax.swing.JPanel;
import javax.swing.JTree;

public class DirectoryPanel extends JPanel{
	
	private JTree directoryTree;
	
	public DirectoryPanel(JTree directoryTree) {
		this.directoryTree = directoryTree;
		this.add(directoryTree);
	}
}
