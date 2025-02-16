module ru.rctikk.gtdgenerate {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.rctikk.gtdgenerate to javafx.fxml;
    exports ru.rctikk.gtdgenerate;
}