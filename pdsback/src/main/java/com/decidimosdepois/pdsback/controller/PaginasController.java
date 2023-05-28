
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginasController {

    @GetMapping("/paginaInicial")
    public String exibirPaginaInicial() {
        return "paginaInicial.html"; // Nome do arquivo HTML da página inicial
    }


}
