module ru.robar3.chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.robar3.chat to javafx.fxml;
    exports ru.robar3.chat;
}