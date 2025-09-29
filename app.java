public class app {
    public static void handleMenuCreate() {
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cuboid ");
        System.out.println("4. Cube ");
        System.out.println("type: ");
        int input = appUtils.readInt();
        switch (input) {
            case 1 -> {
                System.out.println("input radius: ");

                int radius = appUtils.readInt();
                System.out.println("input phi (enter 0 for default): ");
                double phi = appUtils.readDouble();
                if (phi == 0) {
                    Sphere newSphere = new Sphere(Shape.SPHERE, radius);
                    Object3D.objects.add(newSphere);
                } else {
                    Sphere newSphere = new Sphere(Shape.SPHERE, radius, phi);
                    Object3D.objects.add(newSphere);
                }

                break;
            }
            case 2 -> {
                System.out.println("input radius: ");

                int radius = appUtils.readInt();

                System.out.println("input height: ");
                int height = appUtils.readInt();

                System.out.println("input phi (enter 0 for default): ");
                double phi = appUtils.readDouble();

                if (phi == 0) {
                    Cylinder newCylinder = new Cylinder(Shape.CYLINDER, radius, height);
                    Object3D.objects.add(newCylinder);
                } else {
                    Cylinder newCylinder = new Cylinder(Shape.CYLINDER, radius, height, phi);
                    Object3D.objects.add(newCylinder);
                }
                break;
            }
            case 3 -> {
                System.out.println("input height: ");
                int height = appUtils.readInt();

                System.out.println("input length: ");
                int length = appUtils.readInt();

                System.out.println("input width: ");
                int width = appUtils.readInt();

                Cuboid newCuboid = new Cuboid(Shape.CUBOID, height, width, length);
                Object3D.objects.add(newCuboid);
                break;
            }
            case 4 -> {
                System.out.println("input side: ");
                int side = appUtils.readInt();

                Cube newCube = new Cube(Shape.CUBE, side);
                Object3D.objects.add(newCube);
                break;
            }
            default -> {
                break;
            }
        }
    }

    public static void start() {
        System.out.println("Menu: ");
        System.out.println("1. Add new 3D object");
        System.out.println("2. Print All");
        System.out.println("0. Exit: ");
        System.out.println("choose menu: ");
        int input = appUtils.readInt();
        switch (input) {
            case 1:
                handleMenuCreate();
                break;

            case 2:
                Object3D.printAll();
                break;

            case 0:
                return;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        start();
    }
}
