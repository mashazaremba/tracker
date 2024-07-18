package ru.tracker.action;

import ru.tracker.input.Input;
import ru.tracker.Tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "Завершить программу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
