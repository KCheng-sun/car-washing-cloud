package org.dromara.resource.domain;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.resource.domain.vo.SysOssConfigVo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssConfigToSysOssConfigVoMapper extends BaseMapper<SysOssConfig, SysOssConfigVo> {
  SysOssConfigVo convert(SysOssConfig source, @MappingTarget SysOssConfigVo target);
}
