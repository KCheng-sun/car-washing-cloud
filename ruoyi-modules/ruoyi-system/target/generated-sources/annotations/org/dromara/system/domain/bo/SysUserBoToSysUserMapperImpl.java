package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysUser;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysUserBoToSysUserMapperImpl implements SysUserBoToSysUserMapper {

    @Override
    public SysUser convert(SysUserBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setCreateBy( arg0.getCreateBy() );
        sysUser.setCreateDept( arg0.getCreateDept() );
        sysUser.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysUser.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysUser.setSearchValue( arg0.getSearchValue() );
        sysUser.setUpdateBy( arg0.getUpdateBy() );
        sysUser.setUpdateTime( arg0.getUpdateTime() );
        sysUser.setDeptId( arg0.getDeptId() );
        sysUser.setEmail( arg0.getEmail() );
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
    public SysUser convert(SysUserBo source, SysUser target) {
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
        target.setDeptId( source.getDeptId() );
        target.setEmail( source.getEmail() );
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
