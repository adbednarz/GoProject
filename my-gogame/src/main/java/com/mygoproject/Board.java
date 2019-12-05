package com.mygoproject;

public class Board {
	
	private Intersection[][] intersections;
	
	public Board(int size) {
		intersections = new Intersection[size][size];
		for(int i = 0; i < size; i++) {
			for(int k = 0; k < size; k++)	{
				intersections[i][k] = new Intersection();
			}
		}
	}
	
	public String getStateOfIntersection(int x, int y) {
		return this.intersections[x][y].getState();
	}
	
	public void changeStateOfIntersection(int x, int y, String state) {
		intersections[x][y].changeState(state);
	}
}