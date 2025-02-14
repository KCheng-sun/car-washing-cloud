package org.dromara.resource.domain.bo;

import io.github.linpeilie.AutoMapperConfig;
import io.github.linpeilie.BaseMapper;
import org.dromara.resource.domain.SysOss;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(
    config = AutoMapperConfig.class,
    uses = {},
    imports = {}
)
public interface SysOssBoToSysOssMapper extends BaseMapper<SysOssBo, SysOss> {
  SysOss convert(SysOssBo source, @MappingTarget SysOss target);
}
