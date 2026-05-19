package pekan7_2511531019;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511531019 extends JFrame {

	private static final long serialVersionUID = 1L;
	// private JPanel contentPane;
	
	private int[] array_1019;
	private JLabel[] labelArray_1019;
	private JButton stepButton_1019, resetButton_1019, setButton_1019;
	private JTextField inputField_1019;
	private JPanel panelArray_1019;
	private JTextArea stepArea_1019;
	
	private int i_1019 = 1, j_1019;
	private boolean sorting_1019 = false;
	private int stepCount_1019 = 1;
	

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertionSortGUI_2511531019 frame = new InsertionSortGUI_2511531019();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
	//}

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511531019() {
		/*
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		*/
		setTitle("Inssertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel Layout
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField_1019 = new JTextField(30);
		setButton_1019 = new JButton("Set Array");
		inputPanel.add(inputField_1019);
		inputPanel.add(setButton_1019);
		
		// Panel Array visual
		panelArray_1019 = new JPanel();
		panelArray_1019.setLayout(new FlowLayout());
		
		// Panel Kontrol
		JPanel controlPanel = new JPanel();
		stepButton_1019 = new JButton("Langkah Selanjutnya");
		resetButton_1019 = new JButton("Reset");
		stepButton_1019.setEnabled(false);
		controlPanel.add(stepButton_1019);
		controlPanel.add(resetButton_1019);
		
		// Area Teks untuk log langkah langkah
		stepArea_1019 = new JTextArea(8, 60);
		stepArea_1019.setEditable(false);
		stepArea_1019.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea_1019);
		
		// Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_1019, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// Event Set Array
		setButton_1019.addActionListener(e -> setArrayfromInput());
		
		// Event Langkah Selanjutnya
		stepButton_1019.addActionListener(e -> performStep());
		
		// Event Reset
		resetButton_1019.addActionListener(e -> reset());
		
	}
	public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> {
	        InsertionSortGUI_2511531019 gui = new InsertionSortGUI_2511531019();
	        gui.setVisible(true);
	    });
	}
	private void setArrayfromInput() {
		String text = inputField_1019.getText().trim();
		if (text.isEmpty()) return;
		String[] parts = text.split(",");
		array_1019 = new int [parts.length];
		try {
			for (int k = 0; k < parts.length; k++) {
				array_1019[k] = Integer.parseInt(parts[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i_1019 = 1;
		stepCount_1019 = 1;
		sorting_1019 = true;
		stepButton_1019.setEnabled(true);
		stepArea_1019.setText("");
		panelArray_1019.removeAll();
		labelArray_1019 = new JLabel[array_1019.length];
		for (int k = 0; k < array_1019.length; k++) {
			labelArray_1019[k] = new JLabel(String.valueOf(array_1019[k]));
			labelArray_1019[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_1019[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1019[k].setPreferredSize(new Dimension(50, 50));
			labelArray_1019[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1019.add(labelArray_1019[k]);
		}
		panelArray_1019.revalidate();
		panelArray_1019.repaint();
		
	}
	private void performStep() {
	    if (i_1019 < array_1019.length && sorting_1019) {
	        int key_1019 = array_1019[i_1019];
	        int j = i_1019 - 1;
	        
	        StringBuilder stepLog_1019 = new StringBuilder();
	        stepLog_1019.append("Langkah ").append(stepCount_1019)
	               .append(": Memasukkan ").append(key_1019).append("\n");
	        
	        while (j >= 0 && array_1019[j] > key_1019) {
	            array_1019[j + 1] = array_1019[j];
	            j--;
	        }
	        array_1019[j + 1] = key_1019;
	        
	        updateLabels();
	        stepLog_1019.append("Hasil: ").append(arrayToString(array_1019)).append("\n\n");
	        stepArea_1019.append(stepLog_1019.toString());
	        
	        i_1019++;
	        stepCount_1019++;
	        
	        if (i_1019 == array_1019.length) {
	            sorting_1019 = false;
	            stepButton_1019.setEnabled(false);
	            JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	    }
	}
	private void updateLabels() {
	    for (int k = 0; k < array_1019.length; k++) {
	        labelArray_1019[k].setText(String.valueOf(array_1019[k]));
	    }
	}

	private void reset() {
	    inputField_1019.setText("");
	    panelArray_1019.removeAll();
	    panelArray_1019.revalidate();
	    panelArray_1019.repaint();
	    stepArea_1019.setText("");
	    stepButton_1019.setEnabled(false);
	    sorting_1019 = false;
	    i_1019 = 1;
	    stepCount_1019 = 1;
	}

	private String arrayToString(int[] arr) {
	    StringBuilder sb = new StringBuilder();
	    for (int k = 0; k < arr.length; k++) {
	        sb.append(arr[k]);
	        if (k < arr.length - 1) sb.append(", ");
	    }
	    return sb.toString();
	}
}