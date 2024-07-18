package ru.tracker.action;

import ru.tracker.input.Input;
import ru.tracker.Tracker;
import ru.tracker.model.Item;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        int id = input.askInt("Введите id ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        } else {
            System.out.println(item);
        }
        return true;
    }
}
