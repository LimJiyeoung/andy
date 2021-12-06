package com.toystory.andy.utils;

import com.toystory.andy.domain.system.program.menu.Menu;
import com.toystory.andy.domain.system.program.menu.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final MenuRepository menuRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        menuRepository.save(Menu.builder().menuNm("home").build());
        menuRepository.save(Menu.builder().menuNm("home2").build());
        menuRepository.save(Menu.builder().menuNm("home3").build());
    }
}
