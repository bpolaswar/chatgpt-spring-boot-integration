package com.openai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseResponse{
	private String id;
	private String object;
	private Date creation;
	private String model;
	@JsonProperty("usage")
	private Usage usage;
}
