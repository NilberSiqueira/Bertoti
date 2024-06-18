import java.util.ArrayList;
import java.util.List;

public class IProductComponent extends CompositePattern {
    private List<CompositePattern> components = new ArrayList<>();

    public IProductComponent(String name) {
        super(name);
    }

    public void addComponent(CompositePattern component) {
        components.add(component);
    }

    public void removeComponent(CompositePattern component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (CompositePattern component : components) {
            component.showDetails();
        }
    }
}
