package pkg;
import java.util.Scanner;
import java.util.Random;

public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with width and height lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int width, int height){
		map = new int[height][width];
		posX = 0;
		posY = 0;
		map[0][0] = 2;
		generateTreasure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		Random rand = new Random();
		treasureX = rand.nextInt(map.length);
		treasureY = rand.nextInt(map[0].length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)
	*/
	public boolean move(int m){
		if(m == 1) return move(posX - 1, posY);
		if(m == 2) return move(posX + 1, posY);
		if(m == 3) return move(posX, posY - 1);
		if(m == 4) return move(posX, posY + 1);
		if(m == 5) return move(posX - 1, posY - 1);
		if(m == 6) return move(posX - 1, posY + 1);
		if(m == 7) return move(posX + 1, posY - 1);
		if(m == 8) return move(posX + 1, posY + 1);

		return false;
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
	*/
	public boolean move(int row, int col){
		if(row < 0 || col < 0 || row >= map.length || col >= map[0].length){
			return false;
		}

		if(map[posX][posY] == 2){
			map[posX][posY] = 0;}
		else{
			map[posX][posY] = 1;}
			
		posX = row;
		posY = col;
		if(map[posX][posY] == 1){
			map[posX][posY] = 3;
		}
		else{
			map[posX][posY] = 2;
		}

		return true;
	}

	/*
		This method checks for treasure!
	*/
	public boolean dig(){
		if(posX == treasureX && posY == treasureY){
			return true;
		}

		if(map[posX][posY] == 2){
			map[posX][posY] = 3;
		}

		return false;
	}

	/*
		This method prints the location of the treasure.
	*/
	public void printTreasureLoc(){
		map[treasureX][treasureY] = 7;
		System.out.println("Treasure was at (" + treasureX + ", " + treasureY + ")");
		printMap();
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[0].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
