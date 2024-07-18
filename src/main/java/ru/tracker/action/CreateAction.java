package ru.tracker.action;

import ru.tracker.input.Input;
import ru.tracker.Tracker;
import ru.tracker.model.Item;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
        return true;
    }
}
