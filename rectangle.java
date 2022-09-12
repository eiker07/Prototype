public class rectangle extends Shape {
    public int radius;

    public rectangle() {
    }

    public rectangle(circule target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        rectangle shape2 = (rectangle) object2;
        return shape2.radius == radius;
    }
}