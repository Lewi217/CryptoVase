package DevLewi.CryptoVase.controller;

import DevLewi.CryptoVase.dto.PromptBody;
import DevLewi.CryptoVase.response.ApiResponse;
import DevLewi.CryptoVase.service.ChatbotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ChatbotController {
    private final ChatbotService chatbotService;

    public ChatbotController(ChatbotService chatbotService){
        this.chatbotService = chatbotService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> getCoinDetails(@RequestBody PromptBody prompt) throws Exception {
        chatbotService.getCoinDetails(prompt.getPrompt());

        ApiResponse response = new ApiResponse();
        response.setMessage(prompt.getPrompt());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/simple")
    public ResponseEntity<ApiResponse> simpleChatHandler(@RequestBody PromptBody prompt) throws Exception {
        String response = chatbotService.simpleChat(prompt.getPrompt());

        ApiResponse response = new ApiResponse();
        response.setMessage(prompt.getPrompt());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
