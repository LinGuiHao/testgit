package ui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class UserUI extends JPanel{
	private JPanel optionPanel;
	private JPanel directoryPanel;
	private JPanel photoPanel;
	
	public UserUI() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gBC = new GridBagConstraints();
		gBC.gridx = 0;  //在哪行
		gBC.gridy = 0;	//在哪列
		gBC.gridwidth=2;    //跨越多少列
	    gBC.gridheight=1;    //跨越多少列
	    gBC.weightx=0;    //可以跨越多多少行列
	    gBC.weighty=0;    
	    gBC.anchor=GridBagConstraints.NORTH; //对齐方式   
	    gBC.fill=GridBagConstraints.BOTH;  //充满这个单元  
	    gBC.insets=new Insets(0,0,5,0);    
	    gBC.ipadx=1155;    //设置内部大小
	    gBC.ipady=15; 		
	    JPanel jPanel = new JPanel();
	    this.add(jPanel,gBC);
	    
	    gBC.gridx = 0;
		gBC.gridy = 1;
		gBC.gridwidth=1;    
	    gBC.gridheight=1;    
	    gBC.weightx=0;    
	    gBC.weighty=0;    
	    gBC.anchor=GridBagConstraints.SOUTHEAST;    
	    gBC.fill=GridBagConstraints.BOTH;    
	    gBC.insets=new Insets(0,0,15,5);    
	    gBC.ipadx=350;    
	    gBC.ipady=590; 
	    jPanel = new JPanel();
	    jPanel.setBorder(new LineBorder(Color.white,2));
	    this.add(jPanel,gBC);    
	   
	    
	    gBC.gridx = 1;
		gBC.gridy = 1;
		gBC.gridwidth=1;    
	    gBC.gridheight=1;    
	    gBC.weightx=0;    
	    gBC.weighty=0;    
	    gBC.anchor=GridBagConstraints.CENTER;    
	    gBC.fill=GridBagConstraints.BOTH;    
	    gBC.insets=new Insets(0,0,15,0);    
	    gBC.ipadx=800;    
	    gBC.ipady=590; 
	    jPanel = new JPanel();
	    jPanel.setBorder(new LineBorder(Color.white,2));
	    this.add(jPanel,gBC);
	}


}
