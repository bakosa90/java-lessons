package com.company.handlers;

import com.company.models.Login;
import com.company.utils.JWT;
import com.sun.net.httpserver.HttpExchange;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public class SignInHandler extends Handler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        super.handle(httpExchange);

        // get data from POST request
        String request = getRequest();

        // parse data from JSON to Login model
        Login login;
        try {
            login = Login.parse(request);
        } catch (ParseException e) {
            sendResponse("Invalid input data", 400);
            return;
        }

        /* TODO: AUTHORIZE HERE */

        ///////////////
        if (login.login.equalsIgnoreCase("1@") && login.password.equalsIgnoreCase("1234"))
            sendResponse(JWT.createJWT("1", "store.com", "store/user", 3600000), 200);
        else
            sendResponse("Incorrect login or password", 403);
        ///////////////
    }
}