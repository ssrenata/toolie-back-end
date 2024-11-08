package com.toolie.back_end.config;

import com.toolie.back_end.ferramenta.Ferramenta;
import com.toolie.back_end.ferramenta.FerramentaRepository;
import com.toolie.back_end.usuario.Usuario;
import com.toolie.back_end.usuario.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class DevelopmentConfig {

    @Bean
    public CommandLineRunner dataLoader(UsuarioRepository usuarioRepository, FerramentaRepository ferramentaRepository) {
        return args -> {

            Usuario proprietario1 = new Usuario("João", "joao@gmail.com", "1234567890", "Endereço Proprietario", "fotoURL");
            Usuario proprietario2 = new Usuario("Yoel", "yoel@gmail.com", "12345678490", "Endereço Proprietario4", "fotoURL4");

            List<Usuario> usuarios = Arrays.asList(
                    proprietario1,
                    proprietario2,
                    new Usuario("Jorge", "jorge@gmail.com", "1234567890", "Endereço 1", "url1"),
                    new Usuario("Maria", "maria@gmail.com", "2345678901", "Endereço 2", "url2"),
                    new Usuario("Pedro", "pedro@gmail.com", "3456789012", "Endereço 3", "url3"),
                    new Usuario("Ana", "ana@gmail.com", "4567890123", "Endereço 4", "url4"),
                    new Usuario("Luis", "luis@gmail.com", "5678901234", "Endereço 5", "url5"),
                    new Usuario("Carlos", "carlos@gmail.com", "6789012345", "Endereço 6", "url6"),
                    new Usuario("Lucia", "lucia@gmail.com", "7890123456", "Endereço 7", "url7"),
                    new Usuario("Fernando", "fernando@gmail.com", "8901234567", "Endereço 8", "url8"),
                    new Usuario("Elena", "elena@gmail.com", "9012345678", "Endereço 9", "url9"),
                    new Usuario("Diego", "diego@gmail.com", "1234567891", "Endereço 10", "url10")
                    );

            usuarioRepository.saveAll(usuarios);

            List<Ferramenta> ferramentas = Arrays.asList(
                    new Ferramenta(
                            proprietario1,
                            "Martelo",
                            "Usado",
                            "Martelo de aço de 500g",
                            20,
                            "Disponível",
                            "Centro",
                            "fotosURL1",
                            "Condições adequadas",
                            "Retirada no local"
                    ),
                    new Ferramenta(
                            proprietario2,
                            "Chave de fenda",
                            "Novo",
                            "Chave de fenda Philips",
                            50,
                            "Indisponível",
                            "Zona Sul",
                            "fotosURL2",
                            "Condições novas",
                            "Entrega disponível"
                    )
            );

            ferramentaRepository.saveAll(ferramentas);
        };
    }

}
