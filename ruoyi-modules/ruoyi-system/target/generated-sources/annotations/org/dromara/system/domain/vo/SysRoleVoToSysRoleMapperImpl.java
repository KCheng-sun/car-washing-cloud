package org.dromara.system.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysRoleVoToSysRoleMapperImpl implements SysRoleVoToSysRoleMapper {

    @Override
    public SysRole convert(SysRoleVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setCreateTime( arg0.getCreateTime() );
        sysRole.setDataScope( arg0.getDataScope() );
        sysRole.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRole.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRole.setRemark( arg0.getRemark() );
        sysRole.setRoleId( arg0.getRoleId() );
        sysRole.setRoleKey( arg0.getRoleKey() );
        sysRole.setRoleName( arg0.getRoleName() );
        sysRole.setRoleSort( arg0.getRoleSort() );
        sysRole.setStatus( arg0.getStatus() );

        return sysRole;
    }

    @Override
    public SysRole convert(SysRoleVo source, SysRole target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateTime( source.getCreateTime() );
        target.setDataScope( source.getDataScope() );
        target.setDeptCheckStrictly( source.getDeptCheckStrictly() );
        target.setMenuCheckStrictly( source.getMenuCheckStrictly() );
        target.setRemark( source.getRemark() );
        target.setRoleId( source.getRoleId() );
        target.setRoleKey( source.getRoleKey() );
        target.setRoleName( source.getRoleName() );
        target.setRoleSort( source.getRoleSort() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
