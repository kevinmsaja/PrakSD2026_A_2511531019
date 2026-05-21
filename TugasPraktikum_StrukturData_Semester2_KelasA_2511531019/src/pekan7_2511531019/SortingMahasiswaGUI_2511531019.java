package pekan7_2511531019;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class SortingMahasiswaGUI_2511531019 extends JFrame {

	private static final long serialVersionUID = 1L;
	// private JPanel contentPane;
	//private String[] array_1019;
	//private JLabel[] labelArray_1019;
	private JTextField txtNama_1019, txtNim_1019, txtProdi_1019;
	private JButton btnTambah_1019, btnHapus_1019, btnSort_1019;
	private JComboBox<String> cmbSorting_1019;
	//private JPanel panelArray_1019;
	private JTable table_1019;
	private JTextArea txtProses_1019;
	
	//private boolean sorting_1019 = false;
	private DefaultTableModel model_1019;
	
	private ArrayList<Mahasiswa_2511531019> daftarMahasiswa_1019 = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingMahasiswaGUI_2511531019 frame = new SortingMahasiswaGUI_2511531019();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		*/
		SwingUtilities.invokeLater(() -> {
	        SortingMahasiswaGUI_2511531019 gui_1019 = new SortingMahasiswaGUI_2511531019();
	        gui_1019.setVisible(true);
	    });
	}

	/**
	 * Create the frame.
	 */
	public SortingMahasiswaGUI_2511531019() {
		setTitle("Sorting Mahasiswa Langkah per Langkah");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		initKomponen_2511531019();
		
		/*
		// Panel Layout
		JPanel inputPanel_1019 = new JPanel(new FlowLayout());
		inputField_1019 = new JTextField(30);
		setButton_1019 = new JButton("Set Array");
		inputPanel_1019.add(inputField_1019);
		inputPanel_1019.add(setButton_1019);
		
		// Panel Array visual
		panelArray_1019 = new JPanel();
		panelArray_1019.setLayout(new FlowLayout());
		
		// Panel Kontrol
		JPanel controlPanel_1019 = new JPanel();
		stepButton_1019 = new JButton("Langkah Selanjutnya");
		resetButton_1019 = new JButton("Reset");
		stepButton_1019.setEnabled(false);
		controlPanel_1019.add(stepButton_1019);
		controlPanel_1019.add(resetButton_1019);
		
		// Area Teks untuk log langkah langkah
		stepArea_1019 = new JTextArea(8, 60);
		stepArea_1019.setEditable(false);
		stepArea_1019.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_1019 = new JScrollPane(stepArea_1019);
		
		// Tambahkan panel ke frame
		add(inputPanel_1019, BorderLayout.NORTH);
		add(panelArray_1019, BorderLayout.CENTER);
		add(controlPanel_1019, BorderLayout.SOUTH);
		add(scrollPane_1019, BorderLayout.EAST);
		
		// Event Set Array
		setButton_1019.addActionListener(e_1019 -> setArrayfromInput_2511531019());
		
		// Event Langkah Selanjutnya
		stepButton_1019.addActionListener(e_1019 -> performStep_2511531019());
		
		// Event Reset
		resetButton_1019.addActionListener(e_1019 -> reset_2511531019());
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		*/
	}

	private void initKomponen_2511531019() {
		// TODO Auto-generated method stub
		// PANEL INPUT
        JPanel panelInput_1019 = new JPanel(new GridLayout(4, 2, 10, 10));
        panelInput_1019.add(new JLabel("Nama Mahasiswa"));
        txtNama_1019 = new JTextField();
        panelInput_1019.add(txtNama_1019);

        panelInput_1019.add(new JLabel("NIM"));
        txtNim_1019 = new JTextField();
        panelInput_1019.add(txtNim_1019);

        panelInput_1019.add(new JLabel("Program Studi"));
        txtProdi_1019 = new JTextField();
        panelInput_1019.add(txtProdi_1019);

        panelInput_1019.add(new JLabel("Algoritma Sorting"));
        cmbSorting_1019 = new JComboBox<>();
        cmbSorting_1019.addItem("Insertion Sort");
        cmbSorting_1019.addItem("Selection Sort");
        cmbSorting_1019.addItem("Bubble Sort");
        panelInput_1019.add(cmbSorting_1019);

        // BUTTON
        JPanel panelButton_1019 = new JPanel();
        btnTambah_1019 = new JButton("Tambah Data");
        btnHapus_1019 = new JButton("Hapus Data");
        btnSort_1019 = new JButton("Mulai Sorting");
        panelButton_1019.add(btnTambah_1019);
        panelButton_1019.add(btnHapus_1019);
        panelButton_1019.add(btnSort_1019);

        // TABLE
        model_1019 = new DefaultTableModel();
        model_1019.addColumn("Nama");
        model_1019.addColumn("NIM");
        model_1019.addColumn("Prodi");
        table_1019 = new JTable(model_1019);
        JScrollPane scrollTable_1019 = new JScrollPane(table_1019);

        // TEXT AREA PROSES
        txtProses_1019 = new JTextArea();
        txtProses_1019.setEditable(false);
        JScrollPane scrollProses_1019 = new JScrollPane(txtProses_1019);

        // LAYOUT
        setLayout(new BorderLayout());
        add(panelInput_1019, BorderLayout.NORTH);
        add(scrollTable_1019, BorderLayout.CENTER);
        add(panelButton_1019, BorderLayout.SOUTH);
        add(scrollProses_1019, BorderLayout.EAST);
        scrollProses_1019.setPreferredSize(new Dimension(300, 0));

        // EVENT BUTTON
        btnTambah_1019.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_1019) {
                tambahData_2511531019();
            }
        });
        btnHapus_1019.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_1019) {
                hapusData_2511531019();
            }
        });
        btnSort_1019.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e_1019) {
                prosesSorting_2511531019();
            }
        });
	}
	
	private void tambahData_2511531019() {
		// TODO Auto-generated method stub
		String nama_1019 = txtNama_1019.getText();
        String nim_1019 = txtNim_1019.getText();
        String prodi_1019 = txtProdi_1019.getText();
        if (nama_1019.isEmpty() || nim_1019.isEmpty() || prodi_1019.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!");
            return;
        }
        Mahasiswa_2511531019 mhs_1019 = new Mahasiswa_2511531019(nama_1019, nim_1019, prodi_1019);
        daftarMahasiswa_1019.add(mhs_1019);
        model_1019.addRow(new Object[]{
                mhs_1019.getNama_2511531019(),
                mhs_1019.getNim_2511531019(),
                mhs_1019.getProdi_2511531019()
        });
        txtNama_1019.setText("");
        txtNim_1019.setText("");
        txtProdi_1019.setText("");
	}
	
	private void hapusData_2511531019() {
		int row_1019 = table_1019.getSelectedRow();
        if (row_1019 >= 0) {
            daftarMahasiswa_1019.remove(row_1019);
            model_1019.removeRow(row_1019);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
        }
	}
	
	private void prosesSorting_2511531019() {
		txtProses_1019.setText("");
        String pilihan_1019 = cmbSorting_1019.getSelectedItem().toString();
        if (pilihan_1019.equals("Insertion Sort")) {
            insertionSort_2511531019();
        } else if (pilihan_1019.equals("Selection Sort")) {
            selectionSort_2511531019();
        } else {
            bubbleSort_2511531019();
        }
        tampilkanTable_2511531019();
	}
	
	private void tampilkanTable_2511531019() {
		model_1019.setRowCount(0);
        for (Mahasiswa_2511531019 mhs_1019 : daftarMahasiswa_1019) {
            model_1019.addRow(new Object[]{
                    mhs_1019.getNama_2511531019(),
                    mhs_1019.getNim_2511531019(),
                    mhs_1019.getProdi_2511531019()
            });
        }
	}
	
	private void insertionSort_2511531019() {
		txtProses_1019.append("=== INSERTION SORT ===\n\n");
        for (int i_1019 = 1; i_1019 < daftarMahasiswa_1019.size(); i_1019++) {
            Mahasiswa_2511531019 key_1019 = daftarMahasiswa_1019.get(i_1019);
            int j_1019 = i_1019 - 1;
            while (j_1019 >= 0 && daftarMahasiswa_1019.get(j_1019).getNama_2511531019().compareToIgnoreCase(key_1019.getNama_2511531019()) > 0) {
                daftarMahasiswa_1019.set(j_1019 + 1, daftarMahasiswa_1019.get(j_1019));
                j_1019--;
            }
            daftarMahasiswa_1019.set(j_1019 + 1, key_1019);
            tampilkanLangkah_2511531019();
        }
	}
	
	private void selectionSort_2511531019() {
		txtProses_1019.append("=== SELECTION SORT ===\n\n");
        for (int i_1019 = 0; i_1019 < daftarMahasiswa_1019.size() - 1; i_1019++) {
            int minIndex_1019 = i_1019;
            for (int j_1019 = i_1019 + 1; j_1019 < daftarMahasiswa_1019.size(); j_1019++) {
                if (daftarMahasiswa_1019.get(j_1019).getNama_2511531019().compareToIgnoreCase(daftarMahasiswa_1019.get(minIndex_1019).getNama_2511531019()) < 0) {

                    minIndex_1019 = j_1019;
                }
            }
            Mahasiswa_2511531019 temp_1019 = daftarMahasiswa_1019.get(i_1019);
            daftarMahasiswa_1019.set(i_1019, daftarMahasiswa_1019.get(minIndex_1019));
            daftarMahasiswa_1019.set(minIndex_1019, temp_1019);
            tampilkanLangkah_2511531019();
        }
	}
	
	private void bubbleSort_2511531019() {
		txtProses_1019.append("=== BUBBLE SORT ===\n\n");
        for (int i_1019 = 0; i_1019 < daftarMahasiswa_1019.size() - 1; i_1019++) {
            for (int j_1019 = 0; j_1019 < daftarMahasiswa_1019.size() - i_1019 - 1; j_1019++) {
                if (daftarMahasiswa_1019.get(j_1019).getNama_2511531019().compareToIgnoreCase(daftarMahasiswa_1019.get(j_1019 + 1).getNama_2511531019()) > 0) {
                    Mahasiswa_2511531019 temp_1019 = daftarMahasiswa_1019.get(j_1019);
                    daftarMahasiswa_1019.set(j_1019, daftarMahasiswa_1019.get(j_1019 + 1));
                    daftarMahasiswa_1019.set(j_1019 + 1, temp_1019);
                }
            }
            tampilkanLangkah_2511531019();
        }
	}
	
	private void tampilkanLangkah_2511531019() {
		for (Mahasiswa_2511531019 mhs_1019 : daftarMahasiswa_1019) {
            txtProses_1019.append(mhs_1019.getNama_2511531019() + "\n");
        }
        txtProses_1019.append("------------------------\n");
	}
	
	//private void reset_2511531019() {
		// TODO Auto-generated method stub
		/*
		inputField_1019.setText("");
	    panelArray_1019.removeAll();
	    panelArray_1019.revalidate();
	    panelArray_1019.repaint();
	    stepArea_1019.setText("");
	    stepButton_1019.setEnabled(false);
	    sorting_1019 = false;
	    
	    i_1019 = 1;
	    stepCount_1019 = 1;
	    */
	//}
}