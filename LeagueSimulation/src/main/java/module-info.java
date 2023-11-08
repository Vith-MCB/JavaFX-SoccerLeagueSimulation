module com.example.leaguesimulation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leaguesimulation to javafx.fxml;
    exports com.example.leaguesimulation;
}