package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysUserVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysUserToSysUserVoMapperImpl implements SysUserToSysUserVoMapper {

    @Override
    public SysUserVo convert(SysUser arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserVo sysUserVo = new SysUserVo();

        sysUserVo.setAvatar( arg0.getAvatar() );
        sysUserVo.setCreateTime( arg0.getCreateTime() );
        sysUserVo.setDeptId( arg0.getDeptId() );
        sysUserVo.setEmail( arg0.getEmail() );
        sysUserVo.setLoginDate( arg0.getLoginDate() );
        sysUserVo.setLoginIp( arg0.getLoginIp() );
        sysUserVo.setNickName( arg0.getNickName() );
        sysUserVo.setPassword( arg0.getPassword() );
        sysUserVo.setPhonenumber( arg0.getPhonenumber() );
        sysUserVo.setRemark( arg0.getRemark() );
        sysUserVo.setSex( arg0.getSex() );
        sysUserVo.setStatus( arg0.getStatus() );
        sysUserVo.setTenantId( arg0.getTenantId() );
        sysUserVo.setUserId( arg0.getUserId() );
        sysUserVo.setUserName( arg0.getUserName() );
        sysUserVo.setUserType( arg0.getUserType() );

        return sysUserVo;
    }

    @Override
    public SysUserVo convert(SysUser source, SysUserVo target) {
        if ( source == null ) {
            return target;
        }

        target.setAvatar( source.getAvatar() );
        target.setCreateTime( source.getCreateTime() );
        target.setDeptId( source.getDeptId() );
        target.setEmail( source.getEmail() );
        target.setLoginDate( source.getLoginDate() );
        target.setLoginIp( source.getLoginIp() );
        target.setNickName( source.getNickName() );
        target.setPassword( source.getPassword() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setRemark( source.getRemark() );
        target.setSex( source.getSex() );
        target.setStatus( source.getStatus() );
        target.setTenantId( source.getTenantId() );
        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );
        target.setUserType( source.getUserType() );

        return target;
    }
}
