package pekan8_2511531019;

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
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511531019 extends JFrame {

	private static final long serialVersionUID = 1L;
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
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSortGUI_2511531019 frame = new BubbleSortGUI_2511531019();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public BubbleSortGUI_2511531019() {
		setTitle("Bubble Sort Langkah per Langkah");
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

	private void reset() {
		// TODO Auto-generated method stub
		inputField_1019.setText("");
	    panelArray_1019.removeAll();
	    panelArray_1019.revalidate();
	    panelArray_1019.repaint();
	    stepArea_1019.setText("");
	    stepButton_1019.setEnabled(false);
	    sorting_1019 = false;
	    i_1019 = 0;
	    j_1019 = 0;
	    stepCount_1019 = 1;
	}

	private void performStep() {
		// TODO Auto-generated method stub
		if (!sorting_1019 || i_1019 >= array_1019.length - 1) {
	        sorting_1019 = false;
	        stepButton_1019.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        return;
	    }

	    resetHighlights();

	    StringBuilder stepLog_1019 = new StringBuilder();

	    labelArray_1019[i_1019].setBackground(Color.CYAN);
	    labelArray_1019[i_1019 + 1].setBackground(Color.CYAN);

	    if (array_1019[i_1019] > array_1019[i_1019 + 1]) {
	        // Swap
	        int temp_1019 = array_1019[i_1019];
	        array_1019[i_1019] = array_1019[i_1019 + 1];
	        array_1019[i_1019 + 1] = temp_1019;

	        labelArray_1019[i_1019].setBackground(Color.RED);
	        labelArray_1019[i_1019 + 1].setBackground(Color.RED);

	        stepLog_1019.append("Langkah ").append(stepCount_1019)
	               .append(": Menukar elemen ke-")
	               .append(i_1019).append(" (")
	               .append(array_1019[i_1019 + 1]).append(") dengan ke-")
	               .append(i_1019 + 1).append(" (")
	               .append(array_1019[i_1019]).append(")\n");
	    } else {
	        stepLog_1019.append("Langkah ").append(stepCount_1019)
	               .append(": Tidak ada pertukaran antara ke-")
	               .append(i_1019).append(" dan ke-")
	               .append(i_1019 + 1).append("\n");
	    }

	    stepLog_1019.append("Hasil: ")
	           .append(arrayToString(array_1019))
	           .append("\n\n");

	    stepArea_1019.append(stepLog_1019.toString());

	    updateLabels();

	    j_1019++;

	    if (j_1019 >= array_1019.length - i_1019 - 1) {
	        j_1019 = 0;
	        i_1019++;
	    }

	    stepCount_1019++;

	    if (i_1019 >= array_1019.length - 1) {
	        sorting_1019 = false;
	        stepButton_1019.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	    }

	}

	private void resetHighlights() {
		// TODO Auto-generated method stub
		for (JLabel label_1019 : labelArray_1019) {
	        label_1019.setBackground(Color.WHITE);
	    }
	}

	private String arrayToString(int[] arr_1019) {
		// TODO Auto-generated method stub
		StringBuilder sb_1019 = new StringBuilder();
	    for (int k_1019 = 0; k_1019 < arr_1019.length; k_1019++) {
	        sb_1019.append(arr_1019[k_1019]);
	        if (k_1019 < arr_1019.length - 1) sb_1019.append(", ");
	    }
	    return sb_1019.toString();
	}

	private void updateLabels() {
		// TODO Auto-generated method stub
		for (int k_1019 = 0; k_1019 < array_1019.length; k_1019++) {
	        labelArray_1019[k_1019].setText(String.valueOf(array_1019[k_1019]));
	    }

	}

	private void setArrayfromInput() {
		// TODO Auto-generated method stub
		String text_1019 = inputField_1019.getText().trim();
		if (text_1019.isEmpty()) return;
		String[] parts_1019 = text_1019.split(",");
		array_1019 = new int [parts_1019.length];
		try {
			for (int k_1019 = 0; k_1019 < parts_1019.length; k_1019++) {
				array_1019[k_1019] = Integer.parseInt(parts_1019[k_1019].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i_1019 = 0;
		j_1019 = 0;
		stepCount_1019 = 1;
		sorting_1019 = true;
		stepButton_1019.setEnabled(true);
		stepArea_1019.setText("");
		panelArray_1019.removeAll();
		labelArray_1019 = new JLabel[array_1019.length];
		for (int k_1019 = 0; k_1019 < array_1019.length; k_1019++) {
			labelArray_1019[k_1019] = new JLabel(String.valueOf(array_1019[k_1019]));
			labelArray_1019[k_1019].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_1019[k_1019].setOpaque(true);
			labelArray_1019[k_1019].setBackground(Color.WHITE);
			labelArray_1019[k_1019].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1019[k_1019].setPreferredSize(new Dimension(50, 50));
			labelArray_1019[k_1019].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1019.add(labelArray_1019[k_1019]);
		}
		panelArray_1019.revalidate();
		panelArray_1019.repaint();
	}

}
