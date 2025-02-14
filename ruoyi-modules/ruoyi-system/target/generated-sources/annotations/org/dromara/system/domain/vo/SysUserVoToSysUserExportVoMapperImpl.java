package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysUserVoToSysUserExportVoMapperImpl implements SysUserVoToSysUserExportVoMapper {

    @Override
    public SysUserExportVo convert(SysUserVo source) {
        if ( source == null ) {
            return null;
        }

        SysUserExportVo sysUserExportVo = new SysUserExportVo();

        sysUserExportVo.setDeptName( sourceDeptDeptName( source ) );
        sysUserExportVo.setLeaderName( sourceDeptLeaderName( source ) );
        sysUserExportVo.setEmail( source.getEmail() );
        sysUserExportVo.setLoginDate( source.getLoginDate() );
        sysUserExportVo.setLoginIp( source.getLoginIp() );
        sysUserExportVo.setNickName( source.getNickName() );
        sysUserExportVo.setPhonenumber( source.getPhonenumber() );
        sysUserExportVo.setSex( source.getSex() );
        sysUserExportVo.setStatus( source.getStatus() );
        sysUserExportVo.setUserId( source.getUserId() );
        sysUserExportVo.setUserName( source.getUserName() );

        return sysUserExportVo;
    }

    @Override
    public SysUserExportVo convert(SysUserVo source, SysUserExportVo target) {
        if ( source == null ) {
            return target;
        }

        target.setDeptName( sourceDeptDeptName( source ) );
        target.setLeaderName( sourceDeptLeaderName( source ) );
        target.setEmail( source.getEmail() );
        target.setLoginDate( source.getLoginDate() );
        target.setLoginIp( source.getLoginIp() );
        target.setNickName( source.getNickName() );
        target.setPhonenumber( source.getPhonenumber() );
        target.setSex( source.getSex() );
        target.setStatus( source.getStatus() );
        target.setUserId( source.getUserId() );
        target.setUserName( source.getUserName() );

        return target;
    }

    private String sourceDeptDeptName(SysUserVo sysUserVo) {
        if ( sysUserVo == null ) {
            return null;
        }
        SysDeptVo dept = sysUserVo.getDept();
        if ( dept == null ) {
            return null;
        }
        String deptName = dept.getDeptName();
        if ( deptName == null ) {
            return null;
        }
        return deptName;
    }

    private String sourceDeptLeaderName(SysUserVo sysUserVo) {
        if ( sysUserVo == null ) {
            return null;
        }
        SysDeptVo dept = sysUserVo.getDept();
        if ( dept == null ) {
            return null;
        }
        String leaderName = dept.getLeaderName();
        if ( leaderName == null ) {
            return null;
        }
        return leaderName;
    }
}
