public class ShapeFactory {
    public Shape getShape(){
        Shape shape = null;

        shape = new Rectangle();
        System.out.println(shape.sahe(12,25));
//        shape.hecm(1,47,8);
        return  shape;
    }
}
