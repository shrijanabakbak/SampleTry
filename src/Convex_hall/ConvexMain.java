package Convex_hall;

public class ConvexMain {
	public static void main(String[] args) {
		Coordinate point[]= new Coordinate[7];
		point[0] = new Coordinate(0,0);
        point[1] = new Coordinate(2,1);
        point[2] = new Coordinate(3,2);
        point[3] = new Coordinate(0,3);
        point[4] = new Coordinate(5,0);
        point[5] = new Coordinate(2,4);
        point[6] = new Coordinate(5,5);
        
        GiftWrapping gfw = new GiftWrapping();
        gfw.convexHall(point);
	}

}
