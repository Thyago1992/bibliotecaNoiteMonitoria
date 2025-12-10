package br.com.fuctura.bibliotecaNoiteMonitoria.profiles;

import br.com.fuctura.bibliotecaNoiteMonitoria.services.DBService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevProfile {

    @Autowired
    private DBService dbService;

    @PostConstruct
    public void instanciaDB(){
        this.dbService.instanciaDB();
    }
}
