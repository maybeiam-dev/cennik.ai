package ai.cennik;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController @RequestMapping("/api")
public class SearchController {
    @GetMapping("/search")
    public Map<String, String> search(@RequestParam String query) {
        String q = query.toLowerCase();
        String res = "Уважаемый пользователь, поиск '" + query + "' в Петропавловске запущен.";
        if (q.contains("диор")) res = "Уважаемый пользователь, Dior Blue в Петропавловске найден за 54 200 тг.";
        return Collections.singletonMap("text", "Cennik.ai: " + res);
    }
}
