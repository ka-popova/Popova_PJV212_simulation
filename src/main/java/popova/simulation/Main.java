package popova.simulation;

import popova.simulation.context.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println(controller.getForestMap());

    }
}