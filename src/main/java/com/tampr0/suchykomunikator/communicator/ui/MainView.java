package com.tampr0.suchykomunikator.communicator.ui;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextAreaVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.dom.ElementConstants;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    TextArea textAreaMessage = new TextArea();
    TextField textFieldMessage = new TextField("Tutaj wpisz swoją wiadomość");

    public MainView() {
        configureTextAreaMessage();
        configureTextFieldMessage();


        add(textFieldMessage, textAreaMessage);


    }



    private void configureTextAreaMessage() {
        textAreaMessage.setPlaceholder("Tutuaj wpisz swoją wiadomość...");
        textAreaMessage.addThemeVariants(TextAreaVariant.LUMO_ALIGN_RIGHT);
        textAreaMessage.setSizeUndefined();
        textAreaMessage.setValue("Narazie nic");
        textAreaMessage.setReadOnly(true);
        textAreaMessage.setHeight("100px");
    }
    private void configureTextFieldMessage() {
        textFieldMessage.setClearButtonVisible(true);
    }
}
