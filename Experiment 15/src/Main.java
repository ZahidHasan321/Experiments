import javax.swing.SwingUtilities;

import ui.InputForm;

public class Main {

	public static void main(String[] args) {
		/**
		 * Launch the application.
		 */
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					InputForm frame = new InputForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
