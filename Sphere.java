public class Sphere extends Object3D {
    double phi;
    int radius;

    public Sphere(Shape shapeName, int radius){
        super(shapeName);
        this.radius = radius;
        this.phi = 3.14;
    }

    public Sphere(Shape shapeName, int radius, double phi){
        super(shapeName);
        this.radius = radius;
        this.phi = phi;
    }

    @Override
    public int getVolume() {
        int volume = (int) Math.round(1.333 * phi * radius);
        return volume;
    }

    @Override
    public int getSurfaceArea() {
        int surfaceArea = 0;
        return surfaceArea;
    }

}
