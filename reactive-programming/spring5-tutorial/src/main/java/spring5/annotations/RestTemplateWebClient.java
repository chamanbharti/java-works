//package spring5.annotations;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import reactor.core.publisher.Mono;
//@RestController
//@RequestMapping("/serv1")
//@CrossOrigin("*")
//public class RestTemplateWebClient {
//
//	@Autowired(required=true)
//	RestTemplate restTemplate;
//
//	@GetMapping(value = "/restTemplate")
//	public ResponseEntity<?> getDataFromService2RestTemplate() {
//		System.out.println("Service1 Controller Called");
//		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:6060/serv2", String.class);
//		return ResponseEntity.ok().body("Recieved Message: " + responseEntity.getBody());
//	}
//
//	@GetMapping(value = "/webclient")
//	public ResponseEntity<?> getDataFromService2WebClient() {
//		Mono<String> message = WebClient.create("http://localhost:6060").get().uri(uriBuilder -> uriBuilder.path("/serv2").build()).retrieve()
//				.bodyToMono(String.class);
//		return ResponseEntity.ok().body("Recieved Message: " + message.block());
//	}
//	
//}