/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ucf.assignments;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXListView;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ToDoListController {

    @FXML
    private MenuBar MenuBar;

    @FXML
    private JFXListView<?> ViewList;

    @FXML
    private JFXCheckBox CheckListComplete;

    @FXML
    private JFXButton LoadListButton;

    @FXML
    private JFXButton DeleteListButton;

    @FXML
    private JFXButton AddNewListButton;

    @FXML
    private JFXButton EditButton;

    @FXML
    private TextField Description;

    @FXML
    private DatePicker DueDate;

    @FXML
    private TableView<?> ViewDescription;

    @FXML
    private JFXButton DeleteItemButton;

    @FXML
    private JFXButton EditItemButton;

    @FXML
    private JFXCheckBox CheckItemComplete;

}
