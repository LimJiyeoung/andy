package com.toystory.andy.domain.system.program.menu;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import com.toystory.andy.domain.system.program.menu.MenuDto.*;

@Service
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    public List<Response> findAll() {
        List<Menu> menus = menuRepository.findAll();
        return menus.stream().map(entity -> modelMapper.map(entity, Response.class))
                .collect(Collectors.toList());
    }
}
