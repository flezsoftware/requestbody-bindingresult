package pl.flez.requestbody;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.web.reactive.function.BodyInserters;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RequestbodyBindingresultApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	public void sampleTest() {
		SampleClass sample = new SampleClass();
		sample.setNumber(4);
		sample.setText("Some Not Blank Text");

		webTestClient.post().uri("/sample").body(BodyInserters.fromObject(sample)).exchange().expectStatus().isOk()
				.expectBody(Void.class).returnResult().getResponseBody();
	}

}
