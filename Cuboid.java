public class Cuboid extends Object3D {
    int length, width, height;

    public Cuboid(Shape shapeName, int length, int width, int height) {
        super(shapeName);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }

    @Override
    public int getSurfaceArea() {
        int surfaceArea = 2 * (length * width + width * height + length * height);
        return surfaceArea;
    }
}
