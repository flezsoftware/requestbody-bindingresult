package pl.flez.requestbody;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Setter;

import lombok.Getter;
@Getter
@Setter
public class SampleClass {

	@NotBlank
	private String text;
	
	@Max(value = 100)
	@Min(value = 0)
	private Integer number;
	
}
