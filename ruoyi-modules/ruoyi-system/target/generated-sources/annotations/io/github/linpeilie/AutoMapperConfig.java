package io.github.linpeilie;

import org.dromara.common.log.event.OperLogEventToSysOperLogBoMapper;
import org.dromara.system.domain.SysClientToSysClientVoMapper;
import org.dromara.system.domain.SysConfigToSysConfigVoMapper;
import org.dromara.system.domain.SysDeptToSysDeptVoMapper;
import org.dromara.system.domain.SysDictDataToSysDictDataVoMapper;
import org.dromara.system.domain.SysDictTypeToSysDictTypeVoMapper;
import org.dromara.system.domain.SysLogininforToSysLogininforVoMapper;
import org.dromara.system.domain.SysMenuToSysMenuVoMapper;
import org.dromara.system.domain.SysNoticeToSysNoticeVoMapper;
import org.dromara.system.domain.SysOperLogToSysOperLogVoMapper;
import org.dromara.system.domain.SysPostToSysPostVoMapper;
import org.dromara.system.domain.SysRoleToSysRoleVoMapper;
import org.dromara.system.domain.SysSocialToSysSocialVoMapper;
import org.dromara.system.domain.SysTenantPackageToSysTenantPackageVoMapper;
import org.dromara.system.domain.SysTenantToSysTenantVoMapper;
import org.dromara.system.domain.SysUserToSysUserVoMapper;
import org.dromara.system.domain.bo.SysClientBoToSysClientMapper;
import org.dromara.system.domain.bo.SysConfigBoToSysConfigMapper;
import org.dromara.system.domain.bo.SysDeptBoToSysDeptMapper;
import org.dromara.system.domain.bo.SysDictDataBoToSysDictDataMapper;
import org.dromara.system.domain.bo.SysDictTypeBoToSysDictTypeMapper;
import org.dromara.system.domain.bo.SysLogininforBoToSysLogininforMapper;
import org.dromara.system.domain.bo.SysMenuBoToSysMenuMapper;
import org.dromara.system.domain.bo.SysNoticeBoToSysNoticeMapper;
import org.dromara.system.domain.bo.SysOperLogBoToOperLogEventMapper;
import org.dromara.system.domain.bo.SysOperLogBoToSysOperLogMapper;
import org.dromara.system.domain.bo.SysPostBoToSysPostMapper;
import org.dromara.system.domain.bo.SysRoleBoToSysRoleMapper;
import org.dromara.system.domain.bo.SysSocialBoToSysSocialMapper;
import org.dromara.system.domain.bo.SysTenantBoToSysTenantMapper;
import org.dromara.system.domain.bo.SysTenantPackageBoToSysTenantPackageMapper;
import org.dromara.system.domain.bo.SysUserBoToSysUserMapper;
import org.dromara.system.domain.convert.SysClientVoConvert;
import org.dromara.system.domain.convert.SysDictDataVoConvert;
import org.dromara.system.domain.convert.SysLogininforBoConvert;
import org.dromara.system.domain.convert.SysOperLogBoConvert;
import org.dromara.system.domain.convert.SysSocialBoConvert;
import org.dromara.system.domain.convert.SysSocialVoConvert;
import org.dromara.system.domain.convert.SysTenantVoConvert;
import org.dromara.system.domain.convert.SysUserBoConvert;
import org.dromara.system.domain.vo.SysClientVoToSysClientMapper;
import org.dromara.system.domain.vo.SysConfigVoToSysConfigMapper;
import org.dromara.system.domain.vo.SysDeptVoToSysDeptMapper;
import org.dromara.system.domain.vo.SysDictDataVoToSysDictDataMapper;
import org.dromara.system.domain.vo.SysDictTypeVoToSysDictTypeMapper;
import org.dromara.system.domain.vo.SysLogininforVoToSysLogininforMapper;
import org.dromara.system.domain.vo.SysMenuVoToSysMenuMapper;
import org.dromara.system.domain.vo.SysNoticeVoToSysNoticeMapper;
import org.dromara.system.domain.vo.SysOperLogVoToSysOperLogMapper;
import org.dromara.system.domain.vo.SysPostVoToSysPostMapper;
import org.dromara.system.domain.vo.SysRoleVoToSysRoleMapper;
import org.dromara.system.domain.vo.SysSocialVoToSysSocialMapper;
import org.dromara.system.domain.vo.SysTenantPackageVoToSysTenantPackageMapper;
import org.dromara.system.domain.vo.SysTenantVoToSysTenantMapper;
import org.dromara.system.domain.vo.SysUserVoToSysUserExportVoMapper;
import org.dromara.system.domain.vo.SysUserVoToSysUserMapper;
import org.mapstruct.Builder;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
    componentModel = "spring",
    uses = {ConvertMapperAdapter.class, SysSocialVoToSysSocialMapper.class, SysDictDataVoToSysDictDataMapper.class, SysLogininforVoToSysLogininforMapper.class, SysConfigBoToSysConfigMapper.class, SysTenantPackageToSysTenantPackageVoMapper.class, SysPostBoToSysPostMapper.class, SysClientVoConvert.class, SysUserToSysUserVoMapper.class, SysDictTypeVoToSysDictTypeMapper.class, SysSocialVoConvert.class, SysDictDataToSysDictDataVoMapper.class, SysUserBoConvert.class, SysMenuBoToSysMenuMapper.class, SysRoleVoToSysRoleMapper.class, SysConfigToSysConfigVoMapper.class, SysOperLogBoToOperLogEventMapper.class, SysClientVoToSysClientMapper.class, SysNoticeVoToSysNoticeMapper.class, SysDeptBoToSysDeptMapper.class, SysMenuVoToSysMenuMapper.class, SysMenuToSysMenuVoMapper.class, SysTenantVoToSysTenantMapper.class, SysUserBoToSysUserMapper.class, SysLogininforBoConvert.class, SysClientBoToSysClientMapper.class, SysDictDataBoToSysDictDataMapper.class, SysUserVoToSysUserMapper.class, SysClientToSysClientVoMapper.class, SysNoticeToSysNoticeVoMapper.class, SysTenantVoConvert.class, SysDictDataVoConvert.class, SysOperLogToSysOperLogVoMapper.class, SysLogininforBoToSysLogininforMapper.class, SysOperLogBoConvert.class, SysDeptVoToSysDeptMapper.class, SysTenantToSysTenantVoMapper.class, SysConfigVoToSysConfigMapper.class, SysSocialBoToSysSocialMapper.class, SysRoleBoToSysRoleMapper.class, SysDictTypeToSysDictTypeVoMapper.class, SysRoleToSysRoleVoMapper.class, SysTenantPackageVoToSysTenantPackageMapper.class, SysTenantBoToSysTenantMapper.class, SysSocialBoConvert.class, SysTenantPackageBoToSysTenantPackageMapper.class, SysLogininforToSysLogininforVoMapper.class, SysPostVoToSysPostMapper.class, SysSocialToSysSocialVoMapper.class, SysDictTypeBoToSysDictTypeMapper.class, OperLogEventToSysOperLogBoMapper.class, SysUserVoToSysUserExportVoMapper.class, SysOperLogBoToSysOperLogMapper.class, SysOperLogVoToSysOperLogMapper.class, SysDeptToSysDeptVoMapper.class, SysNoticeBoToSysNoticeMapper.class, SysPostToSysPostVoMapper.class},
    unmappedSourcePolicy = ReportingPolicy.IGNORE,
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL,
    builder = @Builder(buildMethod = "build", disableBuilder = true)
)
public interface AutoMapperConfig {
}
