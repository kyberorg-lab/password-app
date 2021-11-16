package com.example.application.views.shadowdom;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Fields Example with Shadow DOM")
@Route(value = "sd")
public class ShadowDomView extends VerticalLayout {

    private TextField name;
    private PasswordField passwordField;
    private Button showPassword;

    public ShadowDomView() {
        setMargin(true);
        name = new TextField("Your name");
        passwordField = new PasswordField("Your Password");
        showPassword = new Button("Show Password");
        add(name, passwordField, showPassword);
        setHorizontalComponentAlignment(Alignment.START, name, passwordField, showPassword);
        showPassword.addClickListener(e -> Notification.show("Hello " + name.getValue() +
                ", your entered Password is '" + passwordField.getValue() + "'"));
    }
}

