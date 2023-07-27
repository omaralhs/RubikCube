
public class CubeFace {

	public String[][] face=new String[3][3];
	public CubeFace right;
	public CubeFace left;
	public CubeFace up;
	public CubeFace down;
	public String color;

	public CubeFace(String c) {
		color=c;
	}
	
	public void SetNeighbors(CubeFace r,CubeFace l,CubeFace u,CubeFace d) {
		right =r;
		left=l;
		up=u;
		down=d;
	}

	public void CreatTheFace() {
		for(int c=0;c<3;c++) {
			for(int r=0;r<3;r++)
				face[c][r]=color;
		}
	}
	public void printtheface() {
		for(int c=0;c<3;c++) {
			for(int r=0;r<3;r++)
				System.out.print(face[c][r]+" ");
			System.out.println(" ");
		}
	}

}
