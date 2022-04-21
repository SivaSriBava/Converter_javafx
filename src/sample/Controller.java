package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField edittext;;

    @FXML
    private Button meterBtn;

    @FXML
    private Button kilometerBtn;

    @FXML
    private Button INRBtn;

    @FXML
    private Button celsiusBtn;

    @FXML
    private Button FahrenheitBtn;

    @FXML
    private Button volumeBtn;

    @FXML
    private Label ansLbl;




    @FXML
    void convertMeter(ActionEvent event) {
        String number=edittext.getText().trim();
        try {
            int num = Integer.parseInt(number);
            double convert = num * 1000;
            String meter = Double.toString(convert);
            ansLbl.setText(meter);
        }
        catch (NumberFormatException exception) {
            ansLbl.setText("Invalid input. \n Please enter a number");
        }
    }


    @FXML
    void convertKilometer(ActionEvent event) {
        String number=edittext.getText().trim();
        try {
            int num = Integer.parseInt(number);
            double convert = num/1000;
            String kilometer = Double.toString(convert);
            ansLbl.setText(kilometer);
        }
        catch (NumberFormatException exception) {
            ansLbl.setText("Invalid input. \n Please enter a number");
        }
    }

    @FXML
    void convertINR(ActionEvent event) {
        String number=edittext.getText().trim();
        try {
            int num = Integer.parseInt(number);
            double convert = num/2.71;;
            String INR = Double.toString(convert);
            ansLbl.setText(INR);
        }
        catch (NumberFormatException exception) {
            ansLbl.setText("Invalid input. \n Please enter a number");
        }
    }

    @FXML
    void convertCelsius(ActionEvent event) {
        String number=edittext.getText().trim();
        try {
            int num = Integer.parseInt(number);
            double convert = (((num - 32 ) * 5) / 9 );
            String Celsius = Double.toString(convert);
            ansLbl.setText(Celsius);
        }
        catch (NumberFormatException exception) {
            ansLbl.setText("Invalid input. \n Please enter a number");
        }
    }

    @FXML
    void convertFahrenheit(ActionEvent event) {
        String number=edittext.getText().trim();
        try {
            int num = Integer.parseInt(number);
            double convert = ((9 * num )/5 + 32);
            String Fahrenheit = Double.toString(convert);
            ansLbl.setText(Fahrenheit);
        }
        catch (NumberFormatException exception) {
            ansLbl.setText("Invalid input. \n Please enter a number");
        }
    }

    @FXML
    void convertVolume(ActionEvent event) {
        String number=edittext.getText().trim();
        try {
            int num = Integer.parseInt(number);
            double convert = num*num*num;
            String Volume = Double.toString(convert);
            ansLbl.setText(Volume
            );
        }
        catch (NumberFormatException exception) {
            ansLbl.setText("Invalid input. \n Please enter a number");
        }
    }




    @FXML
     void initialize() {


    }
}
