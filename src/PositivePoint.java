class Point{
    int xPos, yPos;
    Point(){
        xPos=0; yPos=0;
    }
    Point(int x,int y){
        xPos=x; yPos=y;
    }

    void move(int x, int y){
        xPos=x;
        yPos=y;
    }

    public String toString(){
        return "("+xPos+","+yPos+")의 점";
    }
}

public class PositivePoint extends Point {
    private PositivePoint(){
        super();
    }
    private PositivePoint(int x, int y){
        super(x, y);
        if(xPos<0 || yPos<0)
        {
            super.move(0,0);
        }
    }

    void move(int x, int y){
        if(x>=0&&y>=0)
        {
            super.move(x,y);
        }
    }

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10,10);
        System.out.println(p.toString()+"입니다.");

        p.move(-5,5);
        System.out.println(p.toString()+"입니다.");

        PositivePoint p2 = new PositivePoint(-10,-10);
        System.out.println(p2.toString()+"입니다.");
    }
}
