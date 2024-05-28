import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {
    private List<Component> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + name);
        for (Component component : components) {
            component.showDetails();
        }
    }
}
