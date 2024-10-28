module com.echoband.echoband {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.echoband.echoband to javafx.fxml;
    exports com.echoband.echoband.controller;
    opens com.echoband.echoband.controller to javafx.fxml;
    exports com.echoband.echoband;
}