package abkucuk.springbootmicroservices.springbootmicroservices.bootstrap;

import abkucuk.springbootmicroservices.springbootmicroservices.domain.Beer;
import abkucuk.springbootmicroservices.springbootmicroservices.repositories.IBeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final IBeerRepository beerRepository;

    public BeerLoader(IBeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("myHardCoreBeerName")
                    .beerStyle("myHardCoreBeerStyle")
                    .quantityToBrew(200)
                    .upc(370010010101L)
                    .price(new BigDecimal("35.99"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("myHardCoreBeerName2")
                    .beerStyle("myHardCoreBeerStyle2")
                    .quantityToBrew(300)
                    .upc(370010010102L)
                    .price(new BigDecimal("45.99"))
                    .build());
        }
        System.out.println("loaded beers: " + beerRepository.count());
    }
}
