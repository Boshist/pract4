package pract4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.atomic.AtomicInteger;

public class applic extends JFrame{
			
	public static void main(String[] args)
	{
		JFrame pract4 = new JFrame("Practice 4");
		
		AtomicInteger Milan = new AtomicInteger();
		AtomicInteger Madrid = new AtomicInteger();
		
		JLabel Res = new JLabel("Result "+Milan.get()+" X " + Madrid.get());
		JLabel Last = new JLabel("Last Scorer: N/A");
		JLabel Win = new JLabel("Winner: DRAW");
		
		JButton ACMil = new JButton("AC Milan");
		JButton ReMad = new JButton("Real Madrid");
		
		JPanel pan = new JPanel(new BorderLayout());
		
		pan.add(Res, BorderLayout.NORTH);
		pan.add(Last, BorderLayout.CENTER);
		pan.add(Win, BorderLayout.SOUTH);
		
		pan.add(ACMil,BorderLayout.WEST);
		pan.add(ReMad,BorderLayout.EAST);
		
		pract4.add(pan);
		pract4.setSize(350, 100);
		pract4.setResizable(false);
		pract4.setVisible(true);
		pract4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	
ReMad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				Madrid.incrementAndGet();
				Res.setText("Result "+Milan.get()+" X " + Madrid.get());
				Last.setText("Last Scorer: Real Madrid");
				if (Madrid.get()>Milan.get())
					Win.setText("Winner: Madrid");
				if (Madrid.get()==Milan.get())
					Win.setText("Winner: DRAW");
			}
		});
		
		ACMil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e){
				Milan.incrementAndGet();
				Res.setText("Result "+Milan.get()+" X " + Madrid.get());
				Last.setText("Last Scorer: AC Milan");
				if (Milan.get()>Madrid.get())
					Win.setText("Winner: Milan");
				if (Milan.get()==Madrid.get())
					Win.setText("Winner: DRAW");
			}
		});		
	}
	
}
