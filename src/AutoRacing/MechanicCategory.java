package AutoRacing;

public enum MechanicCategory {
    CAR("ЛЕГКОВЫЕ АВТОМОБИЛИ") ,
    BUS("АВТОБУСЫ"),
    TRUCK("ГРУЗОВИКИ"),
    ALL_AUTO("ЛЮБЫЕ АВТОМОБИЛИ");

    private final String specification;

    MechanicCategory(String specification) {
        this.specification = specification;
    }

    public String getSpecification() {
        return specification;
    }

    @Override
    public String toString() {
        return " " + getSpecification ()+ " ";
    }
}
