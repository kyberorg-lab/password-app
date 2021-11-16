package com.example.application.views.about;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Sign Up")
@Route(value = "login", layout = MainLayout.class)
public class SignUpView extends LoginForm {

    public SignUpView() {
        addLoginListener(e -> Notification.show("Hello " + e.getUsername() +
                ", your entered Password is '" + e.getPassword() + "'"));
    }

}
