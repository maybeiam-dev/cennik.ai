package ai.cennik;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class SearchController {

    @GetMapping("/search")
    public Map<String, String> search(@RequestParam String query) {
        String q = query.toLowerCase().trim();
        String answer;

        // Имитация вежливого ИИ-ассистента
        if (q.isEmpty()) {
            answer = "Уважаемый пользователь, пожалуйста, введите название товара.";
        } else if (q.contains("диор") || q.contains("dior")) {
            answer = "Благодарю за запрос. В магазинах Петропавловска (Mon Amie) Dior Sauvage стоит от 54 200 тг. Желаете найти объемы побольше?";
        } else if (q.equals("хлеб")) {
            answer = "В Петропавловске найдено 12 видов хлеба. Самый дешевый — 'Семейный' за 110 тг в Магнуме. Вам нужен какой-то конкретный производитель?";
        } else {
            // Тут в будущем будет вызов Playwright для живого поиска
            answer = "Уважаемый пользователь, я ищу '" + query + "' в Магнуме, Смолле и Семейном г. Петропавловск. Пока что ориентировочная цена: 1 500 тг.";
        }

        return Collections.singletonMap("text", "Cennik.ai: " + answer);
    }
}
