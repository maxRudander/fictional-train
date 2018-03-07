

import java.awt.BorderLayout;

import javax.swing.*;

public class MemoryStart {

	public static void main(String[] args) {
		JPanel pnl = new JPanel();
		MemoryMain main = new MemoryMain();
		JFrame frame1 = new JFrame("Memory!");
		pnl.setLayout(new BorderLayout());
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnl.add(main, BorderLayout.WEST);
		frame1.add(pnl);
		frame1.pack();
		frame1.setVisible(true);
	}

}
