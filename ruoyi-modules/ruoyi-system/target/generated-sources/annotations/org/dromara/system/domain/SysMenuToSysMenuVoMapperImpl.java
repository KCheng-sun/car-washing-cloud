package org.dromara.system.domain;

import java.util.List;
import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysMenuVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysMenuToSysMenuVoMapperImpl implements SysMenuToSysMenuVoMapper {

    @Override
    public SysMenuVo convert(SysMenu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenuVo sysMenuVo = new SysMenuVo();

        sysMenuVo.setChildren( convert( arg0.getChildren() ) );
        sysMenuVo.setComponent( arg0.getComponent() );
        sysMenuVo.setCreateDept( arg0.getCreateDept() );
        sysMenuVo.setCreateTime( arg0.getCreateTime() );
        sysMenuVo.setIcon( arg0.getIcon() );
        sysMenuVo.setIsCache( arg0.getIsCache() );
        sysMenuVo.setIsFrame( arg0.getIsFrame() );
        sysMenuVo.setMenuId( arg0.getMenuId() );
        sysMenuVo.setMenuName( arg0.getMenuName() );
        sysMenuVo.setMenuType( arg0.getMenuType() );
        sysMenuVo.setOrderNum( arg0.getOrderNum() );
        sysMenuVo.setParentId( arg0.getParentId() );
        sysMenuVo.setPath( arg0.getPath() );
        sysMenuVo.setPerms( arg0.getPerms() );
        sysMenuVo.setQueryParam( arg0.getQueryParam() );
        sysMenuVo.setRemark( arg0.getRemark() );
        sysMenuVo.setStatus( arg0.getStatus() );
        sysMenuVo.setVisible( arg0.getVisible() );

        return sysMenuVo;
    }

    @Override
    public SysMenuVo convert(SysMenu source, SysMenuVo target) {
        if ( source == null ) {
            return target;
        }

        if ( target.getChildren() != null ) {
            List<SysMenuVo> list = convert( source.getChildren() );
            if ( list != null ) {
                target.getChildren().clear();
                target.getChildren().addAll( list );
            }
            else {
                target.setChildren( null );
            }
        }
        else {
            List<SysMenuVo> list = convert( source.getChildren() );
            if ( list != null ) {
                target.setChildren( list );
            }
        }
        target.setComponent( source.getComponent() );
        target.setCreateDept( source.getCreateDept() );
        target.setCreateTime( source.getCreateTime() );
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
