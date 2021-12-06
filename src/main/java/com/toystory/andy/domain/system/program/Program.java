package com.toystory.andy.domain.system.program;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@Table(name = "PROG_M")
public class Program {

    @Id
    @Column(name = "PROG_CD", length = 100, nullable = false)
    private String progCd;

    @Column(name = "URL", length = 50, nullable = false)
    private String url;

    @Column(name = "NAME", length = 50, nullable = false)
    private String name;

    @Column(name = "PROG_PATH", length = 255, nullable = false)
    private String progPath;
}
