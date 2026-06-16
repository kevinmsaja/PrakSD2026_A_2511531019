package pekan9_2511531019;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class GraphPanel_2511531019 extends JPanel {

	private static final long serialVersionUID = 1L;

	private Graph_2511531019 graph_1019;
    private List<Node_2511531019> path_1019 = new ArrayList<>();
    
	/**
	 * Create the panel.
	 */
	public GraphPanel_2511531019(Graph_2511531019 graph_1019) {
		this.graph_1019 = graph_1019;
        setBackground(Color.WHITE);
	}
	
	public void displayPath_2511531019(List<Node_2511531019> path_1019) {
        this.path_1019 = path_1019;
        repaint();
    }

	@Override
    protected void paintComponent(Graphics g_1019) {
    	super.paintComponent(g_1019);
        Graphics2D g2_1019 = (Graphics2D) g_1019;

        // gambar edge
        for (Node_2511531019 node_1019 : graph_1019.getAdjacencyList_2511531019().keySet()) {

            for (Node_2511531019 neighbor_1019 :
                    graph_1019.getAdjacencyList_2511531019().get(node_1019)) {

                g2_1019.drawLine(node_1019.x_1019,
                		node_1019.y_1019, neighbor_1019.x_1019, neighbor_1019.y_1019);
            }
        }
        
        // gambar node
        for (Node_2511531019 node_1019 : graph_1019.getAdjacencyList_2511531019().keySet()) {
            if (node_1019.visited_1019) {
                g2_1019.setColor(Color.ORANGE);
            } else {
                g2_1019.setColor(Color.CYAN);
            }
            g2_1019.fillOval(node_1019.x_1019 - 15, node_1019.y_1019 - 15, 30, 30);
            g2_1019.setColor(Color.BLACK);
            g2_1019.drawOval(node_1019.x_1019 - 15, node_1019.y_1019 - 15, 30, 30);
            g2_1019.drawString(node_1019.name_1019,
            		node_1019.x_1019 - 20, node_1019.y_1019 - 20);
        }
        
        // gambar jalur
        g2_1019.setStroke(new BasicStroke(4));
        g2_1019.setColor(Color.RED);
        for (int i_1019 = 0; i_1019 < path_1019.size() - 1; i_1019++) {
            Node_2511531019 a_1019 = path_1019.get(i_1019);
            Node_2511531019 b_1019 = path_1019.get(i_1019 + 1);
            g2_1019.drawLine(a_1019.x_1019, a_1019.y_1019, b_1019.x_1019, b_1019.y_1019);
        }
    }
}