import java.awt.Color;
import java.util.Random;

public class Cube {
	public int count=0;
	public CubeFace white;
	public CubeFace yellow;
	public CubeFace red;
	public CubeFace blue;
	public CubeFace green;
	public CubeFace orange;
	public CubeFace[] cfs=new CubeFace[6];

	public Cube() {
		white=new CubeFace( "W");
		white.CreatTheFace();

		yellow=new CubeFace( "Y");
		yellow.CreatTheFace();

		red=new CubeFace("R");
		red.CreatTheFace();

		blue=new CubeFace("B");
		blue.CreatTheFace();

		orange=new CubeFace("O");
		orange.CreatTheFace();

		green=new CubeFace("G");
		green.CreatTheFace();


		white.SetNeighbors(blue, green, red, orange);
		yellow.SetNeighbors(blue, green, red, orange);
		red.SetNeighbors(blue, green, white, yellow);
		blue.SetNeighbors(orange, red, white, yellow);
		orange.SetNeighbors(green, blue, white, yellow);
		green.SetNeighbors(red, orange, white, yellow);


		cfs[0]=white;	
		cfs[1]=yellow;		
		cfs[2]=red;		
		cfs[3]=blue;		
		cfs[4]=orange;		
		cfs[5]=green;		


	}

	public void Scramble() {
		CubeFace face=green;

		Random ran =new Random();
		int color=ran.nextInt(6);
		if(color==0)
			face=white;
		if(color==1)
			face=yellow;
		if(color==2)
			face=red;
		if(color==3)
			face=blue;
		if(color==4)
			face=orange;
		if(color==5) {
			face=green;
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++"+face.color);



		MoveTheUpToTheLeft(face);
		MoveTheUpToTheLeft(face);
		Ldownmove(face);
		face=face.left;
		RUpmove(face);
		face=face.right;
		Ldownmove(face);
		Ldownmove(face);
		face=face.left;
		Rdownmove(face);
		face=face.right;
		Ldownmove(face);
		Ldownmove(face);
		face=face.left;
		Ldownmove(face);
		Rdownmove(face);
		face=face.right;
		MoveTheUpToTheLeft(face);
		Ldownmove(face);
		Ldownmove(face);
		face=face.left;
		RUpmove(face);
		face=face.right;
		Rdownmove(face);



		printcube();
	}

	public void RUpmove(CubeFace face) {
		if(face.color.equals("R")) {
			RedRUpmove();
		}

		if(face.color.equals("G")) {
			GreenRupMove();
		}
		if(face.color.equals("O")) {
			RedLdownmove();
		}
		if(face.color.equals("B")) {
			GreenLdownMove();
		}
		if(face.color.equals("W")) {
			RedRUpmove();
		}
		if(face.color.equals("Y")) {
			RedRUpmove();
		}
		System.out.println(count+++"."+face.color+": RUpmove");
		printcube();
		countcolors();
		checkyellowwhite();
	}


	public void Rdownmove(CubeFace face) {
		if(face.color.equals("R")) {
			RedRDownmove();
		}
		if(face.color.equals("G")) {
			GreenRdownMove();
		}
		if(face.color.equals("O")) {
			RedLUpmove();
		}
		if(face.color.equals("B")) {
			GreenLupMove();
		}
		if(face.color.equals("W")) {
			RedRDownmove();
		}
		if(face.color.equals("Y")) {
			RedRDownmove();
		}

		System.out.println(count+++"."+face.color+": Rdownmove");
		printcube();
		countcolors();
		checkyellowwhite();



	}

	public void LUpmove(CubeFace face) {
		if(face.color.equals("R")) {
			RedLUpmove();
		}

		if(face.color.equals("G")) {
			GreenLupMove();
		}
		if(face.color.equals("O")) {
			RedRDownmove();
		}
		if(face.color.equals("B")) {
			GreenRdownMove();
		}
		if(face.color.equals("W")) {
			RedLUpmove();
		}
		if(face.color.equals("Y")) {
			RedLUpmove();
		}

		System.out.println(count+++"."+face.color+": LUmove");
		printcube();
		countcolors();
		checkyellowwhite();

	}


	public void Ldownmove(CubeFace face) {
		if(face.color.equals("R")) {
			RedLdownmove();
		}

		if(face.color.equals("G")) {
			GreenLdownMove();
		}
		if(face.color.equals("O")) {
			RedRUpmove();
		}
		if(face.color.equals("B")) {
			GreenRupMove();
		}
		if(face.color.equals("W")) {
			RedLdownmove();
		}
		if(face.color.equals("Y")) {
			RedLdownmove();
		}
		System.out.println(count+++"."+face.color+": Ldownmove");
		printcube();
		countcolors();
		checkyellowwhite();

	}

	public void MoveTheUpToTheRight(CubeFace face) {
		if(face.color.equals("R")) {
			movetheuptoright();
		}

		if(face.color.equals("G")) {
			movetheuptoright();
		}
		if(face.color.equals("O")) {
			movetheuptoright();
		}
		if(face.color.equals("B")) {
			movetheuptoright();
		}
		if(face.color.equals("W")) {
			GreenLupMove();
		}
		if(face.color.equals("Y")) {
			GreenRdownMove();
		}

		System.out.println(count+++"."+face.color+": MoveTheUPToTheRight");
		printcube();
		countcolors();
		checkyellowwhite();


	}

	public void MoveTheUpToTheLeft(CubeFace face) {
		if(face.color.equals("R")) {
			movetheuptoleft();	
		}

		if(face.color.equals("G")) {
			movetheuptoleft();	
		}
		if(face.color.equals("O")) {
			movetheuptoleft();	
		}
		if(face.color.equals("B")) {
			movetheuptoleft();	
		}
		if(face.color.equals("W")) {
			GreenLdownMove();
		}
		if(face.color.equals("Y")) {
			GreenRupMove();
		}

		System.out.println(count+++"."+face.color+": MoveTheUpToTheLeft");
		printcube();
		countcolors();
		checkyellowwhite();


	}

	public void MoveTheDownToTheRight(CubeFace face) {

		if(face.color.equals("R")) {
			movethedowntoright();
		}

		if(face.color.equals("G")) {
			movethedowntoright();
		}
		if(face.color.equals("O")) {
			movethedowntoright();
		}
		if(face.color.equals("B")) {
			movethedowntoright();
		}
		if(face.color.equals("W")) {
			GreenRupMove();
		}
		if(face.color.equals("Y")) {
			GreenLdownMove();
		}

		System.out.println(count+++"."+face.color+": MoveTheDownToTheRight");
		printcube();
		countcolors();
		checkyellowwhite();


	}

	public void MoveTheDownToTheLeft(CubeFace face) {

		if(face.color.equals("R")) {
			movethedowntoleft();
		}

		if(face.color.equals("G")) {
			movethedowntoleft();
		}
		if(face.color.equals("O")) {
			movethedowntoleft();
		}
		if(face.color.equals("B")) {
			movethedowntoleft();
		}
		if(face.color.equals("W")) {
			GreenRdownMove();
		}
		if(face.color.equals("Y")) {
			GreenLupMove();
		}

		System.out.println(count+++"."+face.color+": MoveTheDownToTheLeft");
		printcube();
		countcolors();
		checkyellowwhite();


	}














	public void RedRUpmove() {
		CubeFace face= red;

		CubeFace newrface=face.right;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[2][2]=newrface.face[0][2];
		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[1][2]=newrface.face[0][1];

		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[0][1]=newrface.face[1][0];

		newrface.face[1][0]=newrface.face[2][1];
		newrface.face[2][0]=newrface.face[2][2];

		newrface.face[2][0]=new3rface[2];
		newrface.face[2][1]=new3rface[1];
		newrface.face[2][2]=new3rface[0];

		face.right=newrface;

		String[] new3= {face.face[0][2],face.face[1][2],face.face[2][2]};
		face.face[0][2]=face.down.face[0][2];
		face.face[1][2]=face.down.face[1][2];
		face.face[2][2]=face.down.face[2][2];

		face=face.down;
		face.face[0][2]=face.down.face[2][0];
		face.face[1][2]=face.down.face[1][0];
		face.face[2][2]=face.down.face[0][0];

		face=face.down;
		face.face[0][0]=face.up.face[2][2];
		face.face[1][0]=face.up.face[1][2];
		face.face[2][0]=face.up.face[0][2];

		face=face.up;
		face.face[0][2]=new3[0];
		face.face[1][2]=new3[1];
		face.face[2][2]=new3[2];
	}

	public void RedRDownmove() {
		CubeFace face= red;

		CubeFace newrface=face.right;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[2][2];
		newrface.face[1][2]=newrface.face[2][1];
		newrface.face[2][2]=newrface.face[2][0];


		newrface.face[2][2]=newrface.face[2][0];
		newrface.face[2][1]=newrface.face[1][0];
		newrface.face[2][0]=newrface.face[0][0];


		newrface.face[2][0]=newrface.face[0][0];
		newrface.face[1][0]=newrface.face[0][1];
		newrface.face[0][0]=newrface.face[0][2];


		newrface.face[0][0]=new3rface[0];
		newrface.face[0][1]=new3rface[1];
		newrface.face[0][2]=new3rface[2];

		face.right=newrface;


		String[] new3= {face.face[0][2],face.face[1][2],face.face[2][2]};
		face.face[0][2]=face.up.face[0][2];
		face.face[1][2]=face.up.face[1][2];
		face.face[2][2]=face.up.face[2][2];

		face=face.up;
		face.face[0][2]=face.down.face[2][0];
		face.face[1][2]=face.down.face[1][0];
		face.face[2][2]=face.down.face[0][0];

		face=face.down;
		face.face[0][0]=face.down.face[2][2];
		face.face[1][0]=face.down.face[1][2];
		face.face[2][0]=face.down.face[0][2];

		face=face.down;
		face.face[0][2]=new3[0];
		face.face[1][2]=new3[1];
		face.face[2][2]=new3[2];

	}


	public void RedLUpmove() {
		CubeFace face= red;


		CubeFace newrface=face.left;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[2][2];
		newrface.face[1][2]=newrface.face[2][1];
		newrface.face[2][2]=newrface.face[2][0];


		newrface.face[2][2]=newrface.face[2][0];
		newrface.face[2][1]=newrface.face[1][0];
		newrface.face[2][0]=newrface.face[0][0];


		newrface.face[2][0]=newrface.face[0][0];
		newrface.face[1][0]=newrface.face[0][1];
		newrface.face[0][0]=newrface.face[0][2];


		newrface.face[0][0]=new3rface[0];
		newrface.face[0][1]=new3rface[1];
		newrface.face[0][2]=new3rface[2];

		face.left=newrface;

		String[] new3= {face.face[0][0],face.face[1][0],face.face[2][0]};
		face.face[0][0]=face.down.face[0][0];
		face.face[1][0]=face.down.face[1][0];
		face.face[2][0]=face.down.face[2][0];

		face=face.down;
		face.face[0][0]=face.down.face[2][2];
		face.face[1][0]=face.down.face[1][2];
		face.face[2][0]=face.down.face[0][2];

		face=face.down;
		face.face[0][2]=face.up.face[2][0];
		face.face[1][2]=face.up.face[1][0];
		face.face[2][2]=face.up.face[0][0];

		face=face.up;
		face.face[0][0]=new3[0];
		face.face[1][0]=new3[1];
		face.face[2][0]=new3[2];


	}


	public void RedLdownmove() {

		CubeFace face= red;

		CubeFace newrface=face.left;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[1][2]=newrface.face[0][1];
		newrface.face[2][2]=newrface.face[0][2];

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[0][1]=newrface.face[1][0];
		newrface.face[0][0]=newrface.face[2][0];

		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[1][0]=newrface.face[2][1];
		newrface.face[2][0]=newrface.face[2][2];

		newrface.face[2][0]=new3rface[2];
		newrface.face[2][1]=new3rface[1];
		newrface.face[2][2]=new3rface[0];

		face.left=newrface;
		String[] new3= {face.face[0][0],face.face[1][0],face.face[2][0]};

		face.face[0][0]=face.up.face[0][0];
		face.face[1][0]=face.up.face[1][0];
		face.face[2][0]=face.up.face[2][0];

		face=face.up;
		face.face[0][0]=face.down.face[2][2];
		face.face[1][0]=face.down.face[1][2];
		face.face[2][0]=face.down.face[0][2];

		face=face.down;
		face.face[2][2]=face.down.face[0][0];
		face.face[1][2]=face.down.face[1][0];
		face.face[0][2]=face.down.face[2][0];

		face=face.down;
		face.face[0][0]=new3[0];
		face.face[1][0]=new3[1];
		face.face[2][0]=new3[2];


	}
	public void movetheuptoright() {

		CubeFace face= red;


		CubeFace newrface=face.up;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[2][2];
		newrface.face[1][2]=newrface.face[2][1];
		newrface.face[2][2]=newrface.face[2][0];


		newrface.face[2][2]=newrface.face[2][0];
		newrface.face[2][1]=newrface.face[1][0];
		newrface.face[2][0]=newrface.face[0][0];


		newrface.face[2][0]=newrface.face[0][0];
		newrface.face[1][0]=newrface.face[0][1];
		newrface.face[0][0]=newrface.face[0][2];


		newrface.face[0][0]=new3rface[0];
		newrface.face[0][1]=new3rface[1];
		newrface.face[0][2]=new3rface[2];

		face.up=newrface;
		String[] new3= {face.face[0][0],face.face[0][1],face.face[0][2]};

		face.face[0][0]=face.left.face[0][0];
		face.face[0][1]=face.left.face[0][1];
		face.face[0][2]=face.left.face[0][2];

		face=face.left;
		face.face[0][0]=face.left.face[0][0];
		face.face[0][1]=face.left.face[0][1];
		face.face[0][2]=face.left.face[0][2];

		face=face.left;
		face.face[0][0]=face.left.face[0][0];
		face.face[0][1]=face.left.face[0][1];
		face.face[0][2]=face.left.face[0][2];


		face=face.left;
		face.face[0][0]=new3[0];
		face.face[0][1]=new3[1];
		face.face[0][2]=new3[2];


	}



	public  void movetheuptoleft() {

		CubeFace face= red;


		CubeFace newrface=face.up;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[2][2]=newrface.face[0][2];
		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[1][2]=newrface.face[0][1];

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[0][1]=newrface.face[1][0];

		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[1][0]=newrface.face[2][1];
		newrface.face[2][0]=newrface.face[2][2];

		newrface.face[2][0]=new3rface[2];
		newrface.face[2][1]=new3rface[1];
		newrface.face[2][2]=new3rface[0];

		face.up=newrface;

		String[] new3= {face.face[0][0],face.face[0][1],face.face[0][2]};

		face.face[0][0]=face.right.face[0][0];
		face.face[0][1]=face.right.face[0][1];
		face.face[0][2]=face.right.face[0][2];

		face=face.right;
		face.face[0][0]=face.right.face[0][0];
		face.face[0][1]=face.right.face[0][1];
		face.face[0][2]=face.right.face[0][2];

		face=face.right;
		face.face[0][0]=face.right.face[0][0];
		face.face[0][1]=face.right.face[0][1];
		face.face[0][2]=face.right.face[0][2];


		face=face.right;
		face.face[0][0]=new3[0];
		face.face[0][1]=new3[1];
		face.face[0][2]=new3[2];



	}


	public  void movethedowntoright() {
		CubeFace face= red;


		CubeFace newrface=face.down;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[1][2]=newrface.face[0][1];
		newrface.face[2][2]=newrface.face[0][2];

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[0][1]=newrface.face[1][0];

		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[1][0]=newrface.face[2][1];
		newrface.face[2][0]=newrface.face[2][2];

		newrface.face[2][0]=new3rface[2];
		newrface.face[2][1]=new3rface[1];
		newrface.face[2][2]=new3rface[0];

		face.down=newrface;

		String[] new3= {face.face[2][0],face.face[2][1],face.face[2][2]};

		face.face[2][0]=face.left.face[2][0];
		face.face[2][1]=face.left.face[2][1];
		face.face[2][2]=face.left.face[2][2];

		face=face.left;
		face.face[2][0]=face.left.face[2][0];
		face.face[2][1]=face.left.face[2][1];
		face.face[2][2]=face.left.face[2][2];

		face=face.left;
		face.face[2][0]=face.left.face[2][0];
		face.face[2][1]=face.left.face[2][1];
		face.face[2][2]=face.left.face[2][2];


		face=face.left;
		face.face[2][0]=new3[0];
		face.face[2][1]=new3[1];
		face.face[2][2]=new3[2];



	}

	public  void movethedowntoleft() {
		CubeFace face= red;


		CubeFace newrface=face.down;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[2][2];
		newrface.face[1][2]=newrface.face[2][1];
		newrface.face[2][2]=newrface.face[2][0];


		newrface.face[2][2]=newrface.face[2][0];
		newrface.face[2][1]=newrface.face[1][0];
		newrface.face[2][0]=newrface.face[0][0];


		newrface.face[2][0]=newrface.face[0][0];
		newrface.face[1][0]=newrface.face[0][1];
		newrface.face[0][0]=newrface.face[0][2];


		newrface.face[0][0]=new3rface[0];
		newrface.face[0][1]=new3rface[1];
		newrface.face[0][2]=new3rface[2];


		String[] new3= {face.face[2][0],face.face[2][1],face.face[2][2]};

		face.face[2][0]=face.right.face[2][0];
		face.face[2][1]=face.right.face[2][1];
		face.face[2][2]=face.right.face[2][2];

		face=face.right;
		face.face[2][0]=face.right.face[2][0];
		face.face[2][1]=face.right.face[2][1];
		face.face[2][2]=face.right.face[2][2];

		face=face.right;
		face.face[2][0]=face.right.face[2][0];
		face.face[2][1]=face.right.face[2][1];
		face.face[2][2]=face.right.face[2][2];


		face=face.right;
		face.face[2][0]=new3[0];
		face.face[2][1]=new3[1];
		face.face[2][2]=new3[2];

	}

	/////////////////// The Green face moves ////////////////////////


	public void GreenRupMove() {
		CubeFace face= green;



		CubeFace newrface=face.right;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[2][2]=newrface.face[0][2];
		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[1][2]=newrface.face[0][1];

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[0][1]=newrface.face[1][0];

		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[1][0]=newrface.face[2][1];
		newrface.face[2][0]=newrface.face[2][2];

		newrface.face[2][0]=new3rface[2];
		newrface.face[2][1]=new3rface[1];
		newrface.face[2][2]=new3rface[0];

		face.right=newrface;

		String[] new3= {face.face[0][2],face.face[1][2],face.face[2][2]};
		face.face[0][2]=face.down.face[0][0];
		face.face[1][2]=face.down.face[0][1];
		face.face[2][2]=face.down.face[0][2];

		face=face.down;
		face.face[0][0]=face.right.face[2][0];
		face.face[0][1]=face.right.face[1][0];
		face.face[0][2]=face.right.face[0][0];

		face=face.right;
		face.face[2][0]=face.up.face[2][2];
		face.face[1][0]=face.up.face[2][1];
		face.face[0][0]=face.up.face[2][0];


		face=face.up;

		face.face[2][2]=new3[0];
		face.face[2][1]=new3[1];
		face.face[2][0]=new3[2];

	}


	public void GreenRdownMove() {
		CubeFace face= green;


		CubeFace newrface=face.right;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[2][2];
		newrface.face[1][2]=newrface.face[2][1];
		newrface.face[2][2]=newrface.face[2][0];


		newrface.face[2][2]=newrface.face[2][0];
		newrface.face[2][1]=newrface.face[1][0];
		newrface.face[2][0]=newrface.face[0][0];


		newrface.face[2][0]=newrface.face[0][0];
		newrface.face[1][0]=newrface.face[0][1];
		newrface.face[0][0]=newrface.face[0][2];


		newrface.face[0][0]=new3rface[0];
		newrface.face[0][1]=new3rface[1];
		newrface.face[0][2]=new3rface[2];

		face.right=newrface;

		String[] new3= {face.face[0][2],face.face[1][2],face.face[2][2]};
		face.face[0][2]=face.up.face[2][2];
		face.face[1][2]=face.up.face[2][1];
		face.face[2][2]=face.up.face[2][0];

		face=face.up;
		face.face[2][2]=face.right.face[2][0];
		face.face[2][1]=face.right.face[1][0];
		face.face[2][0]=face.right.face[0][0];

		face=face.right;
		face.face[2][0]=face.down.face[0][0];
		face.face[1][0]=face.down.face[0][1];
		face.face[0][0]=face.down.face[0][2];


		face=face.down;

		face.face[0][0]=new3[0];
		face.face[0][1]=new3[1];
		face.face[0][2]=new3[2];

	}

	public void GreenLupMove() {
		CubeFace face= green;


		CubeFace newrface=face.left;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[0][2]=newrface.face[2][2];
		newrface.face[1][2]=newrface.face[2][1];
		newrface.face[2][2]=newrface.face[2][0];


		newrface.face[2][2]=newrface.face[2][0];
		newrface.face[2][1]=newrface.face[1][0];
		newrface.face[2][0]=newrface.face[0][0];


		newrface.face[2][0]=newrface.face[0][0];
		newrface.face[1][0]=newrface.face[0][1];
		newrface.face[0][0]=newrface.face[0][2];


		newrface.face[0][0]=new3rface[0];
		newrface.face[0][1]=new3rface[1];
		newrface.face[0][2]=new3rface[2];

		face.left=newrface;

		String[] new3= {face.face[0][0],face.face[1][0],face.face[2][0]};
		face.face[0][0]=face.down.face[2][0];
		face.face[1][0]=face.down.face[2][1];
		face.face[2][0]=face.down.face[2][2];

		face=face.down;
		face.face[2][0]=face.right.face[2][2];
		face.face[2][1]=face.right.face[1][2];
		face.face[2][2]=face.right.face[0][2];

		face=face.right;
		face.face[2][2]=face.up.face[0][2];
		face.face[1][2]=face.up.face[0][1];
		face.face[0][2]=face.up.face[0][0];


		face=face.up;

		face.face[0][0]=new3[2];
		face.face[0][1]=new3[1];
		face.face[0][2]=new3[0];

	}

	public void GreenLdownMove() {
		CubeFace face= green;


		CubeFace newrface=face.left;
		String[] new3rface= {newrface.face[0][2],newrface.face[1][2],newrface.face[2][2]};

		newrface.face[2][2]=newrface.face[0][2];
		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[1][2]=newrface.face[0][1];

		newrface.face[0][2]=newrface.face[0][0];
		newrface.face[0][1]=newrface.face[1][0];
		newrface.face[0][0]=newrface.face[2][0];

		newrface.face[0][0]=newrface.face[2][0];
		newrface.face[1][0]=newrface.face[2][1];
		newrface.face[2][0]=newrface.face[2][2];

		newrface.face[2][0]=new3rface[2];
		newrface.face[2][1]=new3rface[1];
		newrface.face[2][2]=new3rface[0];

		face.left=newrface;

		String[] new3= {face.face[0][0],face.face[1][0],face.face[2][0]};
		face.face[0][0]=face.up.face[0][2];
		face.face[1][0]=face.up.face[0][1];
		face.face[2][0]=face.up.face[0][0];

		face=face.up;
		face.face[0][0]=face.right.face[0][2];
		face.face[0][1]=face.right.face[1][2];
		face.face[0][2]=face.right.face[2][2];

		face=face.right;
		face.face[0][2]=face.down.face[2][2];
		face.face[1][2]=face.down.face[2][1];
		face.face[2][2]=face.down.face[2][0];


		face=face.down;

		face.face[2][0]=new3[0];
		face.face[2][1]=new3[1];
		face.face[2][2]=new3[2];


	}




	/////////////////////////////////////////////// Solving the cube ////////////////////


	public void WhiteCross() {
		while (white.face[0][1].equals("W")==false||white.face[2][1].equals("W")==false||white.face[1][0].equals("W")==false||white.face[1][2].equals("W")==false) {
			if(yellow.face[0][1].equals("W")) {
				CubeFace face=red;
				String color=red.face[2][1];
				while(color!=face.color) {
					MoveTheDownToTheRight(face);
					face=face.right;
				}
				face=face.left;
				RUpmove(face);
				RUpmove(face);
				WhiteCross();
				return;

			}

			if(yellow.face[1][0].equals("W")) {
				CubeFace face=green;
				String color=green.face[2][1];
				while(color!=face.color) {
					MoveTheDownToTheRight(face);
					face=face.right;
				}
				face=face.left;
				RUpmove(face);
				RUpmove(face);
				WhiteCross();
				return;
			}

			if(yellow.face[2][1].equals("W")) {
				CubeFace face=orange;
				String color=orange.face[2][1];
				while(color!=face.color) {
					MoveTheDownToTheRight(face);
					face=face.right;
				}
				face=face.left;
				RUpmove(face);
				RUpmove(face);
				WhiteCross();
				return;


			}

			if(yellow.face[1][2].equals("W")) {
				CubeFace face=blue;
				String color=blue.face[2][1];
				while(color!=face.color) {
					MoveTheDownToTheRight(face);
					face=face.right;
				}
				face=face.left;
				RUpmove(face);
				RUpmove(face);
				WhiteCross();
				return;

			}


			CubeFace face=red;
			for(int i=0;i<4;i++) {
				if(face.face[1][0].equals("W")) {
					Ldownmove(face);
					MoveTheDownToTheRight(face);
					LUpmove(face);
					WhiteCross();
					return;

				}
				if(face.face[1][2].equals("W")) {
					Rdownmove(face);
					MoveTheDownToTheRight(face);
					RUpmove(face);
					WhiteCross();
					return;


				}
				face=face.right;


			}

			face=this.red;
			for(int i=0;i<4;i++) {
				if(face.face[0][1].equals("W")) {
					Rdownmove(face.left);
					Ldownmove(face);
					movethedowntoright();
					LUpmove(face);
					RUpmove(face.left);
					WhiteCross();
					return;

				}
				if(face.face[2][1].equals("W")) {
					RUpmove(face.left);
					Ldownmove(face);
					movethedowntoright();
					LUpmove(face);
					Rdownmove(face.left);
					WhiteCross();
					return;


				}
				face=face.right;


			}


		}
	}



	public void whiteCorners() {
		while(white.face[0][0].equals("W")==false||white.face[2][0].equals("W")==false||white.face[0][2].equals("W")==false||white.face[2][2].equals("W")==false) {
			CubeFace face= red;
			for(int i=0;i<4;i++) {
				if(face.face[2][0].equals("W")) {
					face=face.left;
					while(!face.face[2][2].equals(face.color)) {
						MoveTheDownToTheRight(face);
						face=face.right;

					}
					Rdownmove(face);
					MoveTheDownToTheLeft(face);
					RUpmove(face);
					MoveTheDownToTheRight(face);
					whiteCorners();
					return;


				}	
				face=face.right;
			}

			face= this.red;
			for(int i=0;i<4;i++) {
				if(face.face[2][2].equals("W")) {
					face=face.right;
					while(!face.face[2][0].equals(face.color)) {
						MoveTheDownToTheRight(face);
						face=face.right;

					}
					Ldownmove(face);
					MoveTheDownToTheRight(face);
					LUpmove(face);
					MoveTheDownToTheLeft(face);
					whiteCorners();
					return;

				}
				face=face.right;

			}

			face= red;
			for(int i=0;i<4;i++) {
				if(face.face[0][0].equals("W")) {
					face=face.left;
					Rdownmove(face);
					MoveTheDownToTheLeft(face);
					RUpmove(face);
					MoveTheDownToTheRight(face);
					whiteCorners();
					return;

				}	
				face=face.right;
			}

			face= red;
			for(int i=0;i<4;i++) {
				if(face.face[0][2].equals("W")) {
					face=face.right;
					Ldownmove(face);
					MoveTheDownToTheRight(face);
					LUpmove(face);
					MoveTheDownToTheLeft(face);
					whiteCorners();
					return;
				}
				face=face.right;

			}
			///////////////////////////////////////////////////////////top yellow white //////////////////////////////////////////




			face= yellow;
			if(face.face[0][0].equals("W")||face.face[0][2].equals("W")||face.face[2][0].equals("W")||face.face[2][2].equals("W")) {
				face=red;

				while(!yellow.face[0][0].equals("W")) {
					MoveTheDownToTheRight(face);
				}
				face=red;
				Ldownmove(face);
				MoveTheDownToTheLeft(face);
				LUpmove(face);
				whiteCorners();
				return;
			}




		}
	}

	public void secondLayer() {
		while(!checkseclayer()) {
			CubeFace face=red;
			for(int i=0;i<4;i++) {
				if(!face.face[2][1].equals(yellow.color)&&!yellow.face[0][1].equals(yellow.color)) {
					while(!face.face[2][1].equals(face.color)) {
						MoveTheDownToTheLeft(face);
						face=face.left;
					}
					if(face.color.equals(red.color)) {
						if(face.left.color.equals(yellow.face[0][1])) {
							MoveTheDownToTheRight(face);
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							face=face.left;
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							secondLayer();
							return;

						}
						if(face.right.color.equals(yellow.face[0][1])) {
							MoveTheDownToTheLeft(face);
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							face=face.right;
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							secondLayer();
							return;


						}
					}

					if(face.color.equals(blue.color)) {
						if(face.left.color.equals(yellow.face[1][2])) {
							MoveTheDownToTheRight(face);
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							face=face.left;
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							secondLayer();
							return;

						}
						if(face.right.color.equals(yellow.face[1][2])) {
							MoveTheDownToTheLeft(face);
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							face=face.right;
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							secondLayer();
							return;
						}
					}

					if(face.color.equals(green.color)) {
						if(face.left.color.equals(yellow.face[1][0])) {
							MoveTheDownToTheRight(face);
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							face=face.left;
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							secondLayer();
							return;

						}
						if(face.right.color.equals(yellow.face[1][0])) {
							MoveTheDownToTheLeft(face);
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							face=face.right;
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							secondLayer();
							return;


						}
					}

					if(face.color.equals(orange.color)) {
						if(face.left.color.equals(yellow.face[2][1])) {
							MoveTheDownToTheRight(face);
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							face=face.left;
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							secondLayer();
							return;

						}
						if(face.right.color.equals(yellow.face[2][1])) {
							MoveTheDownToTheLeft(face);
							Rdownmove(face);
							MoveTheDownToTheLeft(face);
							RUpmove(face);
							MoveTheDownToTheRight(face);
							face=face.right;
							Ldownmove(face);
							MoveTheDownToTheRight(face);
							LUpmove(face);
							MoveTheDownToTheLeft(face);
							secondLayer();
							return;


						}
					}
				}
				MoveTheDownToTheLeft(face);
			}
			face=red;
			for(int i=0;i<4;i++) {
				if(!face.face[1][0].equals(yellow.color)&&!face.left.face[1][2].equals(yellow.color)&&!face.face[1][0].equals(face.color)&&!face.left.face[1][2].equals(face.left.color)) {
					MoveTheDownToTheRight(face);
					Ldownmove(face);
					MoveTheDownToTheRight(face);
					LUpmove(face);
					MoveTheDownToTheLeft(face);
					face=face.left;
					Rdownmove(face);
					MoveTheDownToTheLeft(face);
					RUpmove(face);
					MoveTheDownToTheRight(face);
					secondLayer();
					return;

				}
				face=face.left;
			}
		}

	}

	public void yellwcross() {
		while(!yellow.face[1][0].equals("Y")||!yellow.face[0][1].equals("Y")||!yellow.face[2][1].equals("Y")||!yellow.face[1][2].equals("Y")) {
			CubeFace face=red;
			face=face.right;
			Ldownmove(face);
			face=face.left;
			Ldownmove(face);
			MoveTheDownToTheRight(face);
			LUpmove(face);
			MoveTheDownToTheLeft(face);
			face=face.right;
			LUpmove(face);
			if(!yellow.face[1][0].equals("Y")||!yellow.face[0][1].equals("Y")||!yellow.face[2][1].equals("Y")||!yellow.face[1][2].equals("Y")) {
				if(yellow.face[1][0].equals(yellow.color)&&yellow.face[2][1].equals(yellow.color)||yellow.face[2][1].equals(yellow.color)&&yellow.face[1][2].equals(yellow.color)||yellow.face[0][1].equals(yellow.color)&&yellow.face[1][2].equals(yellow.color))
					while(!yellow.face[1][0].equals(yellow.color)||!yellow.face[0][1].equals(yellow.color))
						MoveTheDownToTheLeft(face);
				if(yellow.face[0][1].equals(yellow.color)&&yellow.face[2][1].equals(yellow.color))
					MoveTheDownToTheLeft(face);
			}
		}

	}

	public void matchthecrosscolor() {
		if(!checkmatchcross()) {
			for(int j=0;j<4;j++) {
				CubeFace face=red;
				int count=0;
				for(int i=0;i<4;i++) {
					if(face.face[2][1].equals(face.color))
						count++;
					face=face.right;
				}
				if(count==2) {
					break;
				}
				MoveTheDownToTheLeft(face);
			}			
		}
		CubeFace face=findfacestomatchthecross();
		while(!checkmatchcross()) {
			Ldownmove(face);
			MoveTheDownToTheRight(face);
			LUpmove(face);
			MoveTheDownToTheRight(face);
			Ldownmove(face);
			MoveTheDownToTheLeft(face);
			MoveTheDownToTheLeft(face);
			LUpmove(face);

		}

	}
	public CubeFace findfacestomatchthecross() {
		CubeFace face=red;
		for(int i=0;i<4;i++) {
			if(face.face[2][1].equals(face.color)&&face.right.face[2][1].equals(face.right.color))
				return face.left.left;
			face=face.left;
		}
		return face;
	}

	public void adjestyellowcorners() {


		while(!checkyellowcorners()) {
			CubeFace face=fixidangel();
			MoveTheDownToTheRight(face);
			Ldownmove(face);
			MoveTheDownToTheLeft(face);
			Rdownmove(face);
			MoveTheDownToTheRight(face);
			LUpmove(face);
			MoveTheDownToTheLeft(face);
			RUpmove(face);
		}
	}

	public void finalstep() {
		CubeFace face=red;
		for(int i=0;i<4;i++) {
			while(!yellow.face[0][2].equals(yellow.color)) {
				RUpmove(face);
				MoveTheUpToTheLeft(face);
				Rdownmove(face);
				MoveTheUpToTheRight(face);
			}

			MoveTheDownToTheLeft(face);
		}
		while(!face.face[2][1].equals(face.color))
			MoveTheDownToTheLeft(face);

	}

	public boolean checkyellowcorners() {
		CubeFace face=red;
		if((!face.face[2][0].equals(red.color)&&!face.face[2][0].equals(yellow.color)&&!face.face[2][0].equals(green.color))||(face.left.face[2][2].equals(red.color)&&face.left.face[2][2].equals(yellow.color)&&face.left.face[2][2].equals(green.color))||(!yellow.face[0][0].equals(red.color)&&!yellow.face[0][0].equals(green.color)&&!yellow.face[0][0].equals(yellow.color)))
			return false;
		face=face.left;
		if((!face.face[2][0].equals(orange.color)&&!face.face[2][0].equals(yellow.color)&&!face.face[2][0].equals(green.color))||(face.left.face[2][2].equals(orange.color)&&face.left.face[2][2].equals(yellow.color)&&face.left.face[2][2].equals(green.color))||(!yellow.face[2][0].equals(orange.color)&&!yellow.face[2][0].equals(green.color)&&!yellow.face[2][0].equals(yellow.color)))
			return false;
		face=face.left;
		if((!face.face[2][0].equals(blue.color)&&!face.face[2][0].equals(yellow.color)&&!face.face[2][0].equals(orange.color))||(face.left.face[2][2].equals(blue.color)&&face.left.face[2][2].equals(yellow.color)&&face.left.face[2][2].equals(orange.color))||(!yellow.face[2][2].equals(blue.color)&&!yellow.face[2][2].equals(orange.color)&&!yellow.face[2][2].equals(yellow.color)))
			return false;
		face=face.left;
		if((!face.face[2][0].equals(blue.color)&&!face.face[2][0].equals(yellow.color)&&!face.face[2][0].equals(red.color))||(face.left.face[2][2].equals(blue.color)&&face.left.face[2][2].equals(yellow.color)&&face.left.face[2][2].equals(red.color))||(!yellow.face[0][2].equals(blue.color)&&!yellow.face[0][2].equals(red.color)&&!yellow.face[0][2].equals(yellow.color)))
			return false;

		return true;

	}
	public CubeFace fixidangel() {
		CubeFace face=red;

		if((face.face[2][0].equals(red.color)||face.face[2][0].equals(yellow.color)||face.face[2][0].equals(green.color))&&(face.left.face[2][2].equals(red.color)||face.left.face[2][2].equals(yellow.color)||face.left.face[2][2].equals(green.color))&&(yellow.face[0][0].equals(red.color)||yellow.face[0][0].equals(green.color)||yellow.face[0][0].equals(yellow.color)))
			return red;
		face=face.left;
		if((face.face[2][0].equals(orange.color)||face.face[2][0].equals(yellow.color)||face.face[2][0].equals(green.color))&&(face.left.face[2][2].equals(orange.color)||face.left.face[2][2].equals(yellow.color)||face.left.face[2][2].equals(green.color))&&(yellow.face[2][0].equals(orange.color)||yellow.face[2][0].equals(green.color)||yellow.face[2][0].equals(yellow.color)))
			return green;
		face=face.left;
		if((face.face[2][0].equals(blue.color)||face.face[2][0].equals(yellow.color)||face.face[2][0].equals(orange.color))&&(face.left.face[2][2].equals(blue.color)||face.left.face[2][2].equals(yellow.color)||face.left.face[2][2].equals(orange.color))&&(yellow.face[2][2].equals(blue.color)||yellow.face[2][2].equals(orange.color)||yellow.face[2][2].equals(yellow.color)))
			return orange;
		face=face.left;
		if((face.face[2][0].equals(blue.color)||face.face[2][0].equals(yellow.color)||face.face[2][0].equals(red.color))&&(face.left.face[2][2].equals(blue.color)||face.left.face[2][2].equals(yellow.color)||face.left.face[2][2].equals(red.color))&&(yellow.face[0][2].equals(blue.color)||yellow.face[0][2].equals(red.color)||yellow.face[0][2].equals(yellow.color)))
			return blue;
		return red;
	}

	public boolean checkmatchcross() {
		for(int j=0;j<4;j++) {
			CubeFace face=red;
			int count=0;
			for(int i=0;i<4;i++) {
				if(face.face[2][1].equals(face.color))
					count++;
				face=face.right;
			}
			if(count==4)
				return true;
			MoveTheDownToTheLeft(face);
		}	
		/*/
		for(int i=0;i<4;i++) {
			if(!face.face[2][1].equals(face.color)) {
				face=red;
				while(!face.face[2][1].equals(face.color))
					MoveTheDownToTheLeft(face);
				return false;

			}
			face=face.right;
		}
		/*/
		return false;
	}

	public boolean checkseclayer() {
		CubeFace face=red;
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++)
				if(!face.face[1][j].equals(face.color))
					return false;
			face=face.right;
		}
		return true;
	}

	public void printcube() {	
		for(int c=0;c<3;c++) {
			for(int i=0;i<cfs.length;i++) {
				for(int r=0;r<3;r++){
					System.out.print(cfs[i].face[c][r]+"");
					System.out.print(" ");
				}
				System.out.print("   ");
			}
			System.out.println("");


		}
		System.out.println("");

	}

	public void checkyellowwhite() {
		CubeFace face=red;
		for(int i=0;i<4;i++) {
			if(face.face[2][2].equals("W"))
				if(face.right.face[2][0].equals("Y"))
					System.out.println(face.color+"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			if(face.face[2][2].equals("Y"))
				if(face.right.face[2][0].equals("W"))
					System.out.println(face.color+"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			face=face.right;
		}
	}
	public void countcolors(){
		CubeFace face=red;
		int colors[]= new int[6];
		for(int i=0;i<4;i++) {
			for(int r=0;r<3;r++)
				for(int c=0;c<3;c++) {
					if(face.face[r][c].equals("W"))
						colors[0]++;
					if(face.face[r][c].equals("Y"))
						colors[1]++;
					if(face.face[r][c].equals("R"))
						colors[2]++;
					if(face.face[r][c].equals("B"))
						colors[3]++;
					if(face.face[r][c].equals("O"))
						colors[4]++;
					if(face.face[r][c].equals("G"))
						colors[5]++;
				}
			face=face.right;
		}
		face=white;
		for(int r=0;r<3;r++)
			for(int c=0;c<3;c++) {
				if(face.face[r][c].equals("W"))
					colors[0]++;
				if(face.face[r][c].equals("Y"))
					colors[1]++;
				if(face.face[r][c].equals("R"))
					colors[2]++;
				if(face.face[r][c].equals("B"))
					colors[3]++;
				if(face.face[r][c].equals("O"))
					colors[4]++;
				if(face.face[r][c].equals("G"))
					colors[5]++;
			}
		face=yellow;
		for(int r=0;r<3;r++)
			for(int c=0;c<3;c++) {
				if(face.face[r][c].equals("W"))
					colors[0]++;
				if(face.face[r][c].equals("Y"))
					colors[1]++;
				if(face.face[r][c].equals("R"))
					colors[2]++;
				if(face.face[r][c].equals("B"))
					colors[3]++;
				if(face.face[r][c].equals("O"))
					colors[4]++;
				if(face.face[r][c].equals("G"))
					colors[5]++;
			}
		for(int i=0;i<6;i++) {
			if(colors[i]!=9) {
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
				break;
			}
		}
	}
}
