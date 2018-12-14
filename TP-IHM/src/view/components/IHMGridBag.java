package view.components;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import view.IHMWindow;


public class IHMGridBag extends JPanel{

	private IHMWindow parent;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IHMGridBag(IHMWindow parent) {
		super();
		this.parent = parent;
		this.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.fill = GridBagConstraints.BOTH;
		gc.insets = new Insets(5,5,5,5);
		gc.ipady = gc.anchor = GridBagConstraints.CENTER;
		gc.weightx = 3;
		gc.weighty = 3;
		//fillBagText(gc);
		fillBagLabel(gc);
	}
	
	private void fillBagText(GridBagConstraints _gc) {
		_gc.gridx = 0; _gc.gridy = 0;
		/* Ajout de composants au panel en précisant le
		GridBagConstraints */
		add(new JTextArea("0-0"), _gc);
		_gc.gridx = 1; _gc.gridy = 0;
		add(new JTextArea("1-0"), _gc);
		_gc.gridx = 2; _gc.gridy = 0;
		add(new JTextArea("2-0"), _gc);
		_gc.gridx = 0; _gc.gridy = 1;
		add(new JTextArea("0-1"), _gc);
		_gc.gridx = 1; _gc.gridy = 1; _gc.gridwidth = 2;
		add(new JTextArea("1-1 x 2"), _gc);
		_gc.gridx = 0; _gc.gridy = 2; _gc.gridwidth = 3;
		add(new JTextArea("0-3 x3"), _gc);
	}
	
	private void fillBagLabel(GridBagConstraints _gc) {
		_gc.gridx = 0; _gc.gridy = 0;
		/* Ajout de composants au panel en précisant le
		GridBagConstraints */
		//ImageIcon image = new ImageIcon("D:\\Pictures\\Unicorns\\unicorn2.jpg");
		//add(new JLabel((Icon) image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)), _gc);
		add(new JLabel("image possible"), _gc);
		
		JButton btn0 = new JButton("nouvelle boite de dialogue");
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				parent.NewDialog();
			}
		});
		
		_gc.gridx = 1; _gc.gridy = 0;
		add(btn0, _gc);
		_gc.gridx = 2; _gc.gridy = 0;
		add(new JTextArea("2-0"), _gc);
		_gc.gridx = 0; _gc.gridy = 1;
		add(new JTextArea("0-1"), _gc);
		_gc.gridx = 1; _gc.gridy = 1; _gc.gridwidth = 2;
		add(new JTextArea("1-1 x 2"), _gc);
		_gc.gridx = 0; _gc.gridy = 2; _gc.gridwidth = 3;
		add(new JTextArea("0-3 x3"), _gc);
	}
	
	
	
	

}
