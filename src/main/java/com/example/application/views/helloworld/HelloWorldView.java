package com.example.application.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.application.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends HorizontalLayout {

    private TextField name;
    private PasswordField passwordField;
    private Button sayHello;

    public HelloWorldView() {
        setMargin(true);
        name = new TextField("Your name");
        passwordField = new PasswordField("Your Password");
        sayHello = new Button("Say hello");
        add(name, passwordField, sayHello);
        setVerticalComponentAlignment(Alignment.END, name, passwordField, sayHello);
        sayHello.addClickListener(e -> Notification.show("Hello " + name.getValue() +
                ", your entered Password is '" + passwordField.getValue() + "'"));
    }
}
