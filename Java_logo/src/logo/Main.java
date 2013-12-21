package logo;

import javax.swing.*;

public class Main{

	public static void main(String[] args) {
	JFrame guiFrame;
	JFrame commander;
	
	LogoGui guiClass = new LogoGui();
	LogoCommander commanderClass = new LogoCommander();
	
	guiFrame = guiClass.initFrame();
	commander = commanderClass.initFrame();
	}
}
