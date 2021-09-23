package Question4;
/*
    Question number  4
*/

class Shapes {
    public void draw(){
        System.out.println("Shape Draw");
    }
    public void draw(int length, int breadth){
        System.out.println("Shape draw "+ length + breadth);
    }

    public void erase(){

        System.out.println("Shape Erase");
    }
}

class Circle extends Shapes {
    public void draw() {
        System.out.println("Circle Draw");
    }

    public void erase() {
        System.out.println("Circle Erase");
    }
}

class Triangle extends Shapes{
    public void draw() {
        System.out.println("Triangle Draw");
    }

    public void erase() {
        System.out.println("Triangle Erase");
    }
}

class Square extends Shapes{
    public void draw() {
        System.out.println("Square Draw");
    }

    public void erase() {
        System.out.println("Square Erase");
    }
}

class Shape{

    public static void main(String []arg){
        Shapes shapeObj= new Shapes();
        shapeObj.draw();
        shapeObj.draw(1,2);
        shapeObj.erase();

        Shapes squareObj = new Square();
        squareObj.draw();
        squareObj.erase();

        Shapes triangleObj = new Triangle();
        triangleObj.draw();
        triangleObj.erase();

        Shapes circleObj = new Circle();
        circleObj.draw();
        circleObj.erase();
    }
}
