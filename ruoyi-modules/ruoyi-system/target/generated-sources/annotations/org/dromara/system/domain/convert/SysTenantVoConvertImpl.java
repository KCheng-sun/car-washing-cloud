package org.dromara.system.domain.convert;

import javax.annotation.processing.Generated;
import org.dromara.system.api.domain.vo.RemoteTenantVo;
import org.dromara.system.domain.vo.SysTenantVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-14T10:20:46+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.41.0.z20250115-2156, environment: Java 21.0.5 (Eclipse Adoptium)"
)
@Component
public class SysTenantVoConvertImpl implements SysTenantVoConvert {

    @Override
    public RemoteTenantVo convert(SysTenantVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        RemoteTenantVo remoteTenantVo = new RemoteTenantVo();

        remoteTenantVo.setAccountCount( arg0.getAccountCount() );
        remoteTenantVo.setAddress( arg0.getAddress() );
        remoteTenantVo.setCompanyName( arg0.getCompanyName() );
        remoteTenantVo.setContactPhone( arg0.getContactPhone() );
        remoteTenantVo.setContactUserName( arg0.getContactUserName() );
        remoteTenantVo.setDomain( arg0.getDomain() );
        remoteTenantVo.setExpireTime( arg0.getExpireTime() );
        remoteTenantVo.setId( arg0.getId() );
        remoteTenantVo.setIntro( arg0.getIntro() );
        remoteTenantVo.setLicenseNumber( arg0.getLicenseNumber() );
        remoteTenantVo.setPackageId( arg0.getPackageId() );
        remoteTenantVo.setRemark( arg0.getRemark() );
        remoteTenantVo.setStatus( arg0.getStatus() );
        remoteTenantVo.setTenantId( arg0.getTenantId() );

        return remoteTenantVo;
    }

    @Override
    public RemoteTenantVo convert(SysTenantVo arg0, RemoteTenantVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setAccountCount( arg0.getAccountCount() );
        arg1.setAddress( arg0.getAddress() );
        arg1.setCompanyName( arg0.getCompanyName() );
        arg1.setContactPhone( arg0.getContactPhone() );
        arg1.setContactUserName( arg0.getContactUserName() );
        arg1.setDomain( arg0.getDomain() );
        arg1.setExpireTime( arg0.getExpireTime() );
        arg1.setId( arg0.getId() );
        arg1.setIntro( arg0.getIntro() );
        arg1.setLicenseNumber( arg0.getLicenseNumber() );
        arg1.setPackageId( arg0.getPackageId() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setTenantId( arg0.getTenantId() );

        return arg1;
    }
}
