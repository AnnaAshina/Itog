package Farm.Instances.instances;

public class Cat {
    
    public Cat(String name, Date birthdate, String color) {
    super(name, birthdate, color);
}

@Override
public String toString() {
    return "Cat{" +
            "name='" + name + '\'' +
            ", birthdate=" + birthdate +
            ", color='" + color + '\'' +
            "}\n";
}
