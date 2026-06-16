package pekan9_2511531019;

import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.border.EmptyBorder;

public class PetaTempatWisata_2511531019 extends JFrame {

	private static final long serialVersionUID = 1L;
	// private JPanel contentPane;
	private Graph_2511531019 graph_1019;
    private GraphPanel_2511531019 graphPanel_1019;

    private JComboBox<Node_2511531019> startBox_1019;
    private JComboBox<Node_2511531019> goalBox_1019;
    private JTextArea resultArea_1019;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetaTempatWisata_2511531019 frame = new PetaTempatWisata_2511531019();
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
	public PetaTempatWisata_2511531019() {
		/*
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		*/
		graph_1019 = createGraph_2511531019();

        setTitle("BFS dan DFS Peta Wisata");
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        graphPanel_1019 = new GraphPanel_2511531019(graph_1019);

        startBox_1019 = new JComboBox<>();
        goalBox_1019 = new JComboBox<>();

        for (Node_2511531019 node_1019 : graph_1019.getAdjacencyList_2511531019().keySet()) {
            startBox_1019.addItem(node_1019);
            goalBox_1019.addItem(node_1019);
        }

        JButton bfsBtn_1019 = new JButton("BFS");
        JButton dfsBtn_1019 = new JButton("DFS");
        JButton resetBtn_1019 = new JButton("Reset");

        resultArea_1019 = new JTextArea(10,30);
        
        JPanel topPanel_1019 = new JPanel();

        topPanel_1019.add(new JLabel("Mulai"));
        topPanel_1019.add(startBox_1019);

        topPanel_1019.add(new JLabel("Tujuan"));
        topPanel_1019.add(goalBox_1019);

        topPanel_1019.add(bfsBtn_1019);
        topPanel_1019.add(dfsBtn_1019);
        topPanel_1019.add(resetBtn_1019);

        add(topPanel_1019, BorderLayout.NORTH);
        add(graphPanel_1019, BorderLayout.CENTER);
        add(new JScrollPane(resultArea_1019), BorderLayout.SOUTH);

        bfsBtn_1019.addActionListener(e_1019 -> runBFS_2511531019());

        dfsBtn_1019.addActionListener(e_1019 -> runDFS_2511531019());

        resetBtn_1019.addActionListener(e_1019 -> resetGraph_2511531019());
        
        setVisible(true);
	}
	
	private void runBFS_2511531019() {

	    graph_1019.resetGraph_2511531019();

	    Node_2511531019 start_1019 = (Node_2511531019) startBox_1019.getSelectedItem();
	    Node_2511531019 goal_1019 = (Node_2511531019) goalBox_1019.getSelectedItem();

	    HasilPencarian_2511531019 result_1019 =
	    		AlgoritmaPencarian_2511531019.BFS_2511531019(graph_1019, start_1019, goal_1019);

	    graphPanel_1019.displayPath_2511531019(result_1019.path_1019);

	    showResult_2511531019("BFS", result_1019);
	}
	
	private void runDFS_2511531019() {

	    graph_1019.resetGraph_2511531019();

	    Node_2511531019 start_1019 = (Node_2511531019) startBox_1019.getSelectedItem();
	    Node_2511531019 goal_1019 = (Node_2511531019) goalBox_1019.getSelectedItem();

	    HasilPencarian_2511531019 result_1019 =
	    		AlgoritmaPencarian_2511531019.DFS_2511531019(graph_1019, start_1019, goal_1019);

	    graphPanel_1019.displayPath_2511531019(result_1019.path_1019);

	    showResult_2511531019("DFS", result_1019);
	}
	
