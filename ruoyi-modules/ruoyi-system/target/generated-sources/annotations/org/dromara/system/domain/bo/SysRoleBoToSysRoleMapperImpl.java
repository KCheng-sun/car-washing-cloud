package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysRole;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysRoleBoToSysRoleMapperImpl implements SysRoleBoToSysRoleMapper {

    @Override
    public SysRole convert(SysRoleBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setCreateBy( arg0.getCreateBy() );
        sysRole.setCreateDept( arg0.getCreateDept() );
        sysRole.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysRole.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysRole.setSearchValue( arg0.getSearchValue() );
        sysRole.setUpdateBy( arg0.getUpdateBy() );
        sysRole.setUpdateTime( arg0.getUpdateTime() );
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
    public SysRole convert(SysRoleBo source, SysRole target) {
        if ( source == null ) {
            return target;
        }

        target.setCreateBy( source.getCreateBy() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateTime( source.getCreateTime() );
        if ( target.getParams() != null ) {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.getParams().clear();
                target.getParams().putAll( map );
            }
            else {
                target.setParams( null );
            }
        }
        else {
            Map<String, Object> map = source.getParams();
            if ( map != null ) {
                target.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        target.setSearchValue( source.getSearchValue() );
        target.setUpdateBy( source.getUpdateBy() );
        target.setUpdateTime( source.getUpdateTime() );
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
