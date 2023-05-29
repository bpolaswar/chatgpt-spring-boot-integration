package com.openai.controller;

import com.openai.service.GrammarCorrectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GrammerCorrectionController{

	@Autowired
	private GrammarCorrectionService grammarCorrectionService;

	@GetMapping("/get")
	public List<String> getContent(@RequestParam("prompt") String prompt){
		return grammarCorrectionService.getGrammarCorrectionContent(prompt);
	}
}
