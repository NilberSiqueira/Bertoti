public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(dir1);

        dir2.showDetails();
    }
}