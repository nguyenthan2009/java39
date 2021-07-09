public class TestCircle {
    private double radius =1;
    private String color = "red";
    TestCircle(){
    }
   public TestCircle( double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }

}
