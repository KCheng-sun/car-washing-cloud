package org.dromara.system.domain.convert;

import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.bo.RemoteUserBo;
import org.dromara.system.domain.bo.SysUserBo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysUserBoConvertImpl implements SysUserBoConvert {

    @Override
    public SysUserBo convert(RemoteUserBo arg0, SysUserBo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setDeptId( arg0.getDeptId() );
        arg1.setEmail( arg0.getEmail() );
        arg1.setNickName( arg0.getNickName() );
        arg1.setPassword( arg0.getPassword() );
        arg1.setPhonenumber( arg0.getPhonenumber() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setSex( arg0.getSex() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setUserName( arg0.getUserName() );
        arg1.setUserType( arg0.getUserType() );

        return arg1;
    }

    @Override
    public SysUserBo convert(RemoteUserBo remoteUserBo) {
        if ( remoteUserBo == null ) {
            return null;
        }

        SysUserBo sysUserBo = new SysUserBo();

        sysUserBo.setDeptId( remoteUserBo.getDeptId() );
        sysUserBo.setEmail( remoteUserBo.getEmail() );
        sysUserBo.setNickName( remoteUserBo.getNickName() );
        sysUserBo.setPassword( remoteUserBo.getPassword() );
        sysUserBo.setPhonenumber( remoteUserBo.getPhonenumber() );
        sysUserBo.setRemark( remoteUserBo.getRemark() );
        sysUserBo.setRoleId( remoteUserBo.getRoleId() );
        sysUserBo.setSex( remoteUserBo.getSex() );
        sysUserBo.setStatus( remoteUserBo.getStatus() );
        sysUserBo.setUserId( remoteUserBo.getUserId() );
        sysUserBo.setUserName( remoteUserBo.getUserName() );
        sysUserBo.setUserType( remoteUserBo.getUserType() );

        return sysUserBo;
    }
}
