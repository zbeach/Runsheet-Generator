package main;
import ui.*;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class RunsheetGenerator {
	
	public static void main(String[] args) throws Exception {
		// Set look and feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		UI window = null;
		try {
			window = new UI();
			window.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//window.waitForCompletion();
		
		//Settings settings = window.getSettings();
		Settings settings = new Settings();
		
		/*
		for (int i = 0; i < settings.includedPositions.length; i++)
			System.out.println(settings.includedPositions[i]);
`*/
		/*
		Schedule schedule = Settings.noShiftChanges
				? new Schedule(settings.exportFile, new Date(settings.date), settings.includedPositions)
				: new Schedule(settings.exportFile, new Date(settings.date), settings.includedPositions, settings.firstShiftChangeHour);
*/
		//Runsheet runsheet = new Runsheet(schedule);

		//FileOutputStream out = new FileOutputStream(settings.runsheetPath);
		//runsheet.write(out);
		//runsheet.close();
		//out.close();
	}
}
