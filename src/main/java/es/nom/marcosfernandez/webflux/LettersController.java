package es.nom.marcosfernandez.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import static java.lang.Character.forDigit;
import static java.lang.Character.toChars;

@RestController
public class LettersController {

    private static final int RADIX = 10;

    @GetMapping(path = "/letters", produces = "text/event-stream")
    public Flux<Character> getLetters() {
        Flux<Character> letters = Flux.range(65,29).map(x->Character.valueOf((char)x.intValue()));

        System.out.println(letters.toString());

        letters.subscribe(x -> System.out.print(((char)x)));
        letters.subscribe(Subscriber::print);

        return letters;
    }

}
