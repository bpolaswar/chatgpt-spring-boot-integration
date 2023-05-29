package com.openai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatCompletionResponse extends BaseResponse{
	@JsonProperty("choices")
	private List<ChatCompletionChoice> choicesList;
}
