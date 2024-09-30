package DevLewi.CryptoVase.service;

import DevLewi.CryptoVase.response.ApiResponse;

public interface ChatbotService {
    ApiResponse getCoinDetails(String prompt) throws Exception;

    String simpleChat(String prompt);
}
