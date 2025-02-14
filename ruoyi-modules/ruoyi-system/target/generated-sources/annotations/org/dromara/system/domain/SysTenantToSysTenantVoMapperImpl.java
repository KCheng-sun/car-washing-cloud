package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysTenantVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysTenantToSysTenantVoMapperImpl implements SysTenantToSysTenantVoMapper {

    @Override
    public SysTenantVo convert(SysTenant arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenantVo sysTenantVo = new SysTenantVo();

        sysTenantVo.setAccountCount( arg0.getAccountCount() );
        sysTenantVo.setAddress( arg0.getAddress() );
        sysTenantVo.setCompanyName( arg0.getCompanyName() );
        sysTenantVo.setContactPhone( arg0.getContactPhone() );
        sysTenantVo.setContactUserName( arg0.getContactUserName() );
        sysTenantVo.setDomain( arg0.getDomain() );
        sysTenantVo.setExpireTime( arg0.getExpireTime() );
        sysTenantVo.setId( arg0.getId() );
        sysTenantVo.setIntro( arg0.getIntro() );
        sysTenantVo.setLicenseNumber( arg0.getLicenseNumber() );
        sysTenantVo.setPackageId( arg0.getPackageId() );
        sysTenantVo.setRemark( arg0.getRemark() );
        sysTenantVo.setStatus( arg0.getStatus() );
        sysTenantVo.setTenantId( arg0.getTenantId() );

        return sysTenantVo;
    }

    @Override
    public SysTenantVo convert(SysTenant source, SysTenantVo target) {
        if ( source == null ) {
            return target;
        }

        target.setAccountCount( source.getAccountCount() );
        target.setAddress( source.getAddress() );
        target.setCompanyName( source.getCompanyName() );
        target.setContactPhone( source.getContactPhone() );
        target.setContactUserName( source.getContactUserName() );
        target.setDomain( source.getDomain() );
        target.setExpireTime( source.getExpireTime() );
        target.setId( source.getId() );
        target.setIntro( source.getIntro() );
        target.setLicenseNumber( source.getLicenseNumber() );
        target.setPackageId( source.getPackageId() );
        target.setRemark( source.getRemark() );
        target.setStatus( source.getStatus() );
        target.setTenantId( source.getTenantId() );

        return target;
    }
}
