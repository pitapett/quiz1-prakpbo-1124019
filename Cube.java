public class Cube extends Object3D {
    int side;

    public Cube(Shape shapeName, int side) {
        super(shapeName);
        this.side = side;
    }

    @Override
    public int getVolume() {
        int volume = side * side * side;
        return volume;
    }

    @Override
    public int getSurfaceArea() {
        int surfaceArea = 6 * side * side;
        return surfaceArea;
    }
}
