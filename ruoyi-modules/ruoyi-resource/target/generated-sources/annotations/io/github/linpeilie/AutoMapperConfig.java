package io.github.linpeilie;

import org.dromara.resource.domain.SysOssConfigToSysOssConfigVoMapper;
import org.dromara.resource.domain.SysOssToSysOssVoMapper;
import org.dromara.resource.domain.bo.SysOssBoToSysOssMapper;
import org.dromara.resource.domain.bo.SysOssConfigBoToSysOssConfigMapper;
import org.dromara.resource.domain.vo.SysOssConfigVoToSysOssConfigMapper;
import org.dromara.resource.domain.vo.SysOssVoToSysOssMapper;
import org.mapstruct.Builder;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
    componentModel = "spring",
    uses = {ConvertMapperAdapter.class, SysOssToSysOssVoMapper.class, SysOssVoToSysOssMapper.class, SysOssConfigVoToSysOssConfigMapper.class, SysOssConfigToSysOssConfigVoMapper.class, SysOssConfigBoToSysOssConfigMapper.class, SysOssBoToSysOssMapper.class},
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL,
    builder = @Builder(buildMethod = "build", disableBuilder = true)
)
public interface AutoMapperConfig {
}
