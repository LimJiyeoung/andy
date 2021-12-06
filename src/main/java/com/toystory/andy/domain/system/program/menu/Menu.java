package com.toystory.andy.domain.system.program.menu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Entity
@Builder
@DynamicInsert
@DynamicUpdate
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MENU_M")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MENU_ID")
    private Long menuId;

    @Column(name = "MENU_NM", nullable = false, length = 50)
    private String menuNm;

    @Column(name = "PARENT_ID", nullable = true)
    private Long parentId;

    @Column(name = "LEVEL")
    @ColumnDefault("0")
    private Integer level;

    @Column(name = "SORT")
    @ColumnDefault("0")
    private Integer sort;

    @Column(name = "COMPONENT_CD", length = 100)
    private String componentCd;
}
