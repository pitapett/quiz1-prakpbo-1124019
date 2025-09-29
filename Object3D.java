import java.util.ArrayList;

public enum Shape {
    SPHERE,
    CYLINDER,
    CUBOID,
    CUBE
}

abstract class Object3D {

    public Object3D() {

    }

    public Object3D(Shape shapeName) {
        this.shapeName = shapeName;
    }

    public Shape shapeName;

    public abstract int getVolume();

    public abstract int getSurfaceArea();

    public static ArrayList<Object3D> objects = new ArrayList<>();

    static void printAll() {
        for (Object3D object : objects) {
            System.out.println("Name: " + object.shapeName + " Volume: " + object.getVolume() + " Surface Area: "
                    + object.getSurfaceArea());
        }

    }
}
