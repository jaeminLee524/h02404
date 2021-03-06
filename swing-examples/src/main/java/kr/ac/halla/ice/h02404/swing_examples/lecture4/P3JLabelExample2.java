package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class P3JLabelExample2 extends JFrame {

	public P3JLabelExample2() throws MalformedURLException {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		// JLabel prints out String or Image
		ImageIcon image = new ImageIcon(
				new ImageIcon(new URL("http://www.autoidlabs.org.uk/images/Auto-IDLabsLogo.png")).getImage()
						.getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		contentPane.add(new JLabel(image));

		setSize(300, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws MalformedURLException {
		P3JLabelExample2 frame = new P3JLabelExample2();
	}
}
