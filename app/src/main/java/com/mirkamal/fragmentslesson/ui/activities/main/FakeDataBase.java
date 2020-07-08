package com.mirkamal.fragmentslesson.ui.activities.main;

import java.util.ArrayList;
import java.util.List;

public class FakeDataBase {

    private List<Chat> chats;

    public FakeDataBase() {
        chats = new ArrayList<>();
        chats.add(new Chat("sender1", "message 1", "14:39"));
        chats.add(new Chat("sender2", "message 2", "11:33"));
        chats.add(new Chat("sender3", "message 3", "18:25"));
        chats.add(new Chat("sender4", "message 4", "14:39"));
        chats.add(new Chat("sender5", "message 5", "23:36"));
        chats.add(new Chat("sender6", "message 6", "18:39"));
        chats.add(new Chat("sender7", "message 7", "07:15"));
        chats.add(new Chat("sender8", "message 8", "13:23"));
        chats.add(new Chat("sender9", "message 9", "14:58"));
        chats.add(new Chat("sender10", "message 10", "23:59"));
        chats.add(new Chat("sender11", "message 11", "00:00"));
        chats.add(new Chat("sender12", "message 12", "01:32"));
        chats.add(new Chat("sender13", "message 13", "19:35"));
        chats.add(new Chat("sender14", "message 14", "01:11"));
        chats.add(new Chat("sender15", "message 15", "11:11"));
        chats.add(new Chat("sender16", "message 16", "19:39"));
        chats.add(new Chat("sender17", "message 17", "10:15"));
        chats.add(new Chat("sender18", "message 18", "22:13"));
    }

    public List<Chat> getChats() {
        return chats;
    }
}
