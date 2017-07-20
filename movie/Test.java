package movie;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import movie.Movie.CATEGORY;

public class Test {
	private static JFrame mainFrame;
	private static JLabel headerLabel;
	private static JLabel statusLabel;
	private static JPanel controlPanel;

	public static void main(String[] args) {

		Movie allied = Movie.createMovie("Allied", 2016, CATEGORY.ACTION);
		Movie superHeroes = Movie.createMovie("Super heroes", 2002, CATEGORY.THRILER);
		Movie gangsta = Movie.createMovie("Gangsta", 2003, CATEGORY.ACTION);
		Movie aliens = Movie.createMovie("Aliens", 2005, CATEGORY.COMEDY);
		Movie heroes = Movie.createMovie("Heroes", 2005, CATEGORY.COMEDY);

		prepareGUI();

		try {
			ArrayList<String> action = Movie.getMoviesFromCategory(CATEGORY.ACTION);
		} catch (NoMoviesException e) {
			System.out.println("No movies in category");
		}

	}

	private static void prepareGUI() {
		mainFrame = new JFrame("Movies");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new GridLayout(3, 1));

		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350, 100);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);

		showListDemo();

	}

	private static void showListDemo() {
		headerLabel.setText("Add movie");
		final DefaultListModel categoriesName = new DefaultListModel();
		JLabel namelabel = new JLabel("Movie title: ", JLabel.RIGHT);
		JLabel yearlabel = new JLabel("Year: ", JLabel.CENTER);
		JLabel categorylabel = new JLabel("Categories: ", JLabel.RIGHT);
		final JTextField nameText = new JTextField(6);
		final JTextField yearText = new JTextField(6);
		categoriesName.addElement(CATEGORY.ACTION);
		categoriesName.addElement(CATEGORY.COMEDY);
		categoriesName.addElement(CATEGORY.THRILER);
		categoriesName.addElement(CATEGORY.DOCUMENTARY);

		final JList categoryList = new JList(categoriesName);
		categoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		categoryList.setSelectedIndex(0);
		categoryList.setVisibleRowCount(3);

		JScrollPane categoryListPanel = new JScrollPane(categoryList);
		final DefaultListModel vegName = new DefaultListModel();

		JButton showButton = new JButton("Add");
		JButton showsButton = new JButton("Show");

		showButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = null;
	
				Movie movie = Movie.createMovie(nameText.getText(), Integer.parseInt(yearText.getText()),
						(CATEGORY) categoryList.getSelectedValue());

				statusLabel.setText("Added");

			}
		});
		
		showsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				
				   if (Movie.getMoviesFromCategory(CATEGORY.DOCUMENTARY)!=null) {
					   System.out.println(Movie.getMoviesFromCategory(CATEGORY.DOCUMENTARY));
				   } else {
					throw new NoMoviesException("No movies");
				   }
					
					
				} catch (NoMoviesException e1) {
					System.out.println(e1.getMessage());
				
				}
				
			}
		});
		
		controlPanel.add(namelabel);
		controlPanel.add(nameText);
		controlPanel.add(yearlabel);
		controlPanel.add(yearText);
		controlPanel.add(categorylabel);
		controlPanel.add(categoryListPanel);
		controlPanel.add(showButton);
		controlPanel.add(showsButton);

		mainFrame.setVisible(true);
	}

}
