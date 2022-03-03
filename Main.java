public class Main {
    public static void main(String args[]) {
        Model model = new Model();
        View view = new View();
        Data data = new Data();
        Controller controller = new Controller(model, view, data);

        controller.displayScreen();
    }
}
