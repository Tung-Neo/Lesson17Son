package Lesson17.Lesson17Son;

import Lesson17.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){
        super();
        this.z = 0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0] = super.getX();
        XYZ[1] = super.getY();
        XYZ[2] = this.z;
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3D[x = " + super.getX() +
                ", y = " + super.getY() +
                ", z=" + z +
                "]";
    }
}
