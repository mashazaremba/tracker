package ru.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        String newName = "Fix PC 2";
        Item item = new Item("Fix PC");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), newName};
        Input input = new MockInput(answers);
        StartUI.replaceItem(input, tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo(newName);
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Fix PC");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        Input input = new MockInput(answers);
        StartUI.deleteItem(input, tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted).isNull();
    }


    }

