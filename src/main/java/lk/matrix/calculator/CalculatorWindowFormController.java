package lk.matrix.calculator;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class CalculatorWindowFormController {
    @FXML
    private TextArea displayLabel;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXButton moduleBtn;

    @FXML
    private JFXButton nineBtn;

    @FXML
    private JFXButton eightBtn;

    @FXML
    private JFXButton fiveBtn;

    @FXML
    private JFXButton fourBtn;

    @FXML
    private JFXButton sevenBtn;

    @FXML
    private JFXButton multiBtn;

    @FXML
    private JFXButton sixBtn;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton equalBtn;

    @FXML
    private JFXButton dotBtn;

    @FXML
    private JFXButton zeroBtn;

    @FXML
    private JFXButton subBtn;

    @FXML
    private JFXButton threeBtn;

    @FXML
    private JFXButton twoBtn;

    @FXML
    private JFXButton oneBtn;

    private String text = "";

    private char moduler;
    private double num1;
    private double num2;
    private int count = 0;


    @FXML
    void backBtnOnAction(ActionEvent event) {

    }

    @FXML
    void clearBtnOnAction(ActionEvent event) {
        text = "";
        displayLabel.setText(null);
        count = 0;
    }

    @FXML
    void dotBtnOnAction(ActionEvent event) {
        setLabel(".");
    }

    @FXML
    void equalBtnOnAction(ActionEvent event) {
        String[] calculation = text.split(" ");
        num2 = Double.parseDouble(calculation[2]);
        double ans = 0;
        switch (moduler){
            case '+' : ans = num1 + num2; break;
            case '-' : ans = num1 - num2; break;
            case '*' : ans = num1 * num2; break;
            case '/' : ans = num1 / num2; break;
            default: ans = 0.0;
        }
        setLabel(String.format("%s%2.2f"," = ",ans));

        count = 0;
    }

    @FXML
    void addBtnOnAction(ActionEvent event) {
        addNumber();
        setLabel(" + ");
        moduler = '+';
    }

    @FXML
    void moduleBtnOnAction(ActionEvent event) {
        addNumber();
        setLabel(" / ");
        moduler = '/';
    }

    @FXML
    void multiBtnOnAction(ActionEvent event) {
        addNumber();
        setLabel(" X ");
        moduler = '*';
    }

    @FXML
    void subBtnOnAction(ActionEvent event) {
        addNumber();
        setLabel(" - ");
        moduler = '-';
    }

    @FXML
    void eightBtnOnAction(ActionEvent event) {
        setLabel("8");
    }

    @FXML
    void fiveBtnOnAction(ActionEvent event) {
        setLabel("5");
    }

    @FXML
    void fourBtnOnAction(ActionEvent event) {
        setLabel("4");
    }

    @FXML
    void nineBtnOnAction(ActionEvent event) {
        setLabel("9");
    }

    @FXML
    void oneBtnOnAction(ActionEvent event) {
        setLabel("1");
    }

    @FXML
    void sevenBtnOnAction(ActionEvent event) {
        setLabel("7");
    }

    @FXML
    void sixBtnOnAction(ActionEvent event) {
        setLabel("6");
    }

    @FXML
    void threeBtnOnAction(ActionEvent event) {
        setLabel("3");
    }

    @FXML
    void twoBtnOnAction(ActionEvent event) {
        setLabel("2");
    }

    @FXML
    void zeroBtnOnAction(ActionEvent event) {
        setLabel("0");
    }

    void setLabel(String num){
        if(count == 1 && (num.equals(" + ") || num.equals(" - ") || num.equals(" / ") || num.equals(" * "))){
            String[] words = text.split(" ");
            text = words[0] + num;
        }else{
            text += num;
        }
        displayLabel.setText(text);
    }

    void addNumber(){
        if(count == 0) {
            num1 = Double.parseDouble(text);
            count++;
        }else if(count == 1){
            setLabel(" " + moduler + " ");
        }
        System.out.println(num1);

    }
}
