package view;

import javax.swing.JFrame;

import view.components.IHMGridBag;

public class IHMWindow extends JFrame{
	private static int DIALOG_COUNT = 0;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int LARGEUR = 500;
	private static final int HAUTEUR = 700;

	public IHMWindow() {
		super("TP-IHM");
		setSize(LARGEUR,HAUTEUR);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(null);
		IHMGridBag gb = new IHMGridBag(this);
		add(gb);
		setVisible(true);
	}
	
	public void NewDialog() {

		new IHMDialog(this, DIALOG_COUNT++);
	}

}
