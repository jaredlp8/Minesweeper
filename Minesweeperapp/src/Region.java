import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class Region {

	public void flag(Color arrayColor[][],int coorX,int coorY){
		if(arrayColor[coorX][coorY].equals(Color.GRAY)){
			arrayColor[coorX][coorY]=Color.RED; }
		else{
			if(arrayColor[coorX][coorY].equals(Color.RED)){
				arrayColor[coorX][coorY]=Color.GRAY; }
		}
	}
	public void bombGenerator(int region[][]){
		Random generator = new Random();
		int i=0, Bomb=0; 
		Bomb = region[generator.nextInt(9)+1][generator.nextInt(9)+1];
		for(i=1;i<=10;i++){
			do{
				region[generator.nextInt(9)+1][generator.nextInt(9)+1]=1;
			}while(Bomb==1); 
		}
	}
		public void bombViewer(int region[][]){
			for(int i=0;i<11;i++){
				for(int j=0;j<11;j++){
					System.out.print(region[j][i]);
			}
				System.out.println();
		}
	}
}