package org.system;

import javax.swing.plaf.DesktopPaneUI;

public class Desktop extends Computer {

	//
		// TODO Auto-generated method stub

	

   public void desktopSize() {
   System.out.println("The  screen size is 30 inches ");
   
   }
   public static void main(String[] args) {   
	Desktop  size = new Desktop ();
	   size.ComputerModel();
	   size.desktopSize();
   }
   } 