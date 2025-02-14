package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysUser;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysUserVoToSysUserMapperImpl implements SysUserVoToSysUserMapper {

    @Override
    public SysUser convert(SysUserVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setCreateTime( arg0.getCreateTime() );
        sysUser.setTenantId( arg0.getTenantId() );
        sysUser.setAvatar( arg0.getAvatar() );
        sysUser.setDeptId( arg0.getDeptId() );
        sysUser.setEmail( arg0.getEmail() );
        sysUser.setLoginDate( arg0.getLoginDate() );
        sysUser.setLoginIp( arg0.getLoginIp() );
        sysUser.setNickName( arg0.getNickName() );
        sysUser.setPassword( arg0.getPassword() );
        sysUser.setPhonenumber( arg0.getPhonenumber() );
        sysUser.setRemark( arg0.getRemark() );
        sysUser.setSex( arg0.getSex() );
        sysUser.setStatus( arg0.getStatus() );
        sysUser.setUserId( arg0.getUserId() );
        sysUser.setUserName( arg0.getUserName() );
        sysUser.setUserType( arg0.getUserType() );

        return sysUser;
    }

    @Override
    public SysUser convert(SysUserVo source, SysUser target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setTenantId( source.getTenantId() );
        target.setAvatar( source.getAvatar() );
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
        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );
        target.setUserType( source.getUserType() );

        return target;
    }
}
