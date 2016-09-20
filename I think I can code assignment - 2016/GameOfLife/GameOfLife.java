public class GameOfLife{
	//the width/height of the whole window in fields
	public int fieldNumber=40;
	//size of one field in pixels
	public int fieldSize=15;
	//every field has a either true (=alive) or false (=dead) value, represented in that array
	public boolean[][] fields;
	//the window itself
	public GameOfLifeUI ui;

	public GameOfLife(){
		//create the UI
		ui = new GameOfLifeUI(fieldNumber, fieldNumber, fieldSize);
		fields = new boolean[fieldNumber][fieldNumber];
		//the initial form, a square at the middle
		for(int i=0;i<fieldNumber-20;i++){
			for(int k=0;k<fieldNumber-20;k++)
				fields[i+10][k+10]=true;
		}
		//push the initial form to the ui
		for (int i=0;i<fieldNumber;i++) {
			for (int k=0;k<fieldNumber;k++) {
				if(fields[i][k]) ui.setCellToYellow(i,k);
			}
		}
		//the loop for applying the rules every second and updating the ui
		while(true){
		 	update();
			ui.update();
		 	try{Thread.sleep(500);}catch(Exception e){}
	 }
	}
public int countNeighbours(int x, int y) {
	int counter = 0;
 // The loop checks whether the neighboring x axis cells are present
	for (int a = -1 ; a <= 1; a++ ) {
		// if statement keeps the cells  from going over the edge of the Array
		if(x+a>=0 && x+a<fieldNumber){
			// The inner for loop checks whether neighbouring y axis cells are present
		for (int b = -1; b <= 1; b++ ) {
		// if statement keeps the cells  from going over the edge of the Array
			if(y+b>=0 && y+b<fieldNumber){
				// The if statement eliminates checking for the current cell
				if( !(a == 0 &&  b == 0) ) {
					// check the neighbouring field at the adjusted coordinates if it exists
					if (fields[x+a][y+b]) {
					counter++;
					System.out.println( "I am cell " + x + "," + y);
					}
				}
			}
		}
	}
	}
	return counter;
}
//applys the rules of the game of life to all fields
	public void update(){
		//a temporary variable, where at the end of the following loop the whole updated area is stored
		boolean[][] updatedFields = new boolean[fieldNumber][fieldNumber];
		//applys the rules to all cells
		for(int i=0;i<fieldNumber;i++){
			for(int k=0;k<fieldNumber;k++){
				//apply the given rules through having a look at the neigbours of the field
				int n = countNeighbours(i,k);
				if(n<2 || n>3) updatedFields[i][k]=false;
				else if (n==3) updatedFields[i][k]=true;
				else updatedFields[i][k]=true;
				//push this to the ui if anything changes
				if(fields[i][k] != updatedFields[i][k])
					ui.toggleCell(i,k);
		  }
		}
		//push the updatedfields array to the fields array, prepare for the next time
		for(int x=0;x<fieldNumber;x++){
			for(int y=0;y<fieldNumber;y++) {
				fields[x][y]=updatedFields[x][y];
			 }
		}
	}
	public static void main(String args[]){
		new GameOfLife();
	}
}
