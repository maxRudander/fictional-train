


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/**
 * 
 * @author Matthias
 * @version 2
 */
public class MemoryMain extends JPanel implements ActionListener {
	private URL url = MemoryMain.class.getResource("/smiley.jpg");
	private URL url2 = MemoryMain.class.getResource("/amazed.jpg");
	private URL url3 = MemoryMain.class.getResource("/datass.jpg");
	private URL url4 = MemoryMain.class.getResource("/lol.jpg");
	private URL url5 = MemoryMain.class.getResource("/megusta.jpg");
	private URL url6 = MemoryMain.class.getResource("/mog.png");
	private URL url7 = MemoryMain.class.getResource("/satisfied.jpg");
	private ImageIcon iconStart = new ImageIcon(url);
	private ImageIcon icon1 = new ImageIcon(url2);
	private ImageIcon icon2 = new ImageIcon(url3);
	private ImageIcon icon3 = new ImageIcon(url4);
	private ImageIcon icon4 = new ImageIcon(url5);
	private ImageIcon icon5 = new ImageIcon(url6);
	private ImageIcon icon6 = new ImageIcon(url7);
	private JPanel pnlGame = new JPanel();
	private JPanel pnlStat = new JPanel();
	private JButton btn1 = new JButton();
	private JButton btn2 = new JButton();
	private JButton btn3 = new JButton();
	private JButton btn4 = new JButton();
	private JButton btn5 = new JButton();
	private JButton btn6 = new JButton();
	private JButton btn7 = new JButton();
	private JButton btn8 = new JButton();
	private JButton btn9 = new JButton();
	private JButton btn10 = new JButton();
	private JButton btn11 = new JButton();
	private JButton btn12 = new JButton();
	private JButton btnTemp = new JButton();
	private JButton btnTemp2 = new JButton();
	private ImageIcon[] iconArray = new ImageIcon[12];
	private String[] stringArray = new String[12];
	private JButton btnNew = new JButton("Nytt spel");
	private JButton btnExit = new JButton("Avsluta");
	private int count = 0;
	private int points = 0;
	private JLabel counter = new JLabel("" + points);
	private String temp1 = "", temp2 = "", temp3 = "", temp4 = "", temp5 = "", temp6 = "", temp7 = "", temp8 = "",
			temp9 = "", temp10 = "", temp11 = "", temp12 = "";
	 

