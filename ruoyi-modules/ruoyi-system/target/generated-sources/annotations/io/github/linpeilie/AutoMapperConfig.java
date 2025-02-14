package io.github.linpeilie;

import org.dromara.system.domain.convert.SysClientVoConvert;
import org.dromara.system.domain.convert.SysDictDataVoConvert;
import org.dromara.system.domain.convert.SysLogininforBoConvert;
import org.dromara.system.domain.convert.SysOperLogBoConvert;
import org.dromara.system.domain.convert.SysSocialBoConvert;
import org.dromara.system.domain.convert.SysSocialVoConvert;
import org.dromara.system.domain.convert.SysTenantVoConvert;
import org.dromara.system.domain.convert.SysUserBoConvert;
import org.mapstruct.Builder;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
    componentModel = "spring",
    uses = {ConvertMapperAdapter.class, SysLogininforBoConvert.class, SysSocialBoConvert.class, SysTenantVoConvert.class, SysDictDataVoConvert.class, SysOperLogBoConvert.class, SysClientVoConvert.class, SysSocialVoConvert.class, SysUserBoConvert.class},
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL,
    builder = @Builder(buildMethod = "build", disableBuilder = true)
)
public interface AutoMapperConfig {
}