	private void showResult_2511531019(String method_1019, HasilPencarian_2511531019 result_1019) {
		StringBuilder sb_1019 = new StringBuilder();
		sb_1019.append("Metode : ")
	      .append(method_1019)
	      .append("\n\n");

	    sb_1019.append("Urutan Node Dikunjungi:\n");

	    for (Node_2511531019 n_1019 : result_1019.visitedOrder_1019) {
	        sb_1019.append(n_1019.name_1019).append(" -> ");
	    }

	    sb_1019.append("\n\n");

	    sb_1019.append("Jalur Ditemukan:\n");

	    for (Node_2511531019 n_1019 : result_1019.path_1019) {
	        sb_1019.append(n_1019.name_1019).append(" -> ");
	    }

	    sb_1019.append("\n\n");
	    sb_1019.append("Jumlah Node Dieksplorasi : ")
	      .append(result_1019.visitedOrder_1019.size());

	    resultArea_1019.setText(sb_1019.toString());
	}
	
	private void resetGraph_2511531019() {
	    graph_1019.resetGraph_2511531019();
	    graphPanel_1019.displayPath_2511531019(new java.util.ArrayList<>());
	    resultArea_1019.setText("");
	}
	
	private Graph_2511531019 createGraph_2511531019() {
		Graph_2511531019 g_1019 = new Graph_2511531019();

	    Node_2511531019 airManis_1019 =
	            new Node_2511531019("Pantai Air Manis",100,300);
	    Node_2511531019 jamGadang_1019 =
	            new Node_2511531019("Jam Gadang",300,100);
	    Node_2511531019 harau_1019 =
	            new Node_2511531019("Lembah Harau",450,100);
	    Node_2511531019 maninjau_1019 =
	            new Node_2511531019("Danau Maninjau",350,250);
	    Node_2511531019 pagaruyung_1019 =
	            new Node_2511531019("Istana Pagaruyung",500,300);
	    Node_2511531019 pantaiPadang_1019 =
	            new Node_2511531019("Pantai Padang",150,150);
	    Node_2511531019 bukittinggi_1019 =
	            new Node_2511531019("Bukit Tinggi",300,250);
	    Node_2511531019 sianok_1019 =
	            new Node_2511531019("Ngarai Sianok",400,350);
	    Node_2511531019 pasumpahan_1019 =
	            new Node_2511531019("Pulau Pasumpahan",150,450);
	    Node_2511531019 museum_1019 =
	            new Node_2511531019("Museum Adityawarman",250,400);

	    Node_2511531019[] nodes_1019 = {
	            airManis_1019, jamGadang_1019, harau_1019, maninjau_1019,
	            pagaruyung_1019, pantaiPadang_1019, bukittinggi_1019,
	            sianok_1019, pasumpahan_1019, museum_1019
	    };
	    for(Node_2511531019 n_1019 : nodes_1019) {
	    	g_1019.addNode_2511531019(n_1019);
	    }

	    g_1019.addEdge_2511531019(airManis_1019, pantaiPadang_1019);
	    g_1019.addEdge_2511531019(airManis_1019, museum_1019);
	    g_1019.addEdge_2511531019(airManis_1019, pasumpahan_1019);

	    g_1019.addEdge_2511531019(pantaiPadang_1019, jamGadang_1019);
	    g_1019.addEdge_2511531019(pantaiPadang_1019, bukittinggi_1019);

	    g_1019.addEdge_2511531019(jamGadang_1019, bukittinggi_1019);
	    g_1019.addEdge_2511531019(jamGadang_1019, harau_1019);

	    g_1019.addEdge_2511531019(bukittinggi_1019, maninjau_1019);
	    g_1019.addEdge_2511531019(bukittinggi_1019, sianok_1019);

	    g_1019.addEdge_2511531019(maninjau_1019, harau_1019);
	    g_1019.addEdge_2511531019(maninjau_1019, pagaruyung_1019);

	    g_1019.addEdge_2511531019(harau_1019, pagaruyung_1019);
	    
	    g_1019.addEdge_2511531019(sianok_1019,pagaruyung_1019);
	    g_1019.addEdge_2511531019(sianok_1019,museum_1019);

	    g_1019.addEdge_2511531019(museum_1019,pasumpahan_1019);
	    return g_1019;
	}

	public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new PetaTempatWisata_2511531019();
        });
    }
	
}