	public MemoryMain() {
		setPreferredSize(new Dimension(800, 600));
		setLayout(new BorderLayout());
		pnlGame.setBackground(Color.CYAN);
		pnlGame.setLayout(new GridLayout(3, 4));
		
		pnlGame.setPreferredSize(new Dimension (600,600));
		pnlStat.setPreferredSize(new Dimension (200,600));
		
		btn1.setIcon(iconStart);
		btn2.setIcon(iconStart);
		btn3.setIcon(iconStart);
		btn4.setIcon(iconStart);
		btn5.setIcon(iconStart);
		btn6.setIcon(iconStart);
		btn7.setIcon(iconStart);
		btn8.setIcon(iconStart);
		btn9.setIcon(iconStart);
		btn10.setIcon(iconStart);
		btn11.setIcon(iconStart);
		btn12.setIcon(iconStart);

		btn1.setPreferredSize(new Dimension(80, 80));
		btn2.setPreferredSize(new Dimension(80, 80));
		btn3.setPreferredSize(new Dimension(80, 80));
		btn4.setPreferredSize(new Dimension(80, 80));
		btn5.setPreferredSize(new Dimension(80, 80));
		btn6.setPreferredSize(new Dimension(80, 80));
		btn7.setPreferredSize(new Dimension(80, 80));
		btn8.setPreferredSize(new Dimension(80, 80));
		btn9.setPreferredSize(new Dimension(80, 80));
		btn10.setPreferredSize(new Dimension(80, 80));
		btn11.setPreferredSize(new Dimension(80, 80));
		btn12.setPreferredSize(new Dimension(80, 80));

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btnNew.addActionListener(this);
		btnExit.addActionListener(this);

		pnlGame.add(btn1);
		pnlGame.add(btn2);
		pnlGame.add(btn3);
		pnlGame.add(btn4);
		pnlGame.add(btn5);
		pnlGame.add(btn6);
		pnlGame.add(btn7);
		pnlGame.add(btn8);
		pnlGame.add(btn9);
		pnlGame.add(btn10);
		pnlGame.add(btn11);
		pnlGame.add(btn12);
		pnlStat.add(btnNew);
		pnlStat.add(btnExit);
		pnlStat.add(counter);
		add(pnlGame, BorderLayout.WEST);
		add(pnlStat,BorderLayout.EAST);
		this.iconArray = randomArray();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			Image temp = iconArray[0].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn1.setIcon(icon);
			temp1 = stringArray[0];
			points++;
			counter.setText("" + points);
			count++;

			if (count >= 3) {

				if (temp1 == temp2) {
					btn1.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp1 == temp3) {
					btn1.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp1 == temp4) {
					btn1.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp1 == temp5) {
					btn1.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp1 == temp6) {
					btn1.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp1 == temp7) {
					btn1.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp1 == temp8) {
					btn1.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp1 == temp9) {
					btn1.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp1 == temp10) {
					btn1.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp1 == temp11) {
					btn1.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp1 == temp12) {
					btn1.setVisible(false);
					btn12.setVisible(false);
				}

				if (temp1 != temp2 && temp1 != temp3 && temp1 != temp4 && temp1 != temp9 && temp1 != temp5
						&& temp1 != temp10 && temp1 != temp6 && temp1 != temp11 && temp1 != temp7 && temp1 != temp12
						&& temp1 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn2) {
			Image temp = iconArray[1].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn2.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp2 = stringArray[1];
			if (count >= 3) {
				if (temp2 == temp1) {
					btn1.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp2 == temp3) {
					btn2.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp2 == temp4) {
					btn2.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp2 == temp5) {
					btn2.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp2 == temp6) {
					btn2.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp2 == temp7) {
					btn2.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp2 == temp8) {
					btn2.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp2 == temp9) {
					btn2.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp2 == temp10) {
					btn2.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp2 == temp11) {
					btn2.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp2 == temp12) {
					btn2.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp2 != temp1 && temp2 != temp3 && temp2 != temp4 && temp2 != temp9 && temp2 != temp5
						&& temp2 != temp10 && temp2 != temp6 && temp2 != temp11 && temp2 != temp7 && temp2 != temp12
						&& temp2 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}

		}
		if (e.getSource() == btn3) {
			Image temp = iconArray[2].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn3.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp3 = stringArray[2];
			if (count >= 3) {
				if (temp3 == temp2) {
					btn3.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp3 == temp1) {
					btn3.setVisible(false);
					btn1.setVisible(false);
				}
				if (temp3 == temp4) {
					btn3.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp3 == temp5) {
					btn3.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp3 == temp6) {
					btn3.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp3 == temp7) {
					btn3.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp3 == temp8) {
					btn3.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp3 == temp9) {
					btn3.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp3 == temp10) {
					btn3.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp3 == temp11) {
					btn3.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp3 == temp12) {
					btn3.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp3 != temp1 && temp3 != temp2 && temp3 != temp4 && temp3 != temp9 && temp3 != temp5
						&& temp3 != temp10 && temp3 != temp6 && temp3 != temp11 && temp3 != temp7 && temp3 != temp12
						&& temp3 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}

		}
		if (e.getSource() == btn4) {
			Image temp = iconArray[3].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn4.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp4 = stringArray[3];
			if (count >= 3) {
				if (temp4 == temp2) {
					btn4.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp4 == temp1) {
					btn4.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp4 == temp3) {
					btn4.setVisible(false);
					btn1.setVisible(false);
				}
				if (temp4 == temp5) {
					btn4.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp4 == temp6) {
					btn4.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp4 == temp7) {
					btn4.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp4 == temp8) {
					btn4.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp4 == temp9) {
					btn4.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp4 == temp10) {
					btn4.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp4 == temp11) {
					btn4.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp4 == temp12) {
					btn4.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp4 != temp1 && temp4 != temp3 && temp4 != temp2 && temp4 != temp9 && temp4 != temp5
						&& temp4 != temp10 && temp4 != temp6 && temp4 != temp11 && temp4 != temp7 && temp4 != temp12
						&& temp4 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}

		}
		if (e.getSource() == btn5) {
			Image temp = iconArray[4].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn5.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp5 = stringArray[4];
			if (count >= 3) {
				if (temp5 == temp2) {

					btn5.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp5 == temp3) {
					btn5.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp5 == temp4) {
					btn5.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp5 == temp1) {
					btn5.setVisible(false);
					btn1.setVisible(false);
				}
				if (temp5 == temp6) {
					btn5.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp5 == temp7) {
					btn5.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp5 == temp8) {
					btn5.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp5 == temp9) {
					btn5.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp5 == temp10) {
					btn5.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp5 == temp11) {
					btn5.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp5 == temp12) {
					btn5.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp5 != temp2 && temp5 != temp3 && temp5 != temp4 && temp5 != temp9 && temp5 != temp1
						&& temp5 != temp10 && temp5 != temp6 && temp5 != temp11 && temp5 != temp7 && temp5 != temp12
						&& temp5 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn6) {
			Image temp = iconArray[5].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn6.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp6 = stringArray[5];
			if (count >= 3) {
				if (temp6 == temp2) {
					btn6.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp6 == temp3) {
					btn6.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp6 == temp4) {
					btn6.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp6 == temp5) {
					btn6.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp6 == temp1) {
					btn1.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp6 == temp7) {
					btn6.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp6 == temp8) {
					btn6.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp6 == temp9) {
					btn6.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp6 == temp10) {
					btn6.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp6 == temp11) {
					btn6.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp6 == temp12) {
					btn6.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp6 != temp2 && temp6 != temp3 && temp6 != temp4 && temp6 != temp9 && temp6 != temp5
						&& temp6 != temp10 && temp6 != temp1 && temp6 != temp11 && temp6 != temp7 && temp6 != temp12
						&& temp6 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn7) {
			Image temp = iconArray[6].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn7.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp7 = stringArray[6];
			if (count >= 3) {
				if (temp7 == temp2) {
					btn7.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp7 == temp3) {
					btn7.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp7 == temp4) {
					btn7.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp7 == temp5) {
					btn7.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp7 == temp6) {
					btn7.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp7 == temp1) {
					btn1.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp7 == temp8) {
					btn7.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp7 == temp9) {
					btn7.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp7 == temp10) {
					btn7.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp7 == temp11) {
					btn7.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp7 == temp12) {
					btn7.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp7 != temp2 && temp7 != temp3 && temp7 != temp4 && temp7 != temp9 && temp7 != temp5
						&& temp7 != temp10 && temp7 != temp6 && temp7 != temp11 && temp7 != temp1 && temp7 != temp12
						&& temp7 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn8) {
			Image temp = iconArray[7].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn8.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp8 = stringArray[7];
			if (count >= 3) {
				if (temp8 == temp2) {
					btn8.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp8 == temp3) {
					btn8.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp8 == temp4) {
					btn8.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp8 == temp5) {
					btn8.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp8 == temp6) {
					btn8.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp8 == temp7) {
					btn8.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp8 == temp1) {
					btn1.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp8 == temp9) {
					btn8.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp8 == temp10) {
					btn8.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp8 == temp11) {
					btn8.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp8 == temp12) {
					btn8.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp8 != temp2 && temp8 != temp3 && temp8 != temp4 && temp8 != temp9 && temp8 != temp5
						&& temp8 != temp10 && temp8 != temp6 && temp8 != temp11 && temp8 != temp7 && temp8 != temp12
						&& temp8 != temp1) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn9) {
			Image temp = iconArray[8].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn9.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp9 = stringArray[8];
			if (count >= 3) {
				if (temp9 == temp2) {
					btn9.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp9 == temp3) {
					btn9.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp9 == temp4) {
					btn9.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp9 == temp5) {
					btn9.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp9 == temp6) {
					btn9.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp9 == temp7) {
					btn9.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp9 == temp8) {
					btn9.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp9 == temp1) {
					btn1.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp9 == temp10) {
					btn9.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp9 == temp11) {
					btn9.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp9 == temp12) {
					btn9.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp9 != temp2 && temp9 != temp3 && temp9 != temp4 && temp9 != temp1 && temp9 != temp5
						&& temp9 != temp10 && temp9 != temp6 && temp9 != temp11 && temp9 != temp7 && temp9 != temp12
						&& temp9 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn10) {
			Image temp = iconArray[9].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn10.setIcon(icon);
			temp10 = stringArray[9];
			points++;
			counter.setText("" + points);
			count++;
			if (count >= 3) {
				if (temp10 == temp2) {
					btn10.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp10 == temp3) {
					btn10.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp10 == temp4) {
					btn10.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp10 == temp5) {
					btn10.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp10 == temp6) {
					btn10.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp10 == temp7) {
					btn10.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp10 == temp8) {
					btn10.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp10 == temp9) {
					btn10.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp10 == temp1) {
					btn1.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp10 == temp11) {
					btn10.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp10 == temp12) {
					btn10.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp10 != temp2 && temp10 != temp3 && temp10 != temp4 && temp10 != temp9 && temp10 != temp5
						&& temp10 != temp1 && temp10 != temp6 && temp10 != temp11 && temp10 != temp7 && temp10 != temp12
						&& temp10 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn11) {
			Image temp = iconArray[10].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn11.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp11 = stringArray[10];
			if (count >= 3) {
				if (temp11 == temp2) {
					btn11.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp11 == temp3) {
					btn11.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp11 == temp4) {
					btn11.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp11 == temp5) {
					btn11.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp11 == temp6) {
					btn11.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp11 == temp7) {
					btn11.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp11 == temp8) {
					btn11.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp11 == temp9) {
					btn11.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp11 == temp10) {
					btn11.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp11 == temp1) {
					btn1.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp11 == temp12) {
					btn11.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp11 != temp2 && temp11 != temp3 && temp11 != temp4 && temp11 != temp9 && temp11 != temp5
						&& temp11 != temp10 && temp11 != temp6 && temp11 != temp1 && temp11 != temp7 && temp11 != temp12
						&& temp11 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
		}
		if (e.getSource() == btn12) {
			Image temp = iconArray[11].getImage();
			Image resizedImage = temp.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
			ImageIcon icon = new ImageIcon(resizedImage);
			btn12.setIcon(icon);
			points++;
			counter.setText("" + points);
			count++;
			temp12 = stringArray[11];
			if (count >= 3) {
				if (temp12 == temp2) {
					btn12.setVisible(false);
					btn2.setVisible(false);
				}
				if (temp12 == temp3) {
					btn12.setVisible(false);
					btn3.setVisible(false);
				}
				if (temp12 == temp4) {
					btn12.setVisible(false);
					btn4.setVisible(false);
				}
				if (temp12 == temp5) {
					btn12.setVisible(false);
					btn5.setVisible(false);
				}
				if (temp12 == temp6) {
					btn12.setVisible(false);
					btn6.setVisible(false);
				}
				if (temp12 == temp7) {
					btn12.setVisible(false);
					btn7.setVisible(false);
				}
				if (temp12 == temp8) {
					btn12.setVisible(false);
					btn8.setVisible(false);
				}
				if (temp12 == temp9) {
					btn12.setVisible(false);
					btn9.setVisible(false);
				}
				if (temp12 == temp10) {
					btn12.setVisible(false);
					btn10.setVisible(false);
				}
				if (temp12 == temp11) {
					btn12.setVisible(false);
					btn11.setVisible(false);
				}
				if (temp12 == temp1) {
					btn1.setVisible(false);
					btn12.setVisible(false);
				}
				if (temp12 != temp2 && temp12 != temp3 && temp12 != temp4 && temp12 != temp9 && temp12 != temp5
						&& temp12 != temp10 && temp12 != temp6 && temp12 != temp11 && temp12 != temp7 && temp12 != temp1
						&& temp12 != temp8) {

					btn1.setIcon(iconStart);
					btn2.setIcon(iconStart);
					btn3.setIcon(iconStart);
					btn4.setIcon(iconStart);
					btn5.setIcon(iconStart);
					btn6.setIcon(iconStart);
					btn7.setIcon(iconStart);
					btn8.setIcon(iconStart);
					btn9.setIcon(iconStart);
					btn10.setIcon(iconStart);
					btn11.setIcon(iconStart);
					btn12.setIcon(iconStart);
				}
				count = 0;
				temp1 = "";
				temp2 = "";
				temp3 = "";
				temp4 = "";
				temp5 = "";
				temp6 = "";
				temp7 = "";
				temp8 = "";
				temp9 = "";
				temp10 = "";
				temp11 = "";
				temp12 = "";
				points = points - 1 ;
				counter.setText("" + points);
			}
			
		}
		if (e.getSource() == btnNew) {
			count = 0;
			temp1 = "";
			temp2 = "";
			temp3 = "";
			temp4 = "";
			temp5 = "";
			temp6 = "";
			temp7 = "";
			temp8 = "";
			temp9 = "";
			temp10 = "";
			temp11 = "";
			temp12 = "";
			points = 0 ;
			counter.setText("" + points);
			for (int i = iconArray.length - 1; i > 0; i--) {
				int j = (int) Math.floor(Math.random() * (i + 1));
				ImageIcon temp = iconArray[i];
				String sTemp = stringArray[i];
				iconArray[i] = iconArray[j];
				stringArray[i] = stringArray[j];
				iconArray[j] = temp;
				stringArray[j] = sTemp;
			}
			btn1.setIcon(iconStart);
			btn2.setIcon(iconStart);
			btn3.setIcon(iconStart);
			btn4.setIcon(iconStart);
			btn5.setIcon(iconStart);
			btn6.setIcon(iconStart);
			btn7.setIcon(iconStart);
			btn8.setIcon(iconStart);
			btn9.setIcon(iconStart);
			btn10.setIcon(iconStart);
			btn11.setIcon(iconStart);
			btn12.setIcon(iconStart);
			
			btn1.setVisible(true);
			btn2.setVisible(true);
			btn3.setVisible(true);
			btn4.setVisible(true);
			btn5.setVisible(true);
			btn6.setVisible(true);
			btn7.setVisible(true);
			btn8.setVisible(true);
			btn9.setVisible(true);
			btn10.setVisible(true);
			btn11.setVisible(true);
			btn12.setVisible(true);
			
			
			pnlGame.add(btn1);
			pnlGame.add(btn2);
			pnlGame.add(btn3);
			pnlGame.add(btn4);
			pnlGame.add(btn5);
			pnlGame.add(btn6);
			pnlGame.add(btn7);
			pnlGame.add(btn8);
			pnlGame.add(btn9);
			pnlGame.add(btn10);
			pnlGame.add(btn11);
			pnlGame.add(btn12);
		}
		if (e.getSource() == btnExit) {
			System.exit(0);
		}
	}

	public ImageIcon[] randomArray() {
		iconArray[0] = icon1;
		iconArray[1] = icon1;
		iconArray[2] = icon2;
		iconArray[3] = icon2;
		iconArray[4] = icon3;
		iconArray[5] = icon3;
		iconArray[6] = icon4;
		iconArray[7] = icon4;
		iconArray[8] = icon5;
		iconArray[9] = icon5;
		iconArray[10] = icon6;
		iconArray[11] = icon6;
		stringArray[0] = icon1.getDescription();
		stringArray[1] = icon1.getDescription();
		stringArray[2] = icon2.getDescription();
		stringArray[3] = icon2.getDescription();
		stringArray[4] = icon3.getDescription();
		stringArray[5] = icon3.getDescription();
		stringArray[6] = icon4.getDescription();
		stringArray[7] = icon4.getDescription();
		stringArray[8] = icon5.getDescription();
		stringArray[9] = icon5.getDescription();
		stringArray[10] = icon6.getDescription();
		stringArray[11] = icon6.getDescription();

		for (int i = iconArray.length - 1; i > 0; i--) {
			int j = (int) Math.floor(Math.random() * (i + 1));
			ImageIcon temp = iconArray[i];
			String sTemp = stringArray[i];
			iconArray[i] = iconArray[j];
			stringArray[i] = stringArray[j];
			iconArray[j] = temp;
			stringArray[j] = sTemp;
		}
		return iconArray;
	}
}
