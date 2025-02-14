package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysTenantPackageVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:45+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysTenantPackageToSysTenantPackageVoMapperImpl implements SysTenantPackageToSysTenantPackageVoMapper {

    @Override
    public SysTenantPackageVo convert(SysTenantPackage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenantPackageVo sysTenantPackageVo = new SysTenantPackageVo();

        sysTenantPackageVo.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysTenantPackageVo.setMenuIds( arg0.getMenuIds() );
        sysTenantPackageVo.setPackageId( arg0.getPackageId() );
        sysTenantPackageVo.setPackageName( arg0.getPackageName() );
        sysTenantPackageVo.setRemark( arg0.getRemark() );
        sysTenantPackageVo.setStatus( arg0.getStatus() );

        return sysTenantPackageVo;
    }

    @Override
    public SysTenantPackageVo convert(SysTenantPackage source, SysTenantPackageVo target) {
        if ( source == null ) {
            return target;
        }

        target.setMenuCheckStrictly( source.getMenuCheckStrictly() );
        target.setMenuIds( source.getMenuIds() );
        target.setPackageId( source.getPackageId() );
        target.setPackageName( source.getPackageName() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );

        return target;
    }
}
