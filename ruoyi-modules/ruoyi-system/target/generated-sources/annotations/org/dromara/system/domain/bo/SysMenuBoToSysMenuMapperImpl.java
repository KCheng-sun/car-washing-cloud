package org.dromara.system.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.SysMenu;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysMenuBoToSysMenuMapperImpl implements SysMenuBoToSysMenuMapper {

    @Override
    public SysMenu convert(SysMenuBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenu sysMenu = new SysMenu();

        sysMenu.setCreateBy( arg0.getCreateBy() );
        sysMenu.setCreateDept( arg0.getCreateDept() );
        sysMenu.setCreateTime( arg0.getCreateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            sysMenu.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        sysMenu.setSearchValue( arg0.getSearchValue() );
        sysMenu.setUpdateBy( arg0.getUpdateBy() );
        sysMenu.setUpdateTime( arg0.getUpdateTime() );
        sysMenu.setComponent( arg0.getComponent() );
        sysMenu.setIcon( arg0.getIcon() );
        sysMenu.setIsCache( arg0.getIsCache() );
        sysMenu.setIsFrame( arg0.getIsFrame() );
        sysMenu.setMenuId( arg0.getMenuId() );
        sysMenu.setMenuName( arg0.getMenuName() );
        sysMenu.setMenuType( arg0.getMenuType() );
        sysMenu.setOrderNum( arg0.getOrderNum() );
        sysMenu.setParentId( arg0.getParentId() );
        sysMenu.setPath( arg0.getPath() );
        sysMenu.setPerms( arg0.getPerms() );
        sysMenu.setQueryParam( arg0.getQueryParam() );
        sysMenu.setRemark( arg0.getRemark() );
        sysMenu.setStatus( arg0.getStatus() );
        sysMenu.setVisible( arg0.getVisible() );

        return sysMenu;
    }

    @Override
    public SysMenu convert(SysMenuBo source, SysMenu target) {
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
        target.setComponent( source.getComponent() );
        target.setIcon( source.getIcon() );
        target.setIsCache( source.getIsCache() );
        target.setIsFrame( source.getIsFrame() );
        target.setMenuId( source.getMenuId() );
        target.setMenuName( source.getMenuName() );
        target.setMenuType( source.getMenuType() );
        target.setOrderNum( source.getOrderNum() );
        target.setParentId( source.getParentId() );
        target.setPath( source.getPath() );
        target.setPerms( source.getPerms() );
        target.setQueryParam( source.getQueryParam() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );
        target.setVisible( source.getVisible() );

        return target;
    }
}
