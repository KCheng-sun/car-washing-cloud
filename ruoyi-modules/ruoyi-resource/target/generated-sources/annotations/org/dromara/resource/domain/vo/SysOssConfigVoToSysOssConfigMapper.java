package org.dromara.resource.domain.vo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.resource.domain.SysOssConfig;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssConfigVoToSysOssConfigMapper extends BaseMapper<SysOssConfigVo, SysOssConfig> {
  SysOssConfig convert(SysOssConfigVo source, @MappingTarget SysOssConfig target);
}
