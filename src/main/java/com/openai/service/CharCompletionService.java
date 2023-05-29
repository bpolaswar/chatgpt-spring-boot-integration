package com.openai.service;

import com.openai.dto.ChatCompletionRequest;
import com.openai.dto.ChatCompletionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

import static com.openai.constants.OpenAIConstants.CHAT_COMPLETION_MODEL;

@Service
public class CharCompletionService{
	@Autowired
	private RestTemplate restTemplate;
	@Value("${openai.chat.completion.url}")
	private String CHAT_COMPLETION_URL;

	public List<String> getChatCompletionContent(String prompt){
		ChatCompletionRequest request=new ChatCompletionRequest(CHAT_COMPLETION_MODEL, prompt);
		ChatCompletionResponse response = restTemplate.postForObject(CHAT_COMPLETION_URL, request, ChatCompletionResponse.class);
		return response.getChoicesList().stream().map(x->x.getMessage().getContent()).collect(Collectors.toList());
	}
}
