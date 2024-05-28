public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
