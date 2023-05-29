package com.openai.service;

import com.openai.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

import static com.openai.constants.OpenAIConstants.*;

@Service
public class GrammarCorrectionService{

	@Autowired
	private RestTemplate restTemplate;
	@Value("${openai.grammar.correction.url}")
	private String GRAMMAR_CORRECTION_URL;

	public List<String> getGrammarCorrectionContent(String prompt){
		GrammarCorrectionRequest grammarCorrectionRequest = new GrammarCorrectionRequest(GRAMMAR_CORRECTION_MODEL, PROMPT_CONSTANT + prompt);
		GrammarCorrectionResponse grammarCorrectionResponse = restTemplate.postForObject(GRAMMAR_CORRECTION_URL, grammarCorrectionRequest, GrammarCorrectionResponse.class);
		return grammarCorrectionResponse.getChoicesList().stream().map(GrammarCorrectionChoice::getText).collect(Collectors.toList());
	}
}


