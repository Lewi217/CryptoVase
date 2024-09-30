package DevLewi.CryptoVase.controller;

import DevLewi.CryptoVase.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public ResponseEntity<ApiResponse> Home(){

        ApiResponse response = new ApiResponse();
        response.setMessage("Welcome to ai chatbot");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
