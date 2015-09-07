package nu.xdi.stockmanager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;

public class Stock {

	private JFrame frmStockManagementSystem;
	private JTextField txtWidgets;

	/**
	 * Launch the application.
	 */
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run () {
				try {
					Stock window = new Stock();
					window.frmStockManagementSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Stock () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize () {
		frmStockManagementSystem = new JFrame();
		frmStockManagementSystem.setTitle("Stock Management System");
		frmStockManagementSystem.setBounds(100, 100, 450, 300);
		frmStockManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmStockManagementSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 219, 240);
		panel.add(scrollPane);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Ireland") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					DefaultMutableTreeNode node_3;
					node_1 = new DefaultMutableTreeNode("Dublin - Naas Road");
						node_2 = new DefaultMutableTreeNode("WHIE1");
							node_3 = new DefaultMutableTreeNode("Rack B2");
								node_3.add(new DefaultMutableTreeNode("Bin 1"));
								node_3.add(new DefaultMutableTreeNode("Bin 2"));
							node_2.add(node_3);
							node_3 = new DefaultMutableTreeNode("Rack C2");
								node_3.add(new DefaultMutableTreeNode("Bin 1"));
							node_2.add(node_3);
						node_1.add(node_2);
						node_1.add(new DefaultMutableTreeNode("WHIE2"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Dublin - Liffey Valley");
						node_1.add(new DefaultMutableTreeNode("WHIE3"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Cork - Ballincollig");
						node_1.add(new DefaultMutableTreeNode("WHIE4"));
					add(node_1);
				}
			}
		));
		scrollPane.setViewportView(tree);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(239, 13, 46, 14);
		panel.add(lblSearch);
		
		txtWidgets = new JTextField();
		txtWidgets.setText("Widgets");
		txtWidgets.setBounds(283, 10, 141, 20);
		panel.add(txtWidgets);
		txtWidgets.setColumns(10);
		
		JButton btnNewButton = new JButton("Contacts...");
		btnNewButton.setBounds(239, 228, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnLabels = new JButton("Labels...");
		btnLabels.setBounds(335, 228, 89, 23);
		panel.add(btnLabels);
		
		JLabel lblCurrentSelection = new JLabel("Current Selection: WHIE1");
		lblCurrentSelection.setBounds(239, 111, 185, 14);
		panel.add(lblCurrentSelection);
		
		JLabel lblNewLabel = new JLabel("Gowan House");
		lblNewLabel.setBounds(239, 136, 185, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Carriglea Industrial Estate");
		lblNewLabel_1.setBounds(239, 164, 185, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Naas Road");
		lblNewLabel_2.setBounds(239, 150, 185, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblDublin = new JLabel("Dublin 12");
		lblDublin.setBounds(239, 178, 185, 14);
		panel.add(lblDublin);
		
		JLabel lblTodaysHours = new JLabel("Today's hours: 7am - 7pm");
		lblTodaysHours.setBounds(239, 208, 185, 14);
		panel.add(lblTodaysHours);
		
		JLabel lblStockToHand = new JLabel("Stock to hand:");
		lblStockToHand.setBounds(239, 38, 89, 14);
		panel.add(lblStockToHand);
		
		JLabel lblCurrentSelection_1 = new JLabel("Current selection:");
		lblCurrentSelection_1.setBounds(239, 52, 89, 14);
		panel.add(lblCurrentSelection_1);
		
		JLabel label = new JLabel("32,767");
		label.setBounds(339, 38, 46, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("42");
		label_1.setBounds(339, 52, 46, 14);
		panel.add(label_1);
		
		JButton btnNewButton_1 = new JButton("Details...");
		btnNewButton_1.setBounds(239, 72, 89, 23);
		panel.add(btnNewButton_1);
	}
}
