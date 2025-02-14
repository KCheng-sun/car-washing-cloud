package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysRoleVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysRoleToSysRoleVoMapperImpl implements SysRoleToSysRoleVoMapper {

    @Override
    public SysRoleVo convert(SysRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleVo sysRoleVo = new SysRoleVo();

        sysRoleVo.setCreateTime( arg0.getCreateTime() );
        sysRoleVo.setDataScope( arg0.getDataScope() );
        sysRoleVo.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRoleVo.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRoleVo.setRemark( arg0.getRemark() );
        sysRoleVo.setRoleId( arg0.getRoleId() );
        sysRoleVo.setRoleKey( arg0.getRoleKey() );
        sysRoleVo.setRoleName( arg0.getRoleName() );
        sysRoleVo.setRoleSort( arg0.getRoleSort() );
        sysRoleVo.setStatus( arg0.getStatus() );

        return sysRoleVo;
    }

    @Override
    public SysRoleVo convert(SysRole source, SysRoleVo target) {
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
