package org.dromara.resource.domain.bo;

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
public interface SysOssConfigBoToSysOssConfigMapper extends BaseMapper<SysOssConfigBo, SysOssConfig> {
  SysOssConfig convert(SysOssConfigBo source, @MappingTarget SysOssConfig target);
}
