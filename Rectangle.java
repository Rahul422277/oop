class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(10.0, 5.0);
        System.out.println("The perimeter of the rectangle is: " + myRectangle.getPerimeter());
        System.out.println("The area of the rectangle is: " + myRectangle.getArea());
    }
}
