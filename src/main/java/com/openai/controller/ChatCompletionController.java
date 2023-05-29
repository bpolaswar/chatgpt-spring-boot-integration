package com.openai.controller;

import com.openai.service.CharCompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChatCompletionController{

	@Autowired
	private CharCompletionService charCompletionService;

	@GetMapping("/chat-completion")
	public List<String> getContent2(@RequestParam("prompt") String prompt){
		return charCompletionService.getChatCompletionContent(prompt);
	}
}
