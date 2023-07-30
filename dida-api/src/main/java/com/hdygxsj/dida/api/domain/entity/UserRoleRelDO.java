package com.hdygxsj.dida.api.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author hdygxsj
 * @since 2023-07-31
 */
@Getter
@Setter
@TableName("dida_user_role_rel")
@Schema(name = "UserRoleRelDO", description = "")
public class UserRoleRelDO implements Serializable {

    private static final long serialVersionUID = 1L;

      private String roleCode;

      private String username;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
