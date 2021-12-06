package com.toystory.andy.domain.system.program.menu;

import lombok.Data;

public class MenuDto {

    @Data
    public static class Response {
        private Long menuId;

        private String menuNm;

        private String url;

        private Long parentId;

        private Integer level;

        private Integer sort;
    }
}
