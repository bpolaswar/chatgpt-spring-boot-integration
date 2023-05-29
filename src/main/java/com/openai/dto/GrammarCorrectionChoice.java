package com.openai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrammarCorrectionChoice extends BaseChoice{
	private String text;
	private String logprobs;
	private Usage usage;
}
