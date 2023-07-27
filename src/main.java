import java.util.Iterator;

public class main {

	public static void main(String[] args) {
				
				
	
		Cube cube=new Cube();
		/*/	
		cube.white.face[0][0]="O";
		cube.white.face[0][1]="G";
		cube.white.face[0][2]="W";
		cube.white.face[1][0]="W";
		cube.white.face[1][1]="W";
		cube.white.face[1][2]="B";
		cube.white.face[2][0]="B";
		cube.white.face[2][1]="R";
		cube.white.face[2][2]="G";
		
		cube.red.face[0][0]="O";
		cube.red.face[0][1]="B";
		cube.red.face[0][2]="O";
		cube.red.face[1][0]="R";
		cube.red.face[1][1]="R";
		cube.red.face[1][2]="G";
		cube.red.face[2][0]="W";
		cube.red.face[2][1]="O";
		cube.red.face[2][2]="O";
		
		cube.green.face[0][0]="B";
		cube.green.face[0][1]="B";
		cube.green.face[0][2]="Y";
		cube.green.face[1][0]="W";
		cube.green.face[1][1]="G";
		cube.green.face[1][2]="W";
		cube.green.face[2][0]="R";
		cube.green.face[2][1]="O";
		cube.green.face[2][2]="G";
		
		cube.yellow.face[0][0]="R";
		cube.yellow.face[0][1]="Y";
		cube.yellow.face[0][2]="G";
		cube.yellow.face[1][0]="B";
		cube.yellow.face[1][1]="Y";
		cube.yellow.face[1][2]="R";
		cube.yellow.face[2][0]="Y";
		cube.yellow.face[2][1]="G";
		cube.yellow.face[2][2]="Y";
		
		cube.blue.face[0][0]="Y";
		cube.blue.face[0][1]="Y";
		cube.blue.face[0][2]="R";
		cube.blue.face[1][0]="R";
		cube.blue.face[1][1]="B";
		cube.blue.face[1][2]="G";
		cube.blue.face[2][0]="W";
		cube.blue.face[2][1]="Y";
		cube.blue.face[2][2]="R";
		
		
		
		cube.orange.face[0][0]="B";
		cube.orange.face[0][1]="W";
		cube.orange.face[0][2]="W";
		cube.orange.face[1][0]="Y";
		cube.orange.face[1][1]="O";
		cube.orange.face[1][2]="O";
		cube.orange.face[2][0]="B";
		cube.orange.face[2][1]="O";
		cube.orange.face[2][2]="G";
		
					
		
		
	
		cube.blue.face[0][0]="a";
		cube.blue.face[0][1]="s";
		cube.blue.face[0][2]="d";
		cube.blue.face[1][0]="f";
		cube.blue.face[1][1]="g";
		cube.blue.face[1][2]="h";
		cube.blue.face[2][0]="j";
		cube.blue.face[2][1]="k";
		cube.blue.face[2][2]="l";
	/*/	
		/*/	
		
		Cube cube=new Cube();
		cube.white.face[0][0]="W";
		cube.white.face[0][1]="Y";
		cube.white.face[0][2]="G";
		cube.white.face[1][0]="G";
		cube.white.face[1][1]="W";
		cube.white.face[1][2]="Y";
		cube.white.face[2][0]="G";
		cube.white.face[2][1]="G";
		cube.white.face[2][2]="Y";
		
		cube.red.face[0][0]="R";
		cube.red.face[0][1]="O";
		cube.red.face[0][2]="B";
		cube.red.face[1][0]="R";
		cube.red.face[1][1]="R";
		cube.red.face[1][2]="R";
		cube.red.face[2][0]="O";
		cube.red.face[2][1]="G";
		cube.red.face[2][2]="O";
		
		cube.green.face[0][0]="B";
		cube.green.face[0][1]="R";
		cube.green.face[0][2]="Y";
		cube.green.face[1][0]="B";
		cube.green.face[1][1]="G";
		cube.green.face[1][2]="Y";
		cube.green.face[2][0]="Y";
		cube.green.face[2][1]="G";
		cube.green.face[2][2]="W";
		
		cube.yellow.face[0][0]="B";
		cube.yellow.face[0][1]="W";
		cube.yellow.face[0][2]="B";
		cube.yellow.face[1][0]="Y";
		cube.yellow.face[1][1]="Y";
		cube.yellow.face[1][2]="W";
		cube.yellow.face[2][0]="O";
		cube.yellow.face[2][1]="W";
		cube.yellow.face[2][2]="W";
		
		cube.blue.face[0][0]="R";
		cube.blue.face[0][1]="B";
		cube.blue.face[0][2]="W";
		cube.blue.face[1][0]="W";
		cube.blue.face[1][1]="B";
		cube.blue.face[1][2]="B";
		cube.blue.face[2][0]="Y";
		cube.blue.face[2][1]="B";
		cube.blue.face[2][2]="R";
		
		
		
		cube.orange.face[0][0]="O";
		cube.orange.face[0][1]="O";
		cube.orange.face[0][2]="R";
		cube.orange.face[1][0]="O";
		cube.orange.face[1][1]="O";
		cube.orange.face[1][2]="R";
		cube.orange.face[2][0]="G";
		cube.orange.face[2][1]="O";
		cube.orange.face[2][2]="G";
	/*/	

		cube.printcube();
		
		for(int i=0;i<1;i++) {
			
		
		cube.Scramble();
		
		cube.WhiteCross();
		System.out.println("White corners solving ******************************************************************************************************************************");
		cube.countcolors();
		cube.whiteCorners();
		System.out.println("second layer ******************************************************************************************************************************");
		cube.secondLayer();
		System.out.println("yellow cross ******************************************************************************************************************************");
		cube.yellwcross();
		System.out.println("match yellow cross ******************************************************************************************************************************");
		cube.matchthecrosscolor(); /////error here
		System.out.println("adjest the yellow cross ******************************************************************************************************************************");
		cube.adjestyellowcorners();
		System.out.println("final step ******************************************************************************************************************************");
		cube.finalstep();
		System.out.println("********************* END ********************");
		cube.printcube();

		}
	}


}
