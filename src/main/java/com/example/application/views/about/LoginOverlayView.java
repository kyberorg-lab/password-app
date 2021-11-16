package com.example.application.views.about;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Login Overlay")
@Route(value = "login-overlay", layout = MainLayout.class)
public class LoginOverlayView extends Div {

    private final Span info = new Span();

    public LoginOverlayView() {
        LoginOverlay overlay = new LoginOverlay();
        overlay.addLoginListener(e -> overlay.close());

        LoginI18n i18n = LoginI18n.createDefault();
        i18n.setAdditionalInformation("To close the login form submit non-empty username and password");
        overlay.setI18n(i18n);

        overlay.addLoginListener(e -> {
            info.setText("Hello " + e.getUsername() + ", your entered Password is '" + e.getPassword() + "'");
        });

        overlay.setOpened(true);

        add(overlay, info);
    }

}
