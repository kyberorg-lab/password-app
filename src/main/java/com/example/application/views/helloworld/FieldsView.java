package com.example.application.views.helloworld;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Fields Example")
@Route(value = "fields", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class FieldsView extends VerticalLayout {

    private TextField name;
    private PasswordField passwordField;
    private Button showPassword;

    public FieldsView() {
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
