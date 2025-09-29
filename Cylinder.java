public class Cylinder extends Object3D{
    double phi;
    int radius;
    int height;

    public Cylinder(Shape shapeName, int radius, int height){
        super(shapeName);
        this.radius = radius;
        this.height = height;
        this.phi = 3.14;
    }

    public Cylinder(Shape shapeName, int radius, int height, double phi){
        super(shapeName);
        this.radius = radius;
        this.height = height;
        this.phi = phi;
    }

    @Override
    public int getVolume() {
        int volume = 0;
        return volume;
    }

    @Override
    public int getSurfaceArea() {
        int surfaceArea = 0;
        return surfaceArea;
    }
    
}
