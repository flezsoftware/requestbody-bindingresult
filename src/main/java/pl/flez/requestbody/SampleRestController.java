package pl.flez.requestbody;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleRestController {

	@PostMapping
	void sampleRequest(@Valid @RequestBody SampleClass sampleClass, BindingResult result) {
		
	}
	
}
