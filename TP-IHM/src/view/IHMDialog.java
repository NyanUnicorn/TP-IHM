package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IHMDialog extends JDialog{
	private int x = 0;
	private int y = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IHMDialog(JFrame j, int i) {
		super(j, "TP-IHM Dialog " + i);
		setSize(300,300);
		add(new JLabel("Ceci est une boite de dialogue"));
		setVisible(true);
		if(i*i >= 1080) {
			y -= 1080;
			x += 300;
		}
		setLocation(x, i*i + y);
	}

}